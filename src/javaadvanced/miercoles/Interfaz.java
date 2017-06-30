
package javaadvanced.miercoles;

/*Interfaz:
Una interfaz en java es un modelo de una clase.
Tiene constantes estáticas y métodos abstractos. La interfaz en java es un mecanismo para lograr la abstracción. Solo puede contener métodos abstractos que carecen de implementación. También permite la simulación de herencia múltiple, representa una relación IS -> A
No se puede instanciar… como las clases abstractas.
¿Por qué utilizar interfaces?
1-	Para lograr la abstracción.
2-	Por interfaces podemos simular la herencia múltiple.
3-	Para lograr bajo acoplamiento.
A partir de Java 8, la interfaz contiene métodos predeterminados y estáticos.

 */

interface Mostrar{
    //Que hace..
    void show();
    
}

public class Interfaz implements Mostrar{

    @Override
    public void show() {
        System.out.println("Hola");
    }
    
    public static void main(String[] args) {
        Interfaz i = new Interfaz();
        i.show();
    }
}
