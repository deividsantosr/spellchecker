/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speelchecker;

import java.awt.FlowLayout;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import speelchecker.dictionary.ManageDictionary;
import speelchecker.gui.LauncherJFrame;
import speelchecker.transposition.WordTransposition;

/**
 *
 * @author deividnetwork
 */
public class SpeelChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ManageDictionary dictionary = new ManageDictionary();

        String word = "occi";

        if (dictionary.wordExist(word)) {
            System.out.println(dictionary);
        } else {
            WordTransposition transposition = new WordTransposition(word);
            System.out.println(transposition);
        }

        new LauncherJFrame();
    }

}
