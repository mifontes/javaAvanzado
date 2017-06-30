
package javaadvanced.jueves;

import java.io.FileInputStream;
import java.io.IOException;

/*
 */
public class IOTest3 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\CCC-21\\Documents\\NetBeansProjects\\CuliacanICATSIN-master\\javaadvanced.Martes\\magia.txt");
        int i = fis.read();
            System.out.println((char)i);
            fis.close();
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
