/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.concierto;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.JFrame;

/**
 *
 * @author CCC-21
 */
public class Superheroes extends Thread{
    
    public static void main(String[] args) {
        Superheroes s = new Superheroes();
        //s.loadImages();
        s.loadImages();
        s.loadMusic();
    }
    
    public void loadImages(){
        String ruta = "C:\\Users\\CCC-21\\Documents\\NetBeansProjects\\CuliacanICATSIN-master\\javaadvanced.Martes\\superheroes";
        File file = new File(ruta);
        File[] files = file.listFiles();
        
        JFrame f = new JFrame("Load Image Sample");
            
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        for(int i=0; i<files.length; i++){
            try {
                Imagenes img = new Imagenes(files[i]);
                f.add(img);
                f.pack();
                f.setVisible(true);
                this.sleep(1000);
                f.remove(img);
            } catch (Exception e) {
                System.out.println("Mensaje:" +e.getMessage());
            }
        }
    }
    
    public void loadMusic(){
        String ruta = "C:\\Users\\CCC-21\\Documents\\NetBeansProjects\\CuliacanICATSIN-master\\javaadvanced.Martes\\musicsuperheroes";
        File file = new File(ruta);
        File[] files = file.listFiles();
        
        for(int i=0; i<files.length; i++){
            try {
                Musica mus = new Musica(files[i]);
                //mus.wait();
            } catch (Exception e) {
                System.out.println("Mensaje:" +e.getMessage());
            }
        }
    }    
}
