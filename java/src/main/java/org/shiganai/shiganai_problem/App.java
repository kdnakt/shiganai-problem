package org.shiganai.shiganai_problem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {

    static final int LOOP_COUNT = 100;
    static final String CHARS = "しくてがない";
    static final String TARGET = "しがない";
    static final String RADIO_MSG = "第%s回SIerのSEからWEB系のエンジニアに転職したが楽しくて仕方がないラジオ、略して「しがないラジオ」";
    static final String NON_RADIO_MSG = "「%sラジオ」ちゃうやん";

    public static void main(final String[] args) {
        final App app = new App();
        app.run();
    }

    public void run() {
        int n = -1;
        String word = null;
        for (int i = 0; i < LOOP_COUNT; i++) {
            word = makeRandomWord();
            if (TARGET.equals(word)) {
                n = i + 1;
                break;
            }
        }
        if (n > 0) {
            System.out.println(String.format(RADIO_MSG, n));
        } else {
            System.out.println(String.format(NON_RADIO_MSG, word));
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
