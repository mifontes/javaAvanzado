/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.jueves;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 *
 * @author CCC-21
 */
public class OITest6 {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\CCC-21\\Documents\\NetBeansProjects\\CuliacanICATSIN-master\\javaadvanced.Martes\\magii.txt");
            
            BufferedInputStream bin = new BufferedInputStream(fis);
            
            int i;
            while((i=bin.read())!=-1){
                System.out.print((char)i);
            }
            
            bin.close();
            fis.close();
            
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}
