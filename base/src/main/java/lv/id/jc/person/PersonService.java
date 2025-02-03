package lv.id.jc.person;

/**
 * Service interface for operations related to {@link Person}.
 */
public interface PersonService {
    /**
     * Determines if the given person is of legal age (18 years or older).
     *
     * @param person the Person object to evaluate
     * @return true if the person's age is 18 or greater, otherwise false
     */
    boolean isLegalAge(Person person);
}
