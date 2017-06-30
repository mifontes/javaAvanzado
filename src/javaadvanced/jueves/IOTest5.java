
package javaadvanced.jueves;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**La clase Java BufferedOutputStream se utiliza para almacenar en un buffer un stream de salida. Internamente utiliza un buffer para almacenar datos directamente en un stream.
Añade mas eficiencia que escribir datos de manera directa en un flujo.
Por lo tanto logra un mejor rendimiento.
Tiene 2 constructores:
BufferedOutputStream(OutputStream os):
Crea un Nuevo flujo de salida de almacenamiento en buffer, que se utiliza para escribir los datos en el stream especificado.
BufferedOutputStream(OutputStream os, in size):
Crea un nuevo flujo de salida que será almacenado en buffer el cual se utiliza para escribir los datos en el stream especificado en tamaño del buffer.
Metodos:
Void write(int b): Escribe el byte especificado en el stream de salida almacenando en buffer. Escribe los bytes de la secuencia de stream de bytes  especificada en n arreglo de bytes. Comienza con el desplazamiento dado.
Void flush(): Borra el flujo se salida almacenado en buffer.
Vacía los datos de una secuencia y la envía a otra secuencia. Se necesita si se ha conectado una secuencia con otra.

 */
public class IOTest5 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\CCC-21\\Documents\\NetBeansProjects\\CuliacanICATSIN-master\\javaadvanced.Martes\\magii.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fos);
            String a = "Hola \n a todos";
            byte[] b = a.getBytes();
            
            bout.write(b);
            bout.flush();
            
            bout.close();
            fos.close();
            
            System.out.println("Listo");
            
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
