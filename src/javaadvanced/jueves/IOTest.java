
package javaadvanced.jueves;

import java.io.FileOutputStream;
import java.io.IOException;

/*Java I/O
Entrada y Salida
Se utiliza para procesar la entrada y salida. En Java se utiliza el concepto 
El paquete de Java io contiene todas las clases necesarias para realizar operaciones de entrada y salida.
Podemos realizar el manejo de archivos a través de Java I/O
Stream
Es un flujo de datps, que esta compiuesto por byte
Se llama stream porque es como un flujo de agua que sigue corriendo.
En java existen 3 Streams que se creanb para nuestro uso automáticamente.
System.out flujo de salida estándar
System.in  flujo de entrada estándar
System.err flujo de errores estándar
System.out.print(“Error”);
System.err.print(“Error”);
OutputStream vs InputStream
Input: Lee
Output: Escribe

 */
public class IOTest {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\CCC-21\\Documents\\NetBeansProjects\\CuliacanICATSIN-master\\javaadvanced.Martes\\hola.txt");
            fos.write(65); //A (Escribe una A en el arhivo txt)
            fos.close();
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}

