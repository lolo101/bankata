package bankata.statement;

import bankata.Operation;
import java.util.stream.Stream;

public class Statement {

    private final Stream<Operation> operations;

    public Statement(Stream<Operation> operations) {
        this.operations = operations;
    }

    @Override
    public String toString() {
        return operations.reduce(new Report(), Report::add, Report::merge).toString();
    }
}
