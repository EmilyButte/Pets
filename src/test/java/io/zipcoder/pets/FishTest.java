package io.zipcoder.pets;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by emilybutte on 9/26/16.
 */
public class FishTest {

    Pet f = new Fish("Bob");

    @Test
    public void speakTest() {
        assertEquals("bloop", f.speak());
    }

    @Test
    public void speakOtherTest() {
        assertNotEquals("blah", f.speak());
    }

}
