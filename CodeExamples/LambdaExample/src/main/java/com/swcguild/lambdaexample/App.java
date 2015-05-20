/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.lambdaexample;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import static java.util.Calendar.DATE;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class App {

    public static void main(String[] args) {

        List<Server> server = new ArrayList<>();

        Server one = new Server();
        one.setName("web01");
        one.setIp("192.968.1.1");
        one.setMake("Dell");
        one.setRam("64BG RAM");
        one.setNumProcessors(16);
        one.setPurchaseDate(LocalDate.parse("2010-01-01", DateTimeFormatter.ISO_DATE));
        server.add(one);

        Server two = new Server();
        two.setName("web02");
        two.setIp("192.968.1.1");
        two.setMake("Dell");
        two.setRam("64BG RAM");
        two.setNumProcessors(16);
        two.setPurchaseDate(LocalDate.parse("2013-01-01", DateTimeFormatter.ISO_DATE));
        server.add(two);

        Server three = new Server();
        three.setName("web03");
        three.setIp("192.968.1.1");
        three.setMake("IBM");
        three.setRam("16BG RAM");
        three.setNumProcessors(16);
        three.setPurchaseDate(LocalDate.parse("2014-01-01", DateTimeFormatter.ISO_DATE));
        server.add(three);

        Server four = new Server();
        four.setName("web04");
        four.setIp("192.968.1.1");
        four.setMake("HP");
        four.setRam("8BG RAM");
        four.setNumProcessors(16);
        four.setPurchaseDate(LocalDate.parse("2001-01-01", DateTimeFormatter.ISO_DATE));
        server.add(four);

        Server five = new Server();
        five.setName("web05");
        five.setIp("192.968.1.1");
        five.setMake("HP");
        five.setRam("24BG RAM");
        five.setNumProcessors(16);
        five.setPurchaseDate(LocalDate.parse("2001-01-01", DateTimeFormatter.ISO_DATE));
        server.add(five);

        String make = "dELL";
        server.stream()
                .filter((Server tmp) -> return tmp.getName().equalsIgnoreCase(make);)
                .forEach(s -> System.out.println(s.getIp());
                
        
        server.stream()
                .filter(s -> s.getMake().equalsIgnoreCase(make))
                .forEach(e -> System.out.println(e.getName()));

    }
}
