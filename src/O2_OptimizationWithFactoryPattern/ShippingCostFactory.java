package O2_OptimizationWithFactoryPattern;

import java.util.HashMap;
import java.util.Map;

public class ShippingCostFactory {
    private static final Map<String, ShippingCostStrategy> strategies = new HashMap<>();

    static{
        strategies.put("STANDARD", new StandardShipping());
        strategies.put("EXPRESS", new ExpressShipping());
        strategies.put("SAME_DAY", new SameDayShipping());
        strategies.put("INTERNATIONAL", new InternationalShipping());
        strategies.put("OVERNIGHT", new OvernightShipping());
    }

    public static ShippingCostStrategy getStrategy(String shippingType){
             ShippingCostStrategy strategy = strategies.get(shippingType);
             if(strategy == null){
                 throw new IllegalArgumentException("Unknown shipping type " + shippingType);
             }
             return strategy;
    }
}
