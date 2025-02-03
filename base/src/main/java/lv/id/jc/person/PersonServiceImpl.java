package lv.id.jc.person;

import java.time.LocalDate;

public class PersonServiceImpl implements PersonService {
    @Override
    public boolean isLegalAge(Person person) {
        return isLegalAge(age(person, LocalDate.now()));
    }

    int age(Person person, LocalDate today) {
        throw new UnsupportedOperationException();
    }

    boolean isLegalAge(int age) {
        throw new UnsupportedOperationException();
    }
}
