
package javaadvanced.miercoles;

/*Hilo: Subproceso ligero unidad pequeña de procesamiento. Es una vía de ejecución separada.
Los hilos son independientes, si se produce 
Ventajas de usar hilos
1-	No bloqueamos al usuario porque son tareas al mismo tiempo.
2-	Podemos realizar muchas tareas simultáneas ahorrando tiempo.
3-	Los hilos al ser independientes no se afectan entre sí, en caso de ocurrir, una excepción en un hilo los demás funcionan igual.
Multitarea: Proceso de ejecución de muchas tareas simultáneamente.
Usamos la multitarea en el CPU. Se logra de dos maneras:
1-	Multitarea basada en procesos 
*Cada proceso tiene su propia dirección en memoria, es decir, asigna un área de memoria separada.
*El Proceso es pesado.
*El costo de la comunicación entre el proceso es alto.
*Cambiar de un proceso a otro requiere de tiempo para guardar y cargar registros, mapas de memoria, listas de actualizaciones.
2-	Multitarea basada en hilos(Multihilos)
*Los hilos comparten los mismos espacios en memoria para direcciones.
*El hilo es ligero.
*El costo de comunicación entre hilos es bajo.

Paralelismo
Concurrencia: Es una propiedad de los sistemas para soportar múltiples peticiones, auxiliándose de Multiprocesamiento y MultiHilos logrando la multitarea.
Ciclo de vida de un hilo
Un hilo puede encontrarse en uno de sus cinco estados. De acuerdo con Oracle solo hay 4 en el ciclo de ejecutables (Running) no existe.
New, runnable, non-nunnable and terminated.
1-	New: El hilo esta en este estado, si se crea una instancia de la clase Thread pero antes de la invocacion de start();
2-	Runnable: El hilo está aquí después de la invocación del método start(), pero el ThreadScheduler (Administrador de hilos) no lo ha seleccionado como el hilo de ejecución.
3-	Running: El hilo está aquí cuando el TS lo ha seleccionado
4-	Non-Runnable: (Bloqued) Es el estado cuando un hilo sigue activo, sin embargo no es apto para ejecutarse.
5-	Terminated: Es el estado cuando el hilo ha finalizado, muerto, cuando sale del  método run().
Hay dos formas de crear un hilo:
1-	Al extender de una clase Thread.
2-	Al implementar la interface Runnable.
Clase Thread
Proporciona los constructores y métodos para crear y realizar operaciones en un hilo. La clase Thread extiende de la clase Object e implementa la interfaz Runnable.
Constructores comunes de la clase Thread
Thread()
Thread(String name)
Thread(Runnable r)
Thread(Runnable r, String name)

Runnable: 
La interfaz de runnable debe ser implementada por cualquier clase cuyas instancias estén destinadas a ser ejecutadas por un hilo.
La interfaz tiene un solo método denominado run().
Public void run(): es usado para realizar la acción de un hilo.

 */
public class Hilos extends Thread{
    public void run(){
        System.out.println("El hilo esta corriendo");
    }
    public static void main(String[] args) {
        Hilos hilo = new Hilos();
        Thread thread = new Thread(hilo);
        thread.start();
        
    }
}



//Ejemplos de Runnable
class HilosR implements Runnable{
    @Override
    public void run(){
        System.out.println("El hilo de runable esta corriendo");
    }
    public static void main(String[] args) {
        HilosR h = new HilosR();
        Thread t = new Thread(h);
        t.start();
    }
}
