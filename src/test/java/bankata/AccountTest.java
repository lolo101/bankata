package bankata;

import java.util.Date;
import org.junit.Test;

public class AccountTest {

    @Test
    public void should_accept_deposit() {
        Account account = new Account();
        account.deposit(new Deposit(new Date(), new Amount(10)));
    }
}
