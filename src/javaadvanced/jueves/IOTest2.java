
package javaadvanced.jueves;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 */
public class IOTest2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\CCC-21\\Documents\\NetBeansProjects\\CuliacanICATSIN-master\\javaadvanced.Martes\\magia.txt");
            String s = "Magia!!!";
            byte b[] = s.getBytes();
            fos.write(b);
            fos.close();
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}
