package O4_OptimiezeUsingStreamAPIandMap;

import java.util.HashMap;
import java.util.Map;

public class ShippingCostCalculator {

    private static final Map<String,Double> shippingCosts = new HashMap<>();
    static{
        shippingCosts.put("STANDARD",5.0);
        shippingCosts.put("EXPRESS",10.0);
        shippingCosts.put("SAME_DAY",20.0);
        shippingCosts.put("INTERNATIONAL",50.0);
        shippingCosts.put("OVERNIGHT",30.0);
    }

    public double calculate(String shippingType, double weight) {
        return shippingCosts.entrySet().stream()
                .filter(entry -> entry.getKey().equals(shippingType))
                .map(Map.Entry::getValue)
                .findFirst()
                .orElse(0.0)
                * weight;
    }
    public static void main(String[] args) {}
}
