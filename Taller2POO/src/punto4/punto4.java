
package punto4;



public class punto4 {
    public static void main(String[] args) {
        int numdviaje= 5,clitgasolina=12000,psdias=5000,pajesdia=60000, gasoldias, extra;
        float totkcdia=400,pklgasol=40;
        
        
        gasoldias= (int) (totkcdia/pklgasol)*clitgasolina;
         extra= pajesdia+psdias; 
    
        System.out.printf("el costo total del viaje: %d%n", costviaje (gasoldias,extra,numdviaje)  );}  
    
        
         public static int costviaje (int a,int b,int c){
             return (a+b)*c;
             
         }
                 
    

        
        
    }
    

