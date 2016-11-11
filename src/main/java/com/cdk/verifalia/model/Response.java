package com.cdk.verifalia.model;

import java.util.List;

public class Response {

	private String uniqueID;
	private String engineVersion;
	private String submittedOn;
	private String completedOn;
	private List<Entry> entries;
	private Progress progress;
	public String getUniqueID() {
		return uniqueID;
	}
	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}
	public String getEngineVersion() {
		return engineVersion;
	}
	public void setEngineVersion(String engineVersion) {
		this.engineVersion = engineVersion;
	}
	public String getSubmittedOn() {
		return submittedOn;
	}
	public void setSubmittedOn(String submittedOn) {
		this.submittedOn = submittedOn;
	}
	public String getCompletedOn() {
		return completedOn;
	}
	public void setCompletedOn(String completedOn) {
		this.completedOn = completedOn;
	}
	public List<Entry> getEntries() {
		return entries;
	}
	public void setEntries(List<Entry> entries) {
		this.entries = entries;
	}
	public Progress getProgress() {
		return progress;
	}
	public void setProgress(Progress progress) {
		this.progress = progress;
	}
	
	
	
	
}
