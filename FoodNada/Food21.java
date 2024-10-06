package FoodNada;
/**
 * Food21
 */
public class Food21 {

    private String name;
    private double price;
    private int calories;

    public Food21() {
        this.name = "Unknown Food";
        this.price = 0.0;
        this.calories = 0;
    }

    public Food21(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    public void printInfo() {
        System.out.println("Name                : " + name);
        System.out.println("Price               : " + price);
        System.out.println("Calories            : " + calories);
    }

    public int calculateTotalCalories(int servings) {
        return calories * servings;
    }
}