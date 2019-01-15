package bankata;

public class Amount {

    private final int value;

    public Amount(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Negative amount :" + value);
        }
        this.value = value;
    }

}
