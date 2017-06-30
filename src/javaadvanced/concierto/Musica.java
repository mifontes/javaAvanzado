/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.concierto;

    import java.io.File;
    import javax.sound.sampled.AudioSystem;
    import javax.sound.sampled.Clip;

/**
 *
 * @author CCC-21
 */
public class Musica {
    
    public Musica(File file){
        try {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(file));
            sonido.start();
            System.out.println("Reproduciendo 10s. de sonido...");
            Thread.sleep(9000); // 1000 milisegundos (10 segundos)
            sonido.close();
        }
        catch (Exception tipoerror) {
            System.out.println("" + tipoerror);
        }
    }
}
