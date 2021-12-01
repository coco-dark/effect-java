package com.example.stack.listener;

import java.util.Date;

public class Event {
    private final EventSource eventSource;
    public Event(EventSource eventSource){
        this.eventSource=eventSource;
    }

    public EventSource getEventSource() {
        return eventSource;
    }
}
