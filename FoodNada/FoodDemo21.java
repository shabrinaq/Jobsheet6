package FoodNada;
/**
 * FoodDemo21
 */
public class FoodDemo21 {

    public static void main(String[] args) {
        System.out.println("Fast Food");
        System.out.println("============");
        FastFood21 kebab1 = new FastFood21("Kebab", 15000, 620, 10);
        
        kebab1.printInfo();
        kebab1.checkServingTime();

        System.out.println("Traditional Food");
        System.out.println("==================");
        TraditionalFood21 sotoBanjar1 = new TraditionalFood21("Soto Banjar", 14000, 300, "Kalimantan Tengah", 25);
        
        sotoBanjar1.printInfo();
        sotoBanjar1.displayOriginArea();
        System.out.println(sotoBanjar1.getPreparationTimeInfo());
    }
}