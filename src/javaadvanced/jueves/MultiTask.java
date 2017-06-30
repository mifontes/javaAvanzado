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
public class MultiTask extends Thread{

    @Override
    public void run() {
        System.out.println("Tarea 1");
    }
    public static void main(String[] args) {
        MultiTask t1 = new MultiTask(),
                t2 = new MultiTask(),
                t3 = new MultiTask();
        
        t1.start();
        t2.start();
        t3.start();
    }
}
class M implements Runnable{

    @Override
    public void run() {
        System.out.println("Tarea uno");
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new M());
        Thread t2 = new Thread(new M());
        
        TrueM tim = new TrueM();
        TrueM tim2 = new TrueM();
        
        tim.start();
        tim2.start();
        
        t1.start();
        t2.start();
    }
    
}

class TrueM extends Thread{
    @Override
    public void run() {
        System.out.println("Tareas A");
    }
}

class TrueMT extends Thread{
    @Override
    public void run() {
        System.out.println("Tareas B");
    }
}