package com.example.stack.listener;

import java.util.Objects;

public class EventSource {
    private final Listener listener;
    public EventSource(Listener listener){
        this.listener=listener;
    }
    public void product(){
        if(Objects.nonNull(listener)){
            listener.product(new Event(this));
        }

    }
    public void close(){
        if(Objects.nonNull(listener)){
            listener.close(new Event(this));
        }

    }

    public static void main(String[] args) {
        EventSource eventSource=new EventSource(new Listener() {
            @Override
            public void product(Event event) {
                System.out.println("事件正在发生");
            }

            @Override
            public void close(Event event) {
                System.out.println("事件关闭");
            }
        });
        eventSource.product();
        eventSource.close();
    }
}
