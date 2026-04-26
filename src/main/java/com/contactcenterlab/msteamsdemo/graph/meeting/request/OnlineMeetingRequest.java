package com.contactcenterlab.msteamsdemo.graph.meeting.request;

import java.util.Date;

public class OnlineMeetingRequest {
	
	private Date startDateTime;
	private Date endDateTime;
	private String subject;	

	public Date getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	public Date getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}	
	
}
