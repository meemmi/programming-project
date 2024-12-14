package OrientationTask2_2;

public class Event implements Comparable<Event> {
    private long eventTime;
    private String eventType;

    public Event(long eventTime, String eventType) {
        this.eventTime = eventTime;
        this.eventType = eventType;
    }

    public long getEventTime() {
        return eventTime;
    }


    public String getEventType() {
        return eventType;
    }

    @Override
    public int compareTo(Event other) {
        return Long.compare(this.eventTime, other.eventTime);
    }

    @Override
    public String toString() {
        return "Event[time=" + eventTime + ", type=" + eventType + "]";
    }
}
