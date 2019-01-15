package bankata;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Account {

    private final List<Operation> operations = new ArrayList<>();

    public void operation(Operation operation) {
        operations.add(operation);
    }

    public Stream<Operation> stream() {
        return operations.stream();
    }
}
