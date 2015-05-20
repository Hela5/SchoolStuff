/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.staticexample;

/**
 *
 * @author apprentice
 */
public class App {

    public static void main(String[] args) {
        AdderNonStaticMethod myAdder = new AdderNonStaticMethod(); //default constructor was just made for AdderNonStaticMethod

        int sum = myAdder.add(3, 2);

        int sum2 = AdderStaticLibrary.add(15, 23);

        //AdderStaticLibrary myLib = new AdderStaticLibrary();
        //int sum3 = myLib.add(4, 5);
        //un-necessary work up above, just creates excess code and redundancies
    }

}
