package bankata;

import java.util.Date;

public abstract class Operation {

    private final Date date;
    private final Amount amount;

    public Operation(Date date, Amount amount) {
        this.amount = amount;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public Amount getAmount() {
        return amount;
    }

    public abstract Amount adjust(Amount balance);
}
