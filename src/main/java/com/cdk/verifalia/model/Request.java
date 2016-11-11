package com.cdk.verifalia.model;

import java.util.List;

public class Request {
	
	private List<RequestEntry> entries;
	private String quality;
	public List<RequestEntry> getEntries() {
		return entries;
	}
	public void setEntries(List<RequestEntry> entries) {
		this.entries = entries;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}

	
	
}
