package com.cantina.stackview;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ContentView {

	@SerializedName("subviews")
	private List<Subviews> subviewList;

	public List<Subviews> getSubviewList() {
		return subviewList;
	}

	public void setSubviewList(List<Subviews> subviewList) {
		this.subviewList = subviewList;
	}
}
