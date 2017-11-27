/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speelchecker;

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
        WordTransposition transposition = new WordTransposition("caas");
        System.out.println(transposition);

    }

}
