
package javaadvanced.jueves;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 
 * @author CCC-21
 */
public class ThreadD implements Runnable{
    private String msg;
    
    public ThreadD(String s){
        msg = s;
    }
    
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" (Start) " + msg);
        
        processMsg();
        
        System.out.println(Thread.currentThread().getName()+" (End) " + msg);
    }
    private void processMsg(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException in) {
            in.printStackTrace();
        }
    }
}
    
class PruebaP1{
    public static void main(String[] args) {
        ExecutorService executor = new Executors.newFixedThreadPool(5);

        for(int i=0; i<10; i++){
            Runnable worker = new ThreadD(" "+i);
            executor.execute(worker);
        }
        executor.shutdown();
        while(!executor.isTerminated()){}
        System.out.println("todos los hilos se han terminados");
    }
}