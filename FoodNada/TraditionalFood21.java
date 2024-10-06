package FoodNada;
/**
 * TraditionalFood21
 */
public class TraditionalFood21 extends Food21 {

    private String originArea;
    private int preparationTime;

    public TraditionalFood21() {
        super(); 
        this.originArea = "Unknown Area";
        this.preparationTime = 0;
    }

    public TraditionalFood21(String name, double price, int calories, String originArea, int preparationTime) {
        super(name, price, calories); 
        this.originArea = originArea;
        this.preparationTime = preparationTime;
    }

    public void displayOriginArea() {
        System.out.println("Origin Area         : " + originArea);
    }

    public String getPreparationTimeInfo() {
        return "Preparation time    : " + preparationTime + " minutes" + "\n";
    }
}