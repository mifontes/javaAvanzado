/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.miercoles;

/**
 *
 * @author CCC-21
 */
public class TestS extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException in) {
                in.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        TestS t1 = new TestS();
        t1.start();
        HiloS t2 = new HiloS();
        Thread th1 = new Thread(t2);
        th1.start();
    }
    
}

class HiloS implements Runnable{
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException in) {
                in.printStackTrace();
            }
        }
    }
}