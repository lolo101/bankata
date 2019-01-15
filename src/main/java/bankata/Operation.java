package bankata;

import java.util.Date;

public abstract class Operation {

    protected final Date date;
    protected final Amount amount;

    public Operation(Date date, Amount amount) {
        this.amount = amount;
        this.date = date;
    }
}
