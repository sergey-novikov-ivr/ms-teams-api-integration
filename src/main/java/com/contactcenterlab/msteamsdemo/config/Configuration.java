package com.contactcenterlab.msteamsdemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("application.graphapi")
public class Configuration {
	
        @Value("${application.graphapi.auth_endpoint}")
	private String auth_endpoint;
        @Value("${application.graphapi.createMeeting_endpoint}")        
	private String createMeeting_endpoint;
	
	private String tenant;
	private String client_id;
	private String client_secret;
	private String username;
	private String password;

	public String getAuth_endpoint() {
		return auth_endpoint;
	}

	public void setAuth_endpoint(String auth_endpoint) {
		this.auth_endpoint = auth_endpoint;
	}

	public String getCreateMeeting_endpoint() {
		return createMeeting_endpoint;
	}

	public void setCreateMeeting_endpoint(String createMeeting_endpoint) {
		this.createMeeting_endpoint = createMeeting_endpoint;
	}
	
	public String getTenant() {
		return tenant;
	}

	public void setTenant(String tenant) {
		this.tenant = tenant;
	}
	
	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getClient_secret() {
		return client_secret;
	}

	public void setClient_secret(String client_secret) {
		this.client_secret = client_secret;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
