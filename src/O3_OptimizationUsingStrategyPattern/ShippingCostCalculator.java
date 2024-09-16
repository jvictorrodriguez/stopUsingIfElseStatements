package O3_OptimizationUsingStrategyPattern;

import java.util.HashMap;
import java.util.Map;

public class ShippingCostCalculator {

    private static final Map<String, ShippingCostStrategy> strategies = new HashMap<>();

    static {
        strategies.put("STANDARD", new StandardShipping());
        strategies.put("EXPRESS", new ExpressShipping());
        strategies.put("SAME_DAY", new SameDayShipping());
        strategies.put("INTERNATIONAL", new InternationalShipping());
        strategies.put("OVERNIGHT", new OvernightShipping());
    }

    private final ShippingCostContext context = new ShippingCostContext();

    public double calculateShippingCost(String shippingType, double weight) {
        ShippingCostStrategy strategy = strategies.get(shippingType);
        if (strategy == null) {
            throw new IllegalArgumentException("Invalid shipping type: " + shippingType);
        }
        context.setStrategy(strategy);
        return context.calculateShippingCost(weight);
    }
}