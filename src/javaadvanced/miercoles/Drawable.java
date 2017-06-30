
package javaadvanced.miercoles;

/*
 */
public interface Drawable {
    void draw();
}
class SuperHeroe2 implements Drawable{
    public void draw(){
        System.out.println("Dibujando a SuperMan");
    }
}
class SuperVillano implements Drawable{
    public void draw(){
        System.out.println("Dibujando a Lex Luthor");
    }
}
class Historia{
    public static void main(String[] args) {
        Drawable d,e;
        d = new SuperHeroe2();
        e = new SuperVillano();
        d.draw();
        e.draw();
        
    }
}