package com.rexnegotium.model;

import java.time.LocalDateTime;
import java.util.List;

public class Task {
	
    private String name;
    private String note;
    private List context;
    private LocalDateTime begindatetime;
    private LocalDateTime enddatetime;
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
		return begindatetime;
	}
	private void setBegindatetime(LocalDateTime begindatetime) {
		this.begindatetime = begindatetime;
	}
	private LocalDateTime getEnddatetime() {
		return enddatetime;
	}
	private void setEnddatetime(LocalDateTime enddatetime) {
		this.enddatetime = enddatetime;
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