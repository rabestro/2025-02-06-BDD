package lv.id.jc.person

import spock.lang.PendingFeature
import spock.lang.Specification
import spock.lang.Subject

import java.time.LocalDate

class AgeCalculationSpec extends Specification {

    @Subject
    def sut = new Object() {
        int age(Person person, LocalDate today) { 18 }
    }

    @PendingFeature(reason = 'Scheduled in release 0.2')
    def "calculate the age: #comment"() {
        given:
        def person = new Person(name, LocalDate.parse(birthday), [] as Set)

        when:
        def today = LocalDate.parse(now)

        then:
        sut.age(person, today) == expectedAge

        where:
        name      | birthday     | now          | expectedAge | comment
        'Alice'   | '2005-10-01' | '2023-10-01' | 18          | 'Birthday is today'
        'Bob'     | '1990-02-28' | '2023-02-27' | 32          | 'One day before birthday this year'
        'Charlie' | '1985-06-15' | '2023-06-15' | 38          | 'Birthday is on the current date'
        'Diana'   | '2000-12-31' | '2023-01-01' | 22          | 'Not reached birthday yet this year'
        'Edward'  | '2010-07-01' | '2023-06-30' | 12          | 'Just one day before turning 13'
        'Fiona'   | '1980-11-30' | '2023-11-30' | 43          | 'Birthday today'
        'George'  | '1972-05-10' | '2023-05-09' | 50          | 'One day before turning 51'
    }
}
