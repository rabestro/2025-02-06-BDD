package lv.id.jc.step1;

import java.time.LocalDate;
import java.util.Set;

public record Person(
        String name,
        LocalDate birthday,
        Set<Person> friends
) {
}
