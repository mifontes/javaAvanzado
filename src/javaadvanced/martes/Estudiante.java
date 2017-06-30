
package javaadvanced.martes;
/*
    La palabra reservada estatic es usada para
la administración de memoria principalmente. Es aplicada a variables,
métodos, bloques y clases anidadas.
La palabra static pertenece a la clase que la instancia.

Para variables:Se úede utilizar para referir una propiedad comun
entre todos los objetos.
La variable estatica obtiene memoria solo una vez en el area de la clase 
en el momento que se crea.

Promueve la eficiencia en el rendimiento del programa.

*/

public class Estudiante {
    int matricula;
    String nombre;
    static String Universidad = "LAQUESEA";
    
    Estudiante (int m, String n){
        matricula = m;
        nombre = n;
    }
    
    void show(){
        System.out.println(matricula+" "+nombre+" "+Universidad);
    }
    
    public static void main(String[] args){
        Estudiante s1 = new Estudiante(111,"Fer");
        Estudiante s2 = new Estudiante(112,"Emmanuel");
        
        s1.show();
        s2.show();
    }
    
}
