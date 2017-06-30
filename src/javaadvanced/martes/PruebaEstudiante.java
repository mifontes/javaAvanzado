/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.martes;

/**
 *
 * @author CCC-21
 */
public class PruebaEstudiante {
    int dato = 5;
    
    PruebasEstudiante(){
        Student a5 = new Student(this);
        a5.s();
    }
    
    public static void main(String[] args){
        Student s1 = new Student(111, "Fer", "ITLeon");
        Student s2 = new Student(112, "Ara", "UG");
        Student s3 = new Student(113, "Abril", "ITR");
        
        Student s4 = new Student(10);
        
        Student s5 = new Student(10,"juanito","uas",101);
        
        PruebaEstudiante ps1 = new PruebaEstudiante();
        ps1.despliega();
        /* Caso 1
        s1.display();
        s2.display();
        s3.display();*/
        
        //caso 2
        s1.mensaje();
        s2.mensaje();
        s3.mensaje();
        
        //4
        PruebaEstudiante ps1 = new PruebaEstudiante();
        ps1.despliega();
        
        //6
        new Student().getStudent().msg();
        
    }
    
    
    void muestra(PruebaEstudiante obj){
        System.out.println("Método es invocado");
    }
    //4
    void despliega(){
        muestra(this);
    }
}
