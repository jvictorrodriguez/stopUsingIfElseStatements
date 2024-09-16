package O2_OptimizationWithFactoryPattern;

public class ExpressShipping implements ShippingCostStrategy{
    @Override
    public double calculate(double weight) {
        return weight * 10;
    }
}
