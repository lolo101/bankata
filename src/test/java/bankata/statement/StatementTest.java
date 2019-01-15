package bankata.statement;

import static org.junit.Assert.assertEquals;

import bankata.Account;
import bankata.Amount;
import bankata.Deposit;
import bankata.Withdrawal;
import java.util.Date;
import java.util.stream.Stream;
import org.junit.Test;

public class StatementTest {

    @Test
    public void should_print_headers_when_no_operations() {
        Statement statement = new Statement(Stream.empty());
        assertEquals("operation  |       date |  amount | balance", statement.toString());
    }

    @Test
    public void should_print_operations_stack_ordered() {
        Account account = new Account();
        account.operation(new Deposit(new Date(0), new Amount(10)));
        account.operation(new Withdrawal(new Date(0), new Amount(10)));
        Statement statement = new Statement(account.stream());
        assertEquals(
                  "operation  |       date |  amount | balance\n"
                + "Withdrawal | 01/01/1970 |   10.00 | 0.00\n"
                + "Deposit    | 01/01/1970 |   10.00 | 10.00",
                statement.toString());
    }
}
