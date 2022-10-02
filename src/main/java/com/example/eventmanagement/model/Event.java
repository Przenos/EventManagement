package com.example.eventmanagement.model;

import java.util.Date;

public class Event {
    private String eventName;
    private Date eventDate;
    private String eventAdres;
    private String eventOrganizer;

    public Event(String eventName, Date eventDate, String eventAdres, String eventOrganizer) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventAdres = eventAdres;
        this.eventOrganizer = eventOrganizer;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventAdres() {
        return eventAdres;
    }

    public void setEventAdres(String eventAdres) {
        this.eventAdres = eventAdres;
    }

    public String getEventOrganizer() {
        return eventOrganizer;
    }

    public void setEventOrganizer(String eventOrganizer) {
        this.eventOrganizer = eventOrganizer;
    }
}



