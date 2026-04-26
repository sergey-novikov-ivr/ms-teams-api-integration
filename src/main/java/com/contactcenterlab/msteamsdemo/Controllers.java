package com.contactcenterlab.msteamsdemo;

import com.contactcenterlab.msteamsdemo.config.Configuration;
import com.contactcenterlab.msteamsdemo.graph.meeting.MeetingObject;
import com.contactcenterlab.msteamsdemo.graph.meeting.request.OnlineMeetingRequest;
import com.contactcenterlab.msteamsdemo.storage.MeetingStorageController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Controllers {
	
    @Autowired private Configuration config;
    @Autowired private Meeting meeting;
    @Autowired private MeetingStorageController meetingStorageController;

    @GetMapping("/test")
    public String getTestData() {
        return "TEST";
    }
	
    @GetMapping("/")
    public String getMeetings(Model model) {
        model.addAttribute("meetings", new OnlineMeetingRequest());
        model.addAttribute("meetings_list", meetingStorageController.getMeetings());		
        return "index";
    }
	
    @PostMapping("/")
    public String addMeetings(@ModelAttribute OnlineMeetingRequest meetingRequest, Model model) {
        model.addAttribute("meetings", meetingRequest);
        MeetingObject meetingObject = meeting.createMeeting(meetingRequest);
        meetingStorageController.getMeetings().add(meetingObject);
        model.addAttribute("meetings_list", meetingStorageController.getMeetings());
        return "index";
    }
	
    @InitBinder
    private void dateBinder(WebDataBinder binder) {		
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");		
        CustomDateEditor editor = new CustomDateEditor(dateFormat, true);		
        binder.registerCustomEditor(Date.class, editor);
    }
	
}
