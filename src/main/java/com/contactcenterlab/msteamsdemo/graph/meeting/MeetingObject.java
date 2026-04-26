package com.contactcenterlab.msteamsdemo.graph.meeting;

import java.util.Date;
import java.util.List;

public class MeetingObject {	
    private String id;
    private Date creationDateTime;
    private Date startDateTime;
    private Date endDateTime;
    private String joinUrl;
    private String joinWebUrl;
    private String subject;
    private Boolean isBroadcast;
    private String autoAdmittedUsers;    
    private Boolean isEntryExitAnnounced;
    private String allowedPresenters;
    private Participants participants;
    private LobbyBypassSettings lobbyBypassSettings;
    private AudioConferencing audioConferencing;
    private ChatInfo chatInfo;
    private JoinInformation joinInformation;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(Date creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

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

	public String getJoinUrl() {
		return joinUrl;
	}

	public void setJoinUrl(String joinUrl) {
		this.joinUrl = joinUrl;
	}

	public String getJoinWebUrl() {
		return joinWebUrl;
	}

	public void setJoinWebUrl(String joinWebUrl) {
		this.joinWebUrl = joinWebUrl;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Boolean getIsBroadcast() {
		return isBroadcast;
	}

	public void setIsBroadcast(Boolean isBroadcast) {
		this.isBroadcast = isBroadcast;
	}

	public String getAutoAdmittedUsers() {
		return autoAdmittedUsers;
	}

	public void setAutoAdmittedUsers(String autoAdmittedUsers) {
		this.autoAdmittedUsers = autoAdmittedUsers;
	}

	public Boolean getIsEntryExitAnnounced() {
		return isEntryExitAnnounced;
	}

	public void setIsEntryExitAnnounced(Boolean isEntryExitAnnounced) {
		this.isEntryExitAnnounced = isEntryExitAnnounced;
	}

	public String getAllowedPresenters() {
		return allowedPresenters;
	}

	public void setAllowedPresenters(String allowedPresenters) {
		this.allowedPresenters = allowedPresenters;
	}

	public Participants getParticipants() {
		return participants;
	}

	public void setParticipants(Participants participants) {
		this.participants = participants;
	}

	public LobbyBypassSettings getLobbyBypassSettings() {
		return lobbyBypassSettings;
	}

	public void setLobbyBypassSettings(LobbyBypassSettings lobbyBypassSettings) {
		this.lobbyBypassSettings = lobbyBypassSettings;
	}

	public AudioConferencing getAudioConferencing() {
		return audioConferencing;
	}

	public void setAudioConferencing(AudioConferencing audioConferencing) {
		this.audioConferencing = audioConferencing;
	}

	public ChatInfo getChatInfo() {
		return chatInfo;
	}

	public void setChatInfo(ChatInfo chatInfo) {
		this.chatInfo = chatInfo;
	}

	public JoinInformation getJoinInformation() {
		return joinInformation;
	}

	public void setJoinInformation(JoinInformation joinInformation) {
		this.joinInformation = joinInformation;
	}	
	
	
}















