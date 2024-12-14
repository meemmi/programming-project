package OrientationTask2_2;

public class EventTest {
    public static void main(String[] args) {
        // a) generate a list of events
        EventList eventList = new EventList();

        eventList.addEvent(new Event(5, "Arrival"));
        eventList.addEvent(new Event(2, "Start Service"));
        eventList.addEvent(new Event(8, "End Service"));
        eventList.addEvent(new Event(1, "Departure"));

        // b) remove the first event from the list
        Event nextEvent = eventList.getNextEvent();
        System.out.println("Next event (removed): " + nextEvent);

        // c) print contents of the EventList, ordered by event time
        System.out.println("\nEvents ordered by event time:");
        eventList.printEvents();

    }
}
