package bankata;

import java.util.Date;

public class Withdrawal extends Operation {

    public Withdrawal(Date date, Amount amount) {
        super(date, amount);
    }

    @Override
    public Amount adjust(Amount balance) {
        return balance.minus(getAmount());
    }
}
