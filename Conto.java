
package movimentoBancario;


public class Conto {
    
    private double bilancio;
    
    public Conto(){
    
        bilancio = 0;    
    }
    
    public Conto(double bilancioInit){
    
        bilancio = bilancioInit;   
    }
    
    public void versa(double ammont){
        
        bilancio = bilancio + ammont;     
    }
    
    public void preleva(double ammont){
        
        bilancio = bilancio - ammont;   
    }
    
    public double visualizza(){
    
        return bilancio;
    }
    
    public void interessi(double interesse){
    
        bilancio = bilancio - ((bilancio * interesse)/100);
    }
    
    public final int pausa(int sec){
    
    try{
        
        Thread.sleep(1000*sec);
        
       }catch(InterruptedException e){}
         
        return sec;
    }

}
