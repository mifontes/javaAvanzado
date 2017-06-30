
package javaadvanced.martes;


public class Banco {
    int getTazaDeInteres(){
        return 0;
    }
}

class Bancomer extends Banco{
    @Override
    int getTazaDeInteres(){
        return 0;
    }
}
class HSBC extends Banco{
    @Override
    int getTazaDeInteres(){
        return 7;
    }
}
class Bancoppel extends Banco{
    @Override
    int getTazaDeInteres(){
        return 9;
    }
}
class pruebaBanco{
    
    public static void main(String[] args) {
        Bancomer b = new Bancomer();
        HSBC h = new HSBC();
        Bancoppel bc = new Bancoppel();
        
        System.out.println("Bancomer taza de interes : " + b.getTazaDeInteres());
        System.out.println("HSBC taza de interes : " + b.getTazaDeInteres());
        System.out.println("Bancoppel taza de interes : " + b.getTazaDeInteres());
    }
}