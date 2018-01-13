package org.shiganai.shiganai_problem;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName ) {
        super( testName );    
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite( AppTest.class );
    }

    public void testMakeRandomWord() {
        final String word = App.makeRandomWord();
        assertTrue(word.length() == App.TARGET.length());

        // assert word is random
        int i = 0;
        final char c1 = word.charAt(i++);
        final char c2 = word.charAt(i++);
        final char c3 = word.charAt(i++);
        final char c4 = word.charAt(i++);

        assertTrue(App.CHARS.indexOf(c1) > -1);
        assertTrue(App.CHARS.indexOf(c2) > -1);
        assertTrue(App.CHARS.indexOf(c3) > -1);
        assertTrue(App.CHARS.indexOf(c4) > -1);

        assertTrue(c1 != c2);
        assertTrue(c1 != c3);
        assertTrue(c1 != c4);
        assertTrue(c2 != c3);
        assertTrue(c2 != c4);
    }

}
