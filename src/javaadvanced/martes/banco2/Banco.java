/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.martes.banco2;


public class Banco {
    double getTasaDeInteres(){
        return 0;
    }
}
class Bancomer extends Banco{
    int getTazaDeInteres(){
        return 0;
    }
}
class HSBC extends Banco{

    int getTazaDeInteres(){
        return 7;
    }
}
class BanCoppel extends Banco{

    int getTazaDeInteres(){
        return 9;
    }
}
class TestP{
    public static void main(String[] args) {
        Banco b;
        b = new Bancomer();
        System.out.println("La tasa de interes de Bancomer es : "+b.getTasaDeInteres());
        
        b = new HSBC();
        System.out.println("La tasa de interes de HSBC es : "+b.getTasaDeInteres());
        
        b = new BanCoppel();
        System.out.println("La tasa de interes de BanCoppel es : "+b.getTasaDeInteres());
    }
}
