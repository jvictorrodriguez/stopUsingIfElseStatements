package O2_OptimizationWithFactoryPattern;

public class InternationalShipping implements ShippingCostStrategy{
    @Override
    public double calculate(double weight) {
        return weight * 50;
    }
}
