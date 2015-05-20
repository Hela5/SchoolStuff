/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.fileinputandoutput;

import java.io.FileWriter;
import java.io.PrintWriter;
import static java.lang.System.out;

/**
 *
 * @author apprentice
 */
public class LetterRevisited {

    public static void main(String[] args) throws Exception {
        PrintWriter letter = new PrintWriter(new FileWriter("LetterRevisited.txt"));
        
        letter.println("+---------------------------------------------------------+");
        letter.println("|                                                    #### |");
        letter.println("|                                                    #### |");
        letter.println("|                                                    #### |");
        letter.println("|                                                         |");
        letter.println("|                                                         |");
        letter.println("|                              Bill Gates                 |");
        letter.println("|                              1 Microsoft Way            |");
        letter.println("|                              Redmond, WA 98104          |");
        letter.println("|                                                         |");
        letter.println("+---------------------------------------------------------+");
        letter.flush();
        letter.close();
    }
}
