package com.cantina.stackview;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Subviews {

	@SerializedName("class")
	private String clazz;

	@SerializedName("classNames")
	private List<String> clazzName;

	@SerializedName("subviews")
	private List<Subviews> subviewsList;

	@SerializedName("identifier")
	private String identifier;

	@SerializedName("contentView")
	private ContentView contentView;

	@SerializedName("control")
	private Control control;

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public List<String> getClazzName() {
		return clazzName;
	}

	public void setClazzName(List<String> clazzName) {
		this.clazzName = clazzName;
	}

	public List<Subviews> getSubviewsList() {
		return subviewsList;
	}

	public void setSubviewsList(List<Subviews> subviewsList) {
		this.subviewsList = subviewsList;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public ContentView getContentView() {
		return contentView;
	}

	public void setContentView(ContentView contentView) {
		this.contentView = contentView;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}
}
