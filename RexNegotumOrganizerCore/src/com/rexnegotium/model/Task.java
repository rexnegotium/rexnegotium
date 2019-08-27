package com.rexnegotium.model;

import java.time.LocalDateTime;
import java.util.List;

public class Task {
	
    private String name;
    private String note;
    private List context;
    private LocalDateTime beginDateTime;
    private LocalDateTime endDateTime;
    private boolean completed;
    private boolean isFavourite;
    private User user;
  //private Project project;
    
    public Task() {
    		
    }
    	
    	
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private String getNote() {
		return note;
	}
	private void setNote(String note) {
		this.note = note;
	}
	private List getContext() {
		return context;
	}
	private void setContext(List context) {
		this.context = context;
	}
	private LocalDateTime getBegindatetime() {
		return beginDateTime;
	}
	private void setBegindatetime(LocalDateTime beginDateTime) {
		this.beginDateTime = beginDateTime;
	}
	private LocalDateTime getEnddatetime() {
		return endDateTime;
	}
	private void setEnddatetime(LocalDateTime endDateTime) {
		this.endDateTime = endDateTime;
	}
	private boolean isCompleted() {
		return completed;
	}
	private void setCompleted(boolean completed) {
		this.completed = completed;
	}
	private boolean isFavourite() {
		return isFavourite;
	}
	private void setFavourite(boolean isFavourite) {
		this.isFavourite = isFavourite;
	}
	private User getUser() {
		return user;
	}
	private void setUser(User user) {
		this.user = user;
	}
    
}