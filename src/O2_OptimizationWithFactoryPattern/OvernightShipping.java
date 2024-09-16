package O2_OptimizationWithFactoryPattern;

public class OvernightShipping implements ShippingCostStrategy{
    @Override
    public double calculate(double weight) {
        return weight * 30;
    }
}
