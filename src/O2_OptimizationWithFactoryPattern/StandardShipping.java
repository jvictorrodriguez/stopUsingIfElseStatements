package O2_OptimizationWithFactoryPattern;

public class StandardShipping implements ShippingCostStrategy{
    @Override
    public double calculate(double weight) {
        return weight * 5.0;
    }
}
