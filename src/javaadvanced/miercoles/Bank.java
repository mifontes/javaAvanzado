
package javaadvanced.miercoles;

/*
 */
public interface Bank {
    double getTasaDeInteres(); 
}
class Bancomer3 implements Bank{
    public double getTasaDeInteres(){
        return 7.5;
    }
}
class HSBC3 implements Bank{
    public double getTasaDeInteres(){
        return 8.6;
    }
}
class BanCoppel3 implements Bank{
    public double getTasaDeInteres(){
        return 9.3;
    }
}
class TestBank{
    public static void main(String[] args) {
        Bank b;
        b = new HSBC3();
        System.out.println("Tasa de interes de HSBC: "+b.getTasaDeInteres());
        b = new Bancomer3();
        System.out.println("Tasa de interes de Bancomer: "+b.getTasaDeInteres());
        b = new BanCoppel3();
        System.out.println("Tasa de interes de BanCoppel: "+b.getTasaDeInteres());
    }
}