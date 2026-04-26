package com.contactcenterlab.msteamsdemo.storage;

import com.contactcenterlab.msteamsdemo.graph.meeting.MeetingObject;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class MeetingStorageController {
	
	private List<MeetingObject> meetings = new ArrayList<>();

	public List<MeetingObject> getMeetings() {
		return meetings;
	}

	public void setMeetings(List<MeetingObject> meetings) {
		this.meetings = meetings;
	}	
	
}
