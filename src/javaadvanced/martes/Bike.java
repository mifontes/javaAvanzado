/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.martes;

/* Constructor de una clase
    Es un conjunto de instrucciones diseñado
    inicializar una instancia de una clase,
    En su declaración o encabezado puede aceptar parámetros
Bike b = new Bike();
Bike() <-- Hace referencia al constructor por omisión.
    
    Antes de su ejecucion, b es null; al final de la llamada "b" es un apuntador
    a un objeto (referencia) con espacio recervado en RAM para contener sus
    valores de atributos y sus apuntadores a métodos.

¿Porqué el constructor no es un método?
    No puedo llamar al constructor usando el operador de indirección.
    Carece de un valor de retorno distinto a un apuntador.
    No puede ser REDEFINIDO ()
    No puede ser declarado con un type

 */
public class Bike {
    //Propiedades del objeto
    int velocidad;
    String color;
    String marca;
    
    //Declaro el constructor implicito
    public Bike(){
        
    }
    
    //Inmutable cuando su valor no cambia durante
    //la ejecución del programa
    
    public Bike (String color, int velocidad){
        this.velocidad = velocidad;
        this.color = color;
    }
    
    public Bike (String color, String marca, int velocidad){
        this.velocidad = velocidad;
        this.color = color;
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }
    
    

    
    
    
    
}
