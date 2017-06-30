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
public class TestJoin extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            try {
                Thread.sleep(i);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        TestJoin t1 = new TestJoin(),
                t2 = new TestJoin(),
                t3 = new TestJoin();
        showDetails(t1,t2,t3);
        t1.start();
        try {
            t1.join(1500);
        } catch (Exception e) {
        }
        t2.start();
        t3.start();
    }
    public static void showDetails(TestJoin t1, TestJoin t2, TestJoin t3){
        System.out.println("Hilo t1 : " );
    }
}
