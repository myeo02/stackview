package com.cantina.stackview;

public class Query {

	private String input;
	private ViewHandler.Search search;

	public Query(String input, ViewHandler.Search search) {
		this.input = input;
		this.search = search;
	}

	public String getInput() {
		return input;
	}

	public ViewHandler.Search getSearch() {
		return search;
	}
}
