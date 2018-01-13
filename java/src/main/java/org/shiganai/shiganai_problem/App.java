package org.shiganai.shiganai_problem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {

    static final int LOOP_COUNT = 100;
    static final String CHARS = "しくてがない";
    static final String TARGET = "しがない";

    public static void main(final String[] args) {
        final App app = new App();
        app.run();
    }

    public void run() {
        for (int i = 0; i < LOOP_COUNT; i++) {
            final String word = makeRandomWord();
        }
    }

    String makeRandomWord() {
        final List<String> list = Arrays.asList(CHARS.split(""));
        Collections.shuffle(list);
        int i = 0;
        return new StringBuilder(list.get(i++)).append(list.get(i++)).append(list.get(i++)).append(list.get(i++))
                .toString();
    }

}
