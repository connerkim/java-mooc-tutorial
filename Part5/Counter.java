public class Counter {
//    public Counter(int startValue) sets the start value of the counter to startValue.
//
//    public Counter() sets the start value of the counter to 0.
//
//    And the following methods:
//
//    public int value() returns the current value of the counter
//    public void increase() increases the value by 1
//    public void decrease() decreases the value by 1

    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this.value = 0;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void increase(int increaseBy) {
        if (increaseBy >= 0) {
            this.value += increaseBy;
        }
    }

    public void decrease() {
        this.value--;
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy >= 0) {
            this.value -= decreaseBy;
        }
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(4);

        counter1.increase();
        counter2.decrease();

        System.out.println(counter1.value());
        System.out.println(counter2.value());

        counter1.increase(42);
        counter2.decrease(9);

        System.out.println(counter1.value());
        System.out.println(counter2.value());
    }
}
