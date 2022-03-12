
package punto3;


public class punto3 {
    public static void main(String[] args) {
        int costf=90000;
        float iva=(float) 0.19,putil=(float) 50,prven,preiva;
        preiva=costf*iva;
        prven=((costf/(100-putil))*100)+preiva;
        
        System.out.println("El precio de venta del articulo es : " + prven);
    } 
}
