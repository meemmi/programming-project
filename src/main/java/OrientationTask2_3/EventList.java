package OrientationTask2_3;
import OrientationTask2_3.Event;
import java.util.PriorityQueue;

public class EventList {
    private PriorityQueue<OrientationTask2_3.Event> eventQueue;

    public EventList() {
        this.eventQueue = new PriorityQueue<>();
    }

    public void addEvent(OrientationTask2_3.Event event) {
        eventQueue.add(event);
    }

    public OrientationTask2_3.Event getNextEvent() {
        return eventQueue.poll();
    }

    public void printEvents() {
        PriorityQueue<Event> tempQueue = new PriorityQueue<>(eventQueue);
        while (!tempQueue.isEmpty()) {
            System.out.println(tempQueue.poll());
        }
    }
}

