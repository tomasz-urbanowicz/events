package pl.urbanowicz.models;

import java.util.Objects;

public class Event {

    private int id;
    private static int nextId = 1;

    private String eventName;

    private String eventDescription;

    private String contactEmail;


    public Event(String eventName, String eventDescription) {
        this.id = nextId;
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        nextId++;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return eventName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
