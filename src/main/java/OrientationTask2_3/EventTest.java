package OrientationTask2_3;

public class EventTest {
    public static void main(String[] args) {
        // a) Generate a list of events
        EventList eventList = new EventList();

        eventList.addEvent(new Event(5, EventType.ARRIVAL));
        eventList.addEvent(new Event(2, EventType.START_SERVICE));
        eventList.addEvent(new Event(8, EventType.END_SERVICE));
        eventList.addEvent(new Event(1, EventType.DEPARTURE));

        // b) Remove the first event from the list
        Event nextEvent = eventList.getNextEvent();
        System.out.println("Next event (removed): " + nextEvent);

        // c) Print contents of the EventList, ordered by event time
        System.out.println("\nEvents ordered by event time:");
        eventList.printEvents();
    }
}