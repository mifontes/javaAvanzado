/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.jueves;

/**
 *
 * @author CCC-21
 */
public class MiltiR {
    public static void main(String[] args) {
        Runnable r1 = new Runnable(){
            public void run(){
                System.out.println("Tarea uno");
            }
        };
        Runnable r2 = new Runnable(){
            public void run(){
                System.out.println("Tarea dos");
            }
        };
        Thread t1 = new Thread(r1), 
                t2 = new Thread(r2);
        
        t1.start();
        t2.start();
    }
}
