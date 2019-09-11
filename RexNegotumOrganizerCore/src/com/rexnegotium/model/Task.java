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

    public Task(String name, LocalDateTime beginDateTime, LocalDateTime endDateTime) {
        this.name = name;
        this.beginDateTime = beginDateTime;
        this.endDateTime = endDateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", user=" + user +
                '}';
    }
}
