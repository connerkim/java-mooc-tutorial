public class Fitbyte {
    //    Create a class called Fitbyte. Its constructor takes both an age and a resting heart rate as its parameters.
//    The exercise assistant should provide a method targetHeartRate, which is passed a number of type double as a parameter
//    that represents a percentual portion of the maximum heart rate. The proportion is given as a number between zero and one.
//    The class should have:
//
//    A constructor public Fitbyte(int age, int restingHeartRate)
//    A method public double targetHeartRate(double percentageOfMaximum) that calculates and returns the target heart rate.
    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        double maxHeartRate = 206.3 - (0.711 * this.age);
        return (maxHeartRate - this.restingHeartRate) * percentageOfMaximum + this.restingHeartRate;
    }

    public static void main(String[] args) {
        Fitbyte assistant = new Fitbyte(30, 60);

        double percentage = 0.5;

        while (percentage < 1.0) {
            double target = assistant.targetHeartRate(percentage);
            System.out.println("Target " + (percentage * 100) + "% of maximum: " + target);
            percentage = percentage + 0.1;
        }
    }
}
