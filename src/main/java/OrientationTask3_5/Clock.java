package OrientationTask3_5;

public class Clock {
    private static Clock instance;
    private long time;

    private Clock() {
        time = 0;
    }

    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    public void setTime(long newTime) {
        time = newTime;
    }

    public long getTime() {
        return time;
    }



    // test program
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();

        System.out.println("Time before update: " + clock.getTime());

        // change the time of the clock
        clock.setTime(5000);
        System.out.println("Updating ...");
        System.out.println("Time is updated to: " + clock.getTime());

    }
}
