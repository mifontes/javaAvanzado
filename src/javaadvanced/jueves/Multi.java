
package javaadvanced.jueves;

public class Multi{
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                System.out.println("Tarea uno");
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                System.out.println("Tarea dos");
            }
        };
        t1.start();
        t2.start();
    }
}

