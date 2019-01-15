package bankata;

import java.util.Date;

public class Deposit {

    private final Date date;
    private final Amount amount;

    public Deposit(Date date, Amount amount) {
        this.date = date;
        this.amount = amount;
    }
}
