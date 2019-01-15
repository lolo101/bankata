package bankata.statement;

import bankata.Amount;
import bankata.Operation;
import java.util.Deque;
import java.util.LinkedList;

class Report {

    private final Deque<String> lines = new LinkedList<>();
    private Amount balance = new Amount(0);

    Report add(Operation operation) {
        balance = operation.adjust(balance);
        lines.addFirst(String.format("%1$-10s | %2$td/%2$tm/%2$tY | %3$7s | %4$s",
                operation.getClass().getSimpleName(),
                operation.getDate(),
                operation.getAmount(),
                balance));
        return this;
    }

    public Report merge(Report other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        lines.addFirst("operation  |       date |  amount | balance");
        return String.join("\n", lines);
    }
}
