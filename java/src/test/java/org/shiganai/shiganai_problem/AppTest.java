package org.shiganai.shiganai_problem;

import static org.junit.Assert.assertTrue;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;

import mockit.integration.junit4.JMockit;

@RunWith(JMockit.class)
public class AppTest {

    @Test
    public void testMakeRandomWord() {
        final App app = new App();
        final String word = app.makeRandomWord();
        assertTrue(word.length() == App.TARGET.length());
        assertTrue(StringUtils.containsOnly(word, App.CHARS));

        // assert word is random
        int i = 0;
        final char c1 = word.charAt(i++);
        final char c2 = word.charAt(i++);
        final char c3 = word.charAt(i++);
        final char c4 = word.charAt(i++);

        assertTrue(c1 != c2);
        assertTrue(c1 != c3);
        assertTrue(c1 != c4);
        assertTrue(c2 != c3);
        assertTrue(c2 != c4);
    }

}
