
package javaadvanced.martes;

abstract class Bici{
    Bici(){
        System.out.println("La bicicleta se creo");
    }
    abstract void run();
    
    void changeColor(){
        System.out.println("Color cambiado");
    }
}
class Magistroni extends Bici{
    void run(){
        System.out.println("Soy una bicicleta");
    }
}

public class Abstraccion2 {
    void run(){
        System.out.println("La bici esta corriendo");
    }
    public static void main(String[] args) {
        Bici bici = new Magistroni();
        bici.run();
        bici.changeColor();
    }
}
