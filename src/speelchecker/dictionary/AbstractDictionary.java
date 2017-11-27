/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speelchecker.dictionary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import speelchecker.transposition.WordTransposition;

/**
 *
 * @author deividnetwork
 */
public abstract class AbstractDictionary implements Dictionary {

    private static final String FILE_PATH = "src/speelchecker/dictionary/words";

    private String fileContent;

    private BufferedReader bReader;

    /**
     * Constructor
     */
    public AbstractDictionary() {
        try {
            bReader = new BufferedReader(new FileReader(AbstractDictionary.FILE_PATH));

            StringBuilder strBuilder = new StringBuilder();
            String line = bReader.readLine();

            while (line != null) {
                strBuilder.append(line).append(System.lineSeparator());

                line = bReader.readLine();
            }

            fileContent = strBuilder.toString();

            bReader.close();
        } catch (IOException ex) {
            Logger.getLogger(AbstractDictionary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Validate if word exist in dictionary
     *
     * @param word Any word to validate
     * @return
     */
    @Override
    public boolean wordExist(String word) {
        return fileContent.contains(word.toUpperCase() + "\n");
    }

    /**
     * Show all words on dictionary
     *
     * @return
     */
    @Override
    public String toString() {
        return this.fileContent;
    }

}
