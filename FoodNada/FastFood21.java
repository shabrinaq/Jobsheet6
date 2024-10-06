package FoodNada;
/**
 * FastFood21
 */
public class FastFood21 extends Food21 {
       
    private int servingTime;
    
    public FastFood21() {
        super(); 
        this.servingTime = 0;
    }
    
    public FastFood21(String name, double price, int calories, int servingTime) {
        super(name, price, calories); 
        this.servingTime = servingTime;
    }
    
    public void checkServingTime() {
        System.out.println("Serving time        : " + servingTime + " minutes" + "\n");
    }
}