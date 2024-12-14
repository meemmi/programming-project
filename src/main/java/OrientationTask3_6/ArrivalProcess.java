package OrientationTask3_6;
import OrientationTask3_6.distributions.Poisson;
import java.util.ArrayList;
import java.util.List;

public class ArrivalProcess {
    private final Poisson poissonGenerator;
    private final List<Event> eventList;

    public ArrivalProcess(double mean) {
        this.poissonGenerator = new Poisson(mean);
        this.eventList = new ArrayList<>();
    }

    public void addEvent(int currentTime) {
        long interval = poissonGenerator.sample();
        eventList.add(new Event(currentTime + (int) interval));
    }

    public List<Event> getEvents() {
        return eventList;
    }
}
