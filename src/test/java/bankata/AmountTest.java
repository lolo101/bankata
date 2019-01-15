package bankata;

import org.junit.Assert;
import org.junit.Test;

public class AmountTest {

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_on_negative_amount() {
        new Amount(-1);
    }

    @Test
    public void should_add_amounts() {
        Amount amount = new Amount(2);
        Amount result = amount.plus(new Amount(3));
        Assert.assertEquals("5.00", result.toString());
    }

    @Test
    public void should_substract_amounts() {
        Amount amount = new Amount(5);
        Amount result = amount.minus(new Amount(3));
        Assert.assertEquals("2.00", result.toString());
    }
}
