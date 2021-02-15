package movimentoBancario;

public class SportelloAutomatico {

    public static void main(String[] args) {
        
        Conto conto = new Conto();
        Conto conto2 = new Conto(1000);
        
        System.out.println("BENVENUTO IN ATM");
        
        Thread t1 = new Thread(){
            
            @Override
            public void run(){
        
                conto.versa(1000);
                conto.preleva(300);
                conto.versa(2300);
                conto.preleva(657);
                conto.preleva(500);
                conto.interessi(6.7);
        
                System.out.println("SOLDI rimasti : "+ conto.visualizza());
        
        }};
        
        Thread t2 = new Thread(){
            
            @Override
            public void run(){
                               
                conto2.versa(1500);
                conto2.preleva(600);
                conto2.interessi(6.7);
                conto2.pausa(3);
        
                System.out.println("SOLDI rimasti conto2 : "+ conto2.visualizza());

        }};
        
        t1.start();
        t2.start();
    }
    
}
