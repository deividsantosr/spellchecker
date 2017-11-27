/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speelchecker.transposition;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author deividnetwork
 */
public abstract class AbstractTransposition implements Transposition {

    protected ArrayList<String> words = new ArrayList<>();

    /**
     * Constructor
     *
     * @param word To generate transposition
     */
    public AbstractTransposition(String word) {
        this.generate(word);
    }

    /**
     * Generate transposition
     *
     * @param word From constructor
     */
    protected void generate(String word) {
        int max = word.length() - 1;

        for (int i = 0; i < max; i++) {
            StringBuilder str = new StringBuilder(word);

            int current = i;
            int next = i + 1;

            char c1 = str.charAt(current);
            char c2 = str.charAt(next);

            str.setCharAt(next, c1);
            str.setCharAt(current, c2);

            this.add(str.toString());
        }
    }

    /**
     * Add item to word list
     *
     * @param item From word list
     */
    protected void add(String item) {
        this.words.add(item);
    }

    /**
     * Remove item from word list
     *
     * @param item From word list
     */
    protected void remove(String item) {
        for (Iterator<String> iterator = words.iterator(); iterator.hasNext();) {
            String word = iterator.next();

            if (word.equals(item)) {
                words.remove(word);
            }
        }
    }

    /**
     * Retrieve word list
     *
     * @return
     */
    @Override
    public ArrayList<String> fetchWords() {
        return words;
    }

    /**
     * Show all words
     *
     * @return
     */
    @Override
    public String toString() {
        String words = "";

        for (String word : this.fetchWords()) {
            words += word + "\n";
        }

        return words.substring(0, words.length() - 1);
    }
}
