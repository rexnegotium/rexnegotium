package com.rexnegotium.model;

import java.util.Date;

public class Task {
	
	private int tid;
    private String tname;
    private String note;
    private String context;
    private Date begintime;
    private Date endtime;
    private boolean completed;
    
    //private boolean repeatable; // повторение задания, 
    
    
    public int getTid() {
    	return tid;
    }
    public void setTid(int tid) {
    	this.tid = tid;
    }
    
    public String getTname() {
    	return tname;
    }    
    public void setTname(String tname) {
    	this.tname = tname;
    }
    
    private String getContext() {
		return context;
	}
	private void setContext(String context) {
		this.context = context;
	}
	public String getNote() {
    	return note;
    }
    public void setNote(String note) {
    	this.note = note;
    }
	private Date getBegintime() {
		return begintime;
	}
	private void setBegintime(Date begintime) {
		this.begintime = begintime;
	}
	private Date getEndtime() {
		return endtime;
	}
	private void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	private boolean isCompleted() {
		return completed;
	}
	private void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
	/*private boolean isRepeatable() {
		return repeatable;
	}
	private void setRepeatable(boolean repeatable) {
		this.repeatable = repeatable; 
	}*/
    
	// Возьми за основу класс User, посмотри на форму создания новой задачи в "макете" 
	// и попробуй создать похожий класс задачи здесь
	
}
