package O3_OptimizationUsingStrategyPattern;

public class InternationalShipping implements ShippingCostStrategy {
    @Override
    public double calculate(double weight) {
        return weight * 50.0;
    }
}
