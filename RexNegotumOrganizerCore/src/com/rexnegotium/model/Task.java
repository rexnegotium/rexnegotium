package com.rexnegotium.model;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Task {

    private Integer id;
    private String name;
    private String note;
    private List context;
    private LocalDateTime beginDateTime;
    private LocalDateTime endDateTime;
    private boolean completed;
    private boolean isFavourite;
    private User user;
    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
    //private static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("HH:mm:ss");
    //private static final SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat("yyyyMMddHHmmss");


    public Task() {

    }

    public Task(String name, String note, LocalDateTime beginDateTime, LocalDateTime endDateTime, boolean isFavourite) {
        this.name = name;
        this.note = note;
        this.beginDateTime = beginDateTime;
        this.endDateTime = endDateTime;
        this.isFavourite = isFavourite;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        return String.format(" (%s) -- %s -- Заметка: %s Время начала: %s Время окончания: %s Задание любимое - %s", id, name, note, beginDateTime.format(FORMATTER), endDateTime.format(FORMATTER), isFavourite);
        //return "Task { Note: " + note + '\'' + ", Task starts on: " +  beginDateTime.format(FORMATTER) + '\'' + ", Task ends on: " +  endDateTime.format(FORMATTER) + '\'' + ", task is favourite - " + isFavourite + '}';
    }
}
