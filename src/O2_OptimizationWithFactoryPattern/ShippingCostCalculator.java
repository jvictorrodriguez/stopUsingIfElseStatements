package O2_OptimizationWithFactoryPattern;

public class ShippingCostCalculator {
    public double calculateShippingCost(String shippingType, double weight) {
        ShippingCostStrategy strategy = ShippingCostFactory.getStrategy(shippingType);
        return strategy.calculate(weight);
    }
}
