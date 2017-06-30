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
//sobrecarga
public class Adder {
    //1. cambiamos el numero de argumentos
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
    //2.Cambiamos el tipo de datos
    static double suma(double c, double d){
        return c+d;
    }
    
    public static void main(String[] args) {
         //1. cambiamos el numero de argumentos
        System.out.println(Adder.add(111, 222));
        System.out.println(add(112, 223, 334));
        
        //2.Cambiamos el tipo de datos
        System.out.println(Adder.suma(11, 22));
        System.out.println(Adder.suma(15.1, 22.2));
    }
}
