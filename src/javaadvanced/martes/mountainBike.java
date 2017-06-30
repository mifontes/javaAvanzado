
package javaadvanced.martes;


public class mountainBike {
    
    
    public static void main(String[] args){
        //System.out.println(b.getColor());
        show();
        showBici();
    }
    
    public static void show(){
        Bike b = new Bike("Azul", 6);
        System.out.println(b.getColor());
        System.out.println(b.getVelocidad());
    }
    
    public static void showBici(){
        Bike b3 = new Bike("Azul", "Marquitya", 6);
        System.out.println(b3.getColor());
        System.out.println(b3.getVelocidad());
    }
}
