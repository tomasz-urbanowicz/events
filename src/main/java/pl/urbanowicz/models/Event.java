package pl.urbanowicz.models;

public class Event {

    private int id;
    private static int nextId = 1;

    private String eventName;

    private String eventDescription;

    private String contactEmail;


    public Event(String eventName, String eventDescription) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
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

    @Override
    public String toString() {
        return eventName;
    }
}
