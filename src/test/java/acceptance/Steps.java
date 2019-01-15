package acceptance;

import static org.junit.Assert.assertThat;

import bankata.Account;
import bankata.Amount;
import bankata.Deposit;
import bankata.Withdrawal;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Date;
import org.hamcrest.Matchers;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class Steps {

    private final Appendable printer = new StringWriter();
    private final Account account = new Account();

    @Given("a client makes a deposit of $value on $date")
    public void givenAClientMakesADepositOf(int amount, Date date) {
        givenADepositOf(amount, date);
    }

    @Given("a deposit of $value on $date")
    public void givenADepositOf(int amount, Date date) {
        Deposit deposit = new Deposit(date, new Amount(amount));
        account.operation(deposit);
    }

    @Given("a withdrawal of $value on $date")
    public void givenAWithdrawalOf(int amount, Date date) {
        Withdrawal withdrawal = new Withdrawal(date, new Amount(amount));
        account.operation(withdrawal);
    }

    @When("she prints her bank statement")
    public void whenSheChecksHerBankStatement() throws IOException {
    }

    @Then("she would see $statement")
    public void thenSheWouldSee(String statement) {
        assertThat(printer.toString(), Matchers.equalTo(statement));
    }
}
