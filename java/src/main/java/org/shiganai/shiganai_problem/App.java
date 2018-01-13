package org.shiganai.shiganai_problem;

/**
 * Hello world!
 *
 */
public class App {

    static final int LOOP_COUNT = 100;
    static final String CHARS = "しくてがない";
    static final String TARGET = "しがない";

    public static void main(final String[] args)    {
        for (int i = 0; i < LOOP_COUNT; i++) {
            final String word = makeRandomWord();
            System.out.println(word);
            
        }
    }

    static String makeRandomWord() {
        // TODO Auto-generated method stub
        return TARGET;
    }

}
