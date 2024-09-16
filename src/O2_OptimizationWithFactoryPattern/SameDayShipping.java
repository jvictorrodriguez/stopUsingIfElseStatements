package O2_OptimizationWithFactoryPattern;

public class SameDayShipping implements ShippingCostStrategy{
    @Override
    public double calculate(double weight) {
        return weight * 20;
    }
}
