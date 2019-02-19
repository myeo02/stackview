package com.cantina.stackview;

import com.google.gson.annotations.SerializedName;

public class Control {

	@SerializedName("class")
	private String clazz;

	@SerializedName("identifier")
	private String identifier;

	@SerializedName("var")
	private String var;

	@SerializedName("min")
	private String min;

	@SerializedName("max")
	private String max;

	@SerializedName("step")
	private String step;

	@SerializedName("expectsStringValue")
	private Boolean expectsStringValue;

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getVar() {
		return var;
	}

	public void setVar(String var) {
		this.var = var;
	}

	public String getMin() {
		return min;
	}

	public void setMin(String min) {
		this.min = min;
	}

	public String getMax() {
		return max;
	}

	public void setMax(String max) {
		this.max = max;
	}

	public String getStep() {
		return step;
	}

	public void setStep(String step) {
		this.step = step;
	}

	public Boolean getExpectsStringValue() {
		return expectsStringValue;
	}

	public void setExpectsStringValue(Boolean expectsStringValue) {
		this.expectsStringValue = expectsStringValue;
	}
}
