/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.viernes.socketTres;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author CCC-21
 */
public class DSender {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket();
        
        String str = "Hola";
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        
        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 1000);
        ds.send(dp);
        ds.close();
        
    }
}
