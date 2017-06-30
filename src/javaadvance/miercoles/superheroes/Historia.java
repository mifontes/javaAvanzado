/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvance.miercoles.superheroes;

/**
 *
 * @author CCC-21
 */
public class Historia extends Thread{
    public void run(){
        try {
            SuperHeroe sp = new SuperHeroe();
            this.sleep(1600);
            sp.Fuerza();
            this.sleep(1600);
            sp.Valentia();
            this.sleep(1600);
            sp.Agilidad();
            this.sleep(2000);
            sp.Pelea();
            this.sleep(2000);
            sp.Defender();
            this.sleep(2000);
            sp.Justiciar();
            
        } catch (InterruptedException in) {
            in.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Historia h = new Historia();
        h.start();
        Batalla b = new Batalla();
        Thread t = new Thread(b);
        t.start();
    }
}

class Batalla implements Runnable{
    @Override
    public void run(){
        try {
            Villano v = new Villano();
            v.Fuerza();
            Thread.sleep(2000);
            v.Orgullo();
            Thread.sleep(2000);
            v.Agilidad();
            Thread.sleep(2000);
            v.Pelea();
            Thread.sleep(2000);
            v.Egoista();
            Thread.sleep(2000);
            v.Pelear();
        } catch (InterruptedException in) {
            in.printStackTrace();
        }
    }
}

abstract class Poderes extends Thread{
    /*Poderes(){
        System.out.println("Estos son los Poderes de Superheroe");
    }*/
    void Fuerza(){
        System.out.println("S- Puedo cargar cosas pesadas");
    }
    void Valentia(){
        System.out.println("S- Lucho contra los malos");
    }
    void Agilidad(){
        System.out.println("S- Puedo moverme rapido para atacar");
    }
    void Pelea(){
        System.out.println("S- Tengo conocimiento de pelea");
    }
}

class SuperHeroe extends Poderes{
    void Defender(){
        System.out.println("S- Defiendo al indefenso");
    }
    void Justiciar(){
        System.out.println("S- Hago cumplir la justicia");
    }
    
    
}

abstract class Ataques extends Thread{
    /*Ataques(){
        System.out.println("Estos son los Poderes de Villano");
    }*/
    void Fuerza(){
        System.out.println("V- Puedo golpear con fuerza");
    }
    void Orgullo(){
        System.out.println("V- Lucho para salirme con la mia");
    }
    void Agilidad(){
        System.out.println("V- Puedo moverme rapido para hacer trampa");
    }
    void Pelea(){
        System.out.println("V- Planeo las batallas");
    }
}

class Villano extends Ataques{
    void Pelear(){
        System.out.println("V- Busco acabar con la justicia");
    }
    void Egoista(){
        System.out.println("V- Me gusta ganar aun que no tenga la razon");
    }
}
/*
//Callbacks
public void run(){
    //Se utiliza para realizar una accion de
}

sleep
Hace que el hilo actual en ejecucion se detenga temporalmente durante el numero especificado en milisegundos

join 
//Espera a que el hilo se muera

getPriority
//regresa la prioridad del hilo

setPriority
//cambia la prioridad del hilo

getName
//regresa el nombre del hilo

Tra


*/
