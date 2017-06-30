
package javaadvanced.martes;

/*
    Es una variable de auto referencia.
This tiene 6 usos en Java
-This para referir a la variable de la instancia de la clase actual
-This para invocar el método de una clase actual.
-This() para invocar al constructor de una clase (actual).
-This puede ser pasado como argumento en la llamada a un método.
-This se puede pasar como argumento en la llamada al constructor.
-This se puede utilizar para devolver la instancia de la clase actual del método.
 */
public class Student {
    int matricula;
    String nombre;
    String universidad;
    
    //caso 6
     public Student(){
        
    }
    Student getStudent(){
        return this;
    }
    void msg(){
        System.out.println("Soy un mensaje");
    }
    
    //caso 5
    PruebaEstudiante obj;
    
    public Student(PruebaEstudiante obj){
        this.obj = obj;
    }
    void a(){
        System.out.println(obj.dato);
    }
    /*
    public Student(){
        System.out.println("Soy un constructor por defoult");
    }*/
        
    //This caso 3
    public Student(int a){
        this();
        System.out.println(a);
    }
    
     //This caso 4
    public Student(int matricula, String nombre, String universidad, int a){
        //this();
        this(matricula,nombre,universidad);
        System.out.println(a);
    }
    
    public Student(int matricula, String nombre, String universidad){
        //This caso 1
        this.matricula = matricula;
        this.nombre = nombre;
        this.universidad = universidad;
    }
    void display(){
        String msg = "La matricula es "+ matricula;
        msg+="\n El nombre es: "+nombre;
        msg+="\n La universidad es: "+universidad;
    
        System.err.println(msg);
    }
    //This caso 2
    void mensaje(){
        System.out.println("Soy un Mensajito");
        this.display();
    }
}

