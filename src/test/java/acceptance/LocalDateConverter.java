package acceptance;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.jbehave.core.steps.ParameterConverters.AbstractParameterConverter;

public class LocalDateConverter extends AbstractParameterConverter<LocalDate> {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public LocalDate convertValue(String value, Type type) {
        return formatter.parse(value, LocalDate::from);
    }
}
