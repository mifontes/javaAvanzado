
package javaadvanced.martes;

class Animal{
    //csao 3
    Animal(){
        System.out.println("Se ha creado el animal");
    }
    void eat(){
        System.out.println("Comiendo ...");
    }
    
    String color = "Blanco";
}

class Perro extends Animal{
    //Caso 3
    Perro(){
        super();
        System.out.println("Se ha creado el perro");
    }
    
    void eat(){
        System.out.println("Comiendo croqueta");
    }
    void dormir(){
        System.out.println("El perro se durmio");
    }
    void llamar(){
        super.eat();
        dormir();
    }
    
    //caso 1
    String color = "cafe";
    void printColor(){
        //imprime el color de la clase perro
        System.out.println(color);
        //imprime el color de la clase animal
        System.out.println(super.color);
    }
}
public class SuperTest {
    public static void main(String[] args) {
        //Perro p = new Perro();
        new Perro().llamar();
        
        new Perro().printColor();
    }
    
}
