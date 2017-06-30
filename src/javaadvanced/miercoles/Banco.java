/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.miercoles;

/**
 *
 * @author CCC-21
 */
abstract class Banco {
    abstract int getTasaDeInteres();
}
class HSBC extends Banco{

    @Override
    int getTasaDeInteres() {
        return 7;
    }
}
class Bancomer extends Banco{

    @Override
    int getTasaDeInteres() {
        return 0;
    }
}
class BanCoppel extends Banco{

    @Override
    int getTasaDeInteres() {
        return 9;
    }
}
class PruebaBanco{
    public static void main(String[] args) {
        Banco b;
        b = new HSBC();
        System.out.println("Tasa de interes de HSBC: "+b.getTasaDeInteres());
        b = new Bancomer();
        System.out.println("Tasa de interes de Bancomer: "+b.getTasaDeInteres());
        b = new BanCoppel();
        System.out.println("Tasa de interes de BanCoppel: "+b.getTasaDeInteres());
    }
}