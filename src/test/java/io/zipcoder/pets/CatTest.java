package io.zipcoder.pets;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by emilybutte on 9/26/16.
 */
public class CatTest {

    Pet c = new Cat("Bob");

    @Test
    public void speakTest() {
        assertEquals("meow", c.speak());
    }

    @Test
    public void speakOtherTest() {
        assertNotEquals("blah", c.speak());
    }

}
