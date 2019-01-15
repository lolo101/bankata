package bankata;

import org.junit.Test;

public class AmountTest {

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_on_negative_amount() {
        new Amount(-1);
    }
}
