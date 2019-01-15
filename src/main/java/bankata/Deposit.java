package bankata;

import java.util.Date;

public class Deposit extends Operation {

    public Deposit(Date date, Amount amount) {
        super(date, amount);
    }

    @Override
    public Amount adjust(Amount balance) {
        return balance.plus(getAmount());
    }
}
