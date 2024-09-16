package O2_OptimizationWithFactoryPattern;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String shippingType = "STANDARD";
        ShippingCostCalculator calculator = new ShippingCostCalculator();
        double cost = calculator.calculateShippingCost(shippingType, 10);
        System.out.println("El costo de envío para " + shippingType + " es: $" + cost);

    }
}
