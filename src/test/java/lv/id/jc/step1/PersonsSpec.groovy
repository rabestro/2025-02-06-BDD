package lv.id.jc.step1

import spock.lang.Specification

class PersonsSpec extends Specification {

    def "GetJohn"() {
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
