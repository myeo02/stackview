package com.cantina.stackview;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class SystemView {

	@SerializedName("identifier")
	private String identifier;

	@SerializedName("subviews")
	private List<Subviews> subviews;

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public List<Subviews> getSubviews() {
		return subviews;
	}

	public void setSubviews(List<Subviews> subviews) {
		this.subviews = subviews;
	}
}
