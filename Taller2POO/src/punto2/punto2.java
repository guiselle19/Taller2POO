
package punto2;



public class punto2 {
    public static void main(String[] args) {
        float num1=(float) 18.2,num2=(float) 20.3,num3=(float) 36.5;
        System.out.printf("suma:%.2f%n",sum (num1,num2,num3));
        System.out.printf("prom:%.2f%n",prom (num1,num2,num3));
        System.out.printf("prod:%.2f%n",prod (num1,num2,num3));
        System.out.printf("coci:%.2f%n",coci (num1,num2,num3));
        System.out.printf("modu:%.2f%n",modu (num1,num2,num3));
    }   
       public static float sum(float a,float b,float c){
        return a+b+c;
       }
       public static float prom(float a,float b,float c){   
             return (a+b+c)/3;       
       }          
       public static float prod(float a,float b,float c){
         return  a*b*c;  
       }
       public static float coci(float a,float b,float c){
         return  a/b/c;
       }
        public static float modu(float a,float b,float c){
         return  a%b%c;
        }
}



