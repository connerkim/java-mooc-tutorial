public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents); // create a new Money object that has the correct worth

        // return the new Money object
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros != compared.euros) return this.euros < compared.euros;
        return this.cents < compared.cents;
    }

    public Money minus(Money decreaser) {
        int euroDiff = this.euros - decreaser.euros;
        int centDiff = this.cents - decreaser.cents;

        if (centDiff < 0) {
            centDiff += 100;
            euroDiff--;
        }
        if (euroDiff < 0) {
            euroDiff = 0;
            centDiff = 0;
        }

        return new Money(euroDiff, centDiff);
    }

    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public static void main(String[] args) {
        Money a = new Money(3, 50);
        Money b = new Money(3, 40);

        Money c = a.minus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 6.50e
    }
}