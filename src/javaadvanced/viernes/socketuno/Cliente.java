
package javaadvanced.viernes.socketuno;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/*
 */
public class Cliente {
    public static void main(String[] args) {
        try {
            //ip del cliente
            Socket s = new Socket("192.168.1.83",8888); //inicializacion o constructor
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            DataInputStream dis = new DataInputStream(s.getInputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Escriba el Mensaje ");
            
            String str="", str2 = "";
            while(!str.equals("stop")){
                str = br.readLine();
                dos.writeUTF(str);
                
                str2 = dis.readUTF();
                System.out.println("El servicor dice: "+str2);
                dos.flush();
            }
            
            
            
            dos.flush();
            dos.close();
            dis.close();
            s.close();
            
            
            
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
