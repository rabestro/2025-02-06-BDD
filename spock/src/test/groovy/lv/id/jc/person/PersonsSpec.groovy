package lv.id.jc.person

import spock.lang.Specification

class PersonsSpec extends Specification {

    def "should retrieve John with correct details"() {
        given:
        def persons = new Persons()

        when:
        def john = persons.getJohn()

        then:
        with(john) {
            name() == "John"
            birthday() as String == "1990-03-05"
            friends().size() == 2
            "Mary" in friends()*.name()
        }
    }
}
