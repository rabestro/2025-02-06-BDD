package lv.id.jc.person;

import java.time.LocalDate;
import java.util.Set;

public record Person(
        String name,
        LocalDate birthday,
        Set<Person> friends
) {
}
