package com.contactcenterlab.msteamsdemo;

import com.contactcenterlab.msteamsdemo.config.Configuration;
import com.contactcenterlab.msteamsdemo.graph.meeting.MeetingObject;
import com.contactcenterlab.msteamsdemo.graph.meeting.request.OnlineMeetingRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Meeting {
	
    @Autowired private Configuration config;
    @Autowired private Authentication authentication;

    private static String DATE_FORMAT = "yyyy-MM-dd'T'hh:mm:ss.SSSXXX";

    public MeetingObject createMeeting(OnlineMeetingRequest onlineMeetingRequest) {
        Gson gson = new GsonBuilder().setDateFormat(DATE_FORMAT).create();
        RestTemplate restTemplate = new RestTemplate();		
        System.out.println(new Gson().toJson(onlineMeetingRequest));
        HttpEntity<String> request = new HttpEntity<String>(gson.toJson(onlineMeetingRequest), getHeaders());
        return restTemplate.postForObject(config.getCreateMeeting_endpoint(), request, MeetingObject.class);		
    }

    private HttpHeaders getHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Bearer " + authentication.getToken().getAccess_token());
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }
}
