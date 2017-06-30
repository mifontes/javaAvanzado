/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.viernes.socketuno;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author CCC-21
 */
public class Servidor {
    public static void main(String[] args) throws IOException{
        //Conexion con servidor
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();
        
        //Recibir y enviar datos
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //Textos
        String strCliente = "", strServidor = "";
        
        //Centinela
        while(!strCliente.equals("stop")){
            strCliente = dis.readUTF();
            System.out.println("El cliente dice: "+strCliente);
            
            strServidor = br.readLine();
            dos.writeUTF(strServidor);
            dos.flush();
        }
        
        s.close();
        ss.close();
        dis.close();
        dos.close();
    }
}
