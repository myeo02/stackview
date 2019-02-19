package com.cantina.stackview;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

public class ViewHandler {
	private String fileName = "data.json";
	Gson gson = new GsonBuilder().create();

	enum Search{CLASS, CLASSNAME, IDENTIFIER};

	public ViewHandler() {
	}

	public SystemView readViewData() throws IOException {
		SystemView view = null;
		JsonReader reader = null;
		try {
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
			reader = new JsonReader(new InputStreamReader(inputStream, "UTF-8"));
			view = gson.fromJson(reader, SystemView.class);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				reader.close();
			}
		}
		return view;
	}

	public void printData(String data, SystemView view) {
		if (data == null || data.trim().isEmpty()) {
			return;
		}
		if (data.startsWith(".")) {
			//print view(s) contain className
			printView(new Query(data.substring(1), Search.CLASSNAME), view);
		} else if(data.startsWith("#")) {
			//print view(s) contain identifier
			printView(new Query(data.substring(1), Search.IDENTIFIER), view);
		} else {
			//print view(s)
			printView(new Query(data, Search.CLASS), view);
		}
	}

	private void printView(Query query, SystemView view) {
		if (view == null) {
			System.out.println("No view data");
		}
		if (query.getSearch() == Search.IDENTIFIER && query.getInput().equals("System")) {
			System.out.println(gson.toJson(view));
			return;
		}
		List<Subviews> list = view.getSubviews();
		//Top Level
		List<Subviews> targetView = getViews(query, list);
		if (targetView.isEmpty()) {
			return;
		}
		targetView.forEach(
				Subviews ->{
					System.out.println(gson.toJson(Subviews));
				}
		);
	}

	private List<Subviews> getViews(Query query, List<Subviews> sourceViews) {
		if (sourceViews == null || sourceViews.isEmpty()) {
			return new ArrayList<>();
		}
		List<Subviews> targetViews = new ArrayList<>();
		for(Subviews aSubview: sourceViews) {
			targetViews.addAll(getViews(query, aSubview.getSubviewsList()));
			ContentView contentView = aSubview.getContentView();
			if (contentView != null) {
				targetViews.addAll(getViews(query, contentView.getSubviewList()));
			}
		}
		List<Subviews> filteredList = new ArrayList<>();
		switch (query.getSearch()) {
			case CLASS:
				filteredList = findClass(query.getInput(), sourceViews);
				break;
			case CLASSNAME:
				filteredList = findClassName(query.getInput(), sourceViews);
				break;
			case IDENTIFIER:
				filteredList = findIdentifier(query.getInput(), sourceViews);
				break;
			default:
				break;
		}
		targetViews.addAll(filteredList);

		return targetViews;
	}

	private List<Subviews> findClass(String aClass, List<Subviews> sourceViews) {
		return sourceViews.stream().filter(
				s-> s.getClazz().equals(aClass) || (s.getControl() != null && s.getControl().getClazz().equals(aClass)))
			.collect(Collectors.toList());
	}

	private List<Subviews> findClassName(String aClassName, List<Subviews> sourceViews) {
		return sourceViews.stream().filter(
					s-> s.getClazzName() != null && s.getClazzName().stream().anyMatch(a->a.equals(aClassName)))
				.collect(Collectors.toList());
	}

	private List<Subviews> findIdentifier(String aIdentifier, List<Subviews> sourceViews) {
		return sourceViews.stream().filter(s->
				aIdentifier.equals(s.getIdentifier()) || (s.getControl()!=null && aIdentifier.equals(s.getControl().getIdentifier())))
				.collect(Collectors.toList());
	}
}
