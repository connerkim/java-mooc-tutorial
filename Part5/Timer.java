public class Timer {
//    public Timer() creates a new timer.
//    public String toString() returns a string representation of the timer. The string representation should be in the form "seconds: hundredths of a second", where both the seconds and the hundredths of a second are represented by two numbers. For example, "19:83" would represent the time 19 seconds, 83 hundredths of a second.
//    public void advance() moves the timer forward by a hundredth of a second.

    private ClockHand seconds;
    private ClockHand centiSeconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.centiSeconds = new ClockHand(100);
    }

    public void advance() {
        this.centiSeconds.advance();

        if (this.centiSeconds.value() == 0) {
            this.seconds.advance();

        }
    }

    public String toString() {
        return this.seconds.value() + ": " + this.centiSeconds.value();
    }

    public static void main(String[] args) {
        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
    }
}
