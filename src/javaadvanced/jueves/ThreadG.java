
package javaadvanced.jueves;

public class ThreadG implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        ThreadG runnable = new ThreadG();
        ThreadGroup tgl = new ThreadGroup("Grupo de Hilos");
        
        Thread t1 = new Thread(tgl,runnable,"uno");
        t1.start();
        Thread t2 = new Thread(tgl,runnable,"dos");
        t2.start();
        Thread t3 = new Thread(tgl,runnable,"tres");
        t3.start();
        
        System.out.println("Thread Group: "+ tgl.getName());
        tgl.list();
    }
}
