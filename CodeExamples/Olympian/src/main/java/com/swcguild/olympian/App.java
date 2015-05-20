/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.olympian;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author apprentice
 */
public class App {

    public static void main(String[] args) {
//       SkiJumper jumper = new SkiJumper();
//       jumper.competeInEvent();
//                
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//   another version:     SkiJumper sj = (SkiJumper) ctx.getBean("superSkiJumper");

        Olympian usaSkiJumper = ctx.getBean("usaSkiJumper", Olympian.class);
        usaSkiJumper.competeInEvent();

        Olympian usaSpeedSkater = ctx.getBean("usaSpeedSkater", Olympian.class);
        usaSpeedSkater.competeInEvent();

        Olympian canadianSpeedSkater = ctx.getBean("canadianSpeedSkater", Olympian.class);
        canadianSpeedSkater.competeInEvent();
     
    }
}
