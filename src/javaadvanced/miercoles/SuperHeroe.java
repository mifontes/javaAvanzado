
package javaadvanced.miercoles;

/**
 *
 * @author CCC-21
 */

abstract class Poderes{
    Poderes(){
        System.out.println("Estos son los Poderes");
    }
    void Fuerza(){
        System.out.println("Puedo cargar cosas pesadas");
    }
    void Valentia(){
        System.out.println("Lucho contra los malos");
    }
    void Agilidad(){
        System.out.println("Puedo moverme rapido para atracar");
    }
    void Pelea(){
        System.out.println("Conocimiento de pelea");
    }
    abstract void Heroe();
    abstract void SalvarVidas();
}

class CapitanAmerica extends Poderes{
    @Override
    void Heroe(){
        System.out.println("Soy un super Heroe");
    }
    @Override
    void SalvarVidas(){
        System.out.println("Soy super heroe porque salvo personas");
    }
}

public class SuperHeroe {

    public static void main(String[] args) {
        
        CapitanAmerica ca = new CapitanAmerica();
        ca.Agilidad();
        ca.Fuerza();
        ca.Pelea();
        ca.Valentia();
        ca.Heroe();
        ca.SalvarVidas();
    }
}
