package lv.id.jc.person

import spock.lang.PendingFeature
import spock.lang.Specification
import spock.lang.Subject

class LegalAgeSpec extends Specification {

    @Subject
    def sut = new Object() {
        boolean isLegalAge(int age) { true }
    }

    @PendingFeature(reason = 'Planned in release 0.2')
    def 'determines whether the age is legal age'() {
        expect:
        sut.isLegalAge(age) == expected

        where:
        age | expected | comment
        18  | true     | '18 is the boundary age for legal adulthood'
        17  | false    | 'Below legal age boundary'
        20  | true     | 'Above the legal age'
        16  | false    | 'Well below the legal age'
        21  | true     | 'Common benchmark for legal age in some regions'
        0   | false    | 'Age must be greater than 0'
    }
}
