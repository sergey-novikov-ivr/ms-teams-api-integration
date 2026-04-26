package com.contactcenterlab.msteamsdemo.graph.meeting;

public class LobbyBypassSettings{
    private String scope;
    private Boolean isDialInBypassEnabled;

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public Boolean getIsDialInBypassEnabled() {
		return isDialInBypassEnabled;
	}

	public void setIsDialInBypassEnabled(Boolean isDialInBypassEnabled) {
		this.isDialInBypassEnabled = isDialInBypassEnabled;
	}	
	
}

