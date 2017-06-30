
package javaadvanced.jueves;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/*
 */
public class IOTest8 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\CCC-21\\Documents\\NetBeansProjects\\CuliacanICATSIN-master\\javaadvanced.Martes\\magii.txt");
        
            FileInputStream fis2 = new FileInputStream("C:\\Users\\CCC-21\\Documents\\NetBeansProjects\\CuliacanICATSIN-master\\javaadvanced.Martes\\magia.txt");
        
            FileOutputStream fos = new FileOutputStream("C:\\Users\\CCC-21\\Documents\\NetBeansProjects\\CuliacanICATSIN-master\\javaadvanced.Martes\\magic.txt");
            
            SequenceInputStream sis = new SequenceInputStream(fis, fis2);
            
            int i;
            while((i=sis.read())!=-1){
                fos.write(i);
                System.out.print((char)i);
            }
            close(fis, fis2, fos, sis);
            
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
    }
    
    private static void close(FileInputStream fis, FileInputStream fis2, FileOutputStream fos, SequenceInputStream sis) throws IOException{
        sis.close();
        fis.close();
        fis2.close();
        fos.close();
    }
}
