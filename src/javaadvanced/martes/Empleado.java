
package javaadvanced.martes;

/*
    Herencia es 
 */
//Relacion de Asociación 
public class Empleado {
    double salario = 40000;
    
}

class Programador extends Empleado{
    int bono = 1000;
    
    public static void main() {
        Programador p = new Programador();
        System.out.println("El salario del programador es: " + p.salario);
        System.out.println("El bono del programador es: " + p.bono);
    }
    void mensaje(){
        System.out.println("Soy un Programador");
        main();
    }
}
//Herencia simple Empleado a Programador.
//Herencia multinivel Empleado a Programador - Web.
//Herencia jerarquica Empleado a Programador y Empleado a Web.
class Web extends Programador{
    public static void main(String[] args) {
        Web w = new Web();
        w.mensaje();
    }
}
