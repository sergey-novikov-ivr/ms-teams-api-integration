package com.contactcenterlab.msteamsdemo.graph.meeting;

public class User {	
    private String id;
    private String tenantId;
    private String identityProvider;	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getIdentityProvider() {
		return identityProvider;
	}

	public void setIdentityProvider(String identityProvider) {
		this.identityProvider = identityProvider;
	}	
	
}
