/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.jueves;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 *
 * @author CCC-21
 */
public class IOTest7 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\CCC-21\\Documents\\NetBeansProjects\\CuliacanICATSIN-master\\javaadvanced.Martes\\magii.txt");
            
            FileInputStream fis2 = new FileInputStream("C:\\Users\\CCC-21\\Documents\\NetBeansProjects\\CuliacanICATSIN-master\\javaadvanced.Martes\\magia.txt");
            
            SequenceInputStream sis = new SequenceInputStream(fis, fis2);
            int i;
            while((i=sis.read())!=-1){
                System.out.print((char)i);
            }
            sis.close();
            fis.close();
            fis2.close();
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}
