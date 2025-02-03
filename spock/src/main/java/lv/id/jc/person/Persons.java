package lv.id.jc.person;

import java.time.LocalDate;
import java.util.Set;

public class Persons {
    static Person Arthur = new Person("Arthur",
            LocalDate.of(1989, 1, 31), Set.of());
    static Person Mary = new Person("Mary",
            LocalDate.of(2001, 7, 15), Set.of(Arthur));

    public Person getJohn() {
        return new Person("John",
                LocalDate.of(1990, 3, 5),
                Set.of(Arthur, Mary)
        );
    }
}
