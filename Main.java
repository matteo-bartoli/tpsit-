package com.mycompany.esthread2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class Main {

    public static void Main(String[] args) {
        Contatore c1 = new Contatore(true);
        Contatore c2 = new Contatore(false);
        Thread th1 = new Thread(c1);
        Thread th2 = new Thread(c2);

        for (int i = 0; i < 100; i++) {
            th1.start();
            th2.start();
        }

        try {
            th1.join();
            th2.join();
        } catch (Exception e) {
            System.err.println(e);
        }
        System.out.println(c1.incrementa);
    }
}
