package lv.id.jc.step1;

import org.assertj.core.api.InstanceOfAssertFactories;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PersonsTest {

    /*
        - the name is John
        - the date of birth is 3rd May 1990
        - the John has two friends
        - Mary among the friends of John
     */
    @Test
    void getJohn() {
        // Arrange
        var persons = new Persons();

        // Act
        var john = persons.getJohn();

        // Assert
        assertThat(john)
                .hasFieldOrPropertyWithValue("name", "John")
                .hasFieldOrPropertyWithValue("birthday", LocalDate.parse("1990-03-05"))
                .extracting(Person::friends)
                .asInstanceOf(InstanceOfAssertFactories.SET)
                .hasSize(2)
                .extracting("name")
                .contains("Mary");
    }
}
