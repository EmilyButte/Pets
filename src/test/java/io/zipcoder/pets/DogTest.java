package io.zipcoder.pets;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by emilybutte on 9/26/16.
 */
public class DogTest {

    Pet d = new Dog("Bob");

    @Test
    public void speakTest() {
        assertEquals("bark", d.speak());
    }

    @Test
    public void speakOtherTest() {
        assertNotEquals("blah", d.speak());
    }

}
