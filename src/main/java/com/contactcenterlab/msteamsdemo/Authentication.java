package com.contactcenterlab.msteamsdemo;

import com.contactcenterlab.msteamsdemo.config.Configuration;
import com.contactcenterlab.msteamsdemo.graph.Token;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Component
public class Authentication {
	
	@Autowired private Configuration config;
	
	List<String> SCOPES = new ArrayList<String>(){{add("user.read openid profile offline_access");}};
	private Token currentToken;	
	
	public Token getToken() {
		return currentToken;
	}
	
        @PostConstruct
        private void init() {
            refreshToken();
        }
	
	@Scheduled(fixedDelay = 30 * 60 * 1000)
	private void refreshToken() {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
            MultiValueMap<String, String> requestBody = new LinkedMultiValueMap<>();
            requestBody.add("client_id", config.getClient_id());
            requestBody.add("client_secret", config.getClient_secret());
            requestBody.add("grant_type", "client_credentials");
            requestBody.add("scope", "https://graph.microsoft.com/.default");
            HttpEntity<MultiValueMap<String, String>> formEntity = new HttpEntity<>(requestBody, headers);
            this.currentToken = restTemplate.postForObject(
                    config.getAuth_endpoint(),
                    formEntity,
                    Token.class
            );
            System.out.println("Date: " + new Date());
            System.out.println("New access token received");
        }	
	
}
