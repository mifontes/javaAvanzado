
package javaadvanced.jueves;

import javaadvanced.jueves.Tabla.Hilo1;

/*
La sincronización de Java es la capacidad de controlar el acceso de multipleas hilos en cualquier recurso compartido
La sincronización es la mejor opción cuando queremos permitir que solo un hilo puede acceser a recursos compartidos.
La sincronización es principalmente usada para:
1-	Prevenir la interferencia de hilos.
2-	Prevenir problemas de inconsistencia.
Tipos de Sincronizacion:
1-	Procesos
2-	Hilos: 
a.	Mutualmente Excluyentes
b.	Metodo Sincronizado
c.	Bloqueo Sincronizado
d.	Sincronizacion Estatica
Cooperación: Comunicación entre hilos.
Exclusión Mutua: Ayuda a prevenir que los hilos interfieren entre si mientras comparten información.
Bloqueo: La Sincronización se basa en una entidad interna conocida como lock o monito. Cada objetor tiene un bloqueo asociado a el.
Por convención un hilo necesita un acceso consistente a los campos de un objeto, tiene que adquirir el bloqueo del objeto antes de acceder a ellos y a continuación liberar el bloqueo cuando se hace con ellos.
Desde java 5 el paquete  java.util
Obtiene varias implementaciones de bloqueo.

*/
class Tabla{
    synchronized void imprimir(int n){
        for (int i = 0; i < 5; i++) {
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException in) {
                in.printStackTrace();
            }
        }
    }
    class Hilo1 extends Thread{
        Tabla t;
        Hilo1(Tabla t){
            this.t = t;
        }
        public void run(){
            t.imprimir(5);
        }
    }
    class Hilo2 extends Thread{
        Tabla t;
        Hilo2(Tabla t){
            this.t = t;
        }
        public void run(){
            t.imprimir(100);
        }
    }
}
public class SyncT {
    public static void main(String[] args) {
        Tabla ob =  new Tabla();
        Hilo1 h1 = new Hilo1(ob);
        Hilo2 h1 = new Hilo2(ob);
        
    }
}
