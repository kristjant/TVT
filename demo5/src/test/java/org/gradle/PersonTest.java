package org.gradle;

import org.apache.commons.validator.EmailValidator;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("Larry");
        assertEquals("Larry", person.getName());
        assertTrue(EmailValidator.getInstance().isValid("a"));
    }
}
