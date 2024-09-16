package optimize_using_enum;

public class Main {
    public static void main(String[] args) {
        var calculator = new ShippingCostCalculator();
        var cost = calculator.calculateShippingCost(ShippingType.EXPRESS, 2.5);
        System.out.println("Shipping cost: " + cost);
    }
}
