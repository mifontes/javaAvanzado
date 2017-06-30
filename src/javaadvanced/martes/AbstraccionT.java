
package javaadvanced.martes;

/*

 */

abstract class Shape{
    abstract void draw();
}

class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("dibujando circulo");
    }
}

public class AbstraccionT extends Shape{
    public static void main(String[] args) {
        Shape s = new AbstraccionT();
        Circle s2 = new Circle();
        s.draw();
        s2.draw();
    }

    @Override
    void draw() {
        System.out.println("dibujando");
    }
    
}
