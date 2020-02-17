/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ustatunja.utility;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author camol
 */
public class main {

    public static void main(String[] args) {
        int mes, count;
        double peso;
        boolean result, iniciar;

        RaisePig objcriar;
        TimerTask objTimerTask = new RaisePig();
        Timer objjTimer = new Timer();
        EviromentPig objEviromentPig;
        objEviromentPig = new EviromentPig();

        iniciar = true;
        count = 1;
        Scanner objTecaldo;
        objcriar = new RaisePig();
        objTecaldo = new Scanner(System.in);

        System.out.println("********Temperatura ambiente actualmente**********");
        objEviromentPig.joinTemperature();
        System.out.println("Temperatura: " + objEviromentPig.getTemparature() + " °C");
        System.out.println("***************************************************");
        if (objEviromentPig.getTemparature() <= 7) {
            while (iniciar) {
                objEviromentPig.increaseTemperature();
                System.out.println("-->>" + objEviromentPig.getTemparature());
                if (objEviromentPig.getTemparature() == 12) {
                    iniciar = false;
                } else {
                    iniciar = true;
                }
            }

        } else {
            if (objEviromentPig.getTemparature() >= 20) {
                while (iniciar) {
                    objEviromentPig.reduceTemperature();
                    System.out.println("-->>" + objEviromentPig.getTemparature());
                    if (objEviromentPig.getTemparature() == 17) {
                        iniciar = false;
                    } else {
                        iniciar = true;
                    }
                }
            } else {
            }
        }
//        peso = objcriar.getObjPig().getWeight();
//        System.out.println("Ingrese el mes:");
//        mes = objTecaldo.nextInt();
//
//        result = objcriar.isWeightIdealForMonth(peso, mes);
//
//        System.out.println("peso->" + objcriar.getObjPig().getWeight());
//
//        if (result) {
//            System.out.println("En estado optimo");
//        } else {
//            objjTimer.schedule(objTimerTask, 0, 10);
//            System.out.println("Aumentar alimento");
//            objcriar.run();
//            System.out.println("peso->" + objcriar.getObjPig().getWeight());
//        }
//
//    }
    }
}
