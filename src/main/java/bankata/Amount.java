package bankata;

public class Amount {

    private final int value;

    public Amount(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Negative amount :" + value);
        }
        this.value = value;
    }

    public Amount plus(Amount amount) {
        return new Amount(value + amount.value);
    }

    public Amount minus(Amount amount) {
        return new Amount(value - amount.value);
    }

    @Override
    public String toString() {
        return value + ".00";
    }
}
