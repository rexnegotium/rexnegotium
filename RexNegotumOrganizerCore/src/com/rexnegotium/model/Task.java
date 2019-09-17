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
    private Integer mapId;


    public Task() {

    }

    public Task(String name, String note, LocalDateTime beginDateTime, LocalDateTime endDateTime, boolean isFavourite) {
        this.name = name;
        this.note = note;
        this.beginDateTime = beginDateTime;
        this.endDateTime = endDateTime;
        this.isFavourite = isFavourite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List getContext() {
        return context;
    }

    public void setContext(List context) {
        this.context = context;
    }

    public LocalDateTime getBegindatetime() {
        return beginDateTime;
    }

    public void setBegindatetime(LocalDateTime beginDateTime) {
        this.beginDateTime = beginDateTime;
    }

    public LocalDateTime getEnddatetime() {
        return endDateTime;
    }

    public void setEnddatetime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean isFavourite) {
        this.isFavourite = isFavourite;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

//| | - (10000) 'Прочитать 'Рефакторинг: улучшение существующего кода''
//|v| - (10001) 'Прочитать 'Чистая Архитектура''

    @Override
    public String toString() {
        return "Task { id = " + mapId + " name: " + name + '\'' + ", note: " + note + '\'' + ", task is favourite - " + isFavourite + '}';
    }
}
