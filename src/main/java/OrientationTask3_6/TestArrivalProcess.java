package OrientationTask3_6;

// for testing the arrival process
public class TestArrivalProcess {
    public static void main(String[] args) {
        ArrivalProcess ap = new ArrivalProcess(5.0);

        int currentTime = 0;
        for (int i = 0; i < 10; i++) {
            ap.addEvent(currentTime);
            currentTime += 5;
        }

        for (Event e : ap.getEvents()) {
            System.out.println("Event Time: " + e.getTime());
        }
    }
}
