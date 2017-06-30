/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.martes;

class Animal{
    void eat(){
        System.out.println("Tomando leche");
    }
}
class Dog{
    void eat(){
        System.out.println("Tomando leche");
    }
}
class Cachorro{
    void eat(){
        System.out.println("Tomando leche");
    }
}

public class PolimorfismoT {
    public static void main(String[] args) {
        Animal a;
        a = new Animal();
        a.eat();
        a = new Dog();
        a.eat();
        a = new Cachorro();
        a.eat();
    }
}
