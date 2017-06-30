
package javaadvanced.martes;

/*Polimorfismo 
Existen 3 formas de polimorfismo:
1-	Primitivos: Se implementa gracias a la sobrecarga de métodos.
2-	Real: Se implementa gracias a la redefinición de métodos.
3-	Genérico: Se implementa gracias a las clases genéricas.
Una variable es polimórfica cuando puede referirse a objetos de clases diferentes y en consecuencia puede adoptar distintos comportamientos.
El polimorfismo permite desplegar comportamientos distintos, en las subclases de una jerarquía de herencia cuando ellas activan métodos con la misma firma o signatura.
El empleado e = new Adinistyracion ():
Para manipular al empleado como figura administrador es necesario modelar el tipo de la subclase. El hecho de que una variable apuntadora a un objeto (Tal como la variable “n“) pueda referirse automáticamente a tipos múltiples se llama polimorfismo).
La JVM automáticamente selecciona el método apropiado a tiempo de ejecución, lo que se denomina “LIGADURA DINAMICA”. En conclusión todas las variables tipo superclase concretas son polimórficas.

 */

class Bike2{
    void run(){
        System.out.println("running... ");
    }
}

public class Polimorfismo extends Bike2{
    void run(){
        System.out.println("running safely with 90km");
    }
    public static void main(String[] args) {
        Bike2 b = new Polimorfismo();
        /*
        Upcasting -> Cuando la variable de referencia refiere al objeto de la clase hija 
        clsae A(){}
        claseB() extends A()
        A a = new B()
        */
        b.run();
    }
}
