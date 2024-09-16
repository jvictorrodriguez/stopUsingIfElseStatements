## O3_OptimizationUsingStrategyPattern

-  1 Interfaz `ShippingCostStrategy`
```java
public interface ShippingCostStrategy {
    double calculate(double weight);
}
```

-  5 Clases. Una para cada uno de los sistema de envío. Implementan una interfaz con un solo metodo, "calculate"
   + `STANDARD`     `EXPRESS` `SAME_DAY` `INTERNATIONAL` `OVERNIGHT` 
   
   ```java
   
   public class StandardShipping implements ShippingCostStrategy{
    @Override
    public double calculate(double weight) {
        return weight * 5.0;
    }
   }
   ```

- 1 Clase `ShippingCostContext`
```java
public class ShippingCostContext {
private ShippingCostStrategy strategy;

    public void setStrategy(ShippingCostStrategy strategy) {
        this.strategy = strategy;
    }
    public double calculateShippingCost(double weight) {
        return strategy.calculate(weight);
    }
}
```

```java
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
```



- 1 Clase `Main`
```java
public class MainCost {

    public static void main(String[] args) {
        ShippingCostCalculator calculator = new ShippingCostCalculator();

        double weight = 10.0;

        String shippingType1 = "STANDARD";
        double cost1 = calculator.calculateShippingCost(shippingType1, weight);
        System.out.println("Shipping cost for " + shippingType1 + ": " + cost1);

        String shippingType2 = "EXPRESS";
        double cost2 = calculator.calculateShippingCost(shippingType2, weight);
        System.out.println("Shipping cost for " + shippingType2 + ": " + cost2);

        String shippingType3 = "SAME_DAY";
        double cost3 = calculator.calculateShippingCost(shippingType3, weight);
        System.out.println("Shipping cost for " + shippingType3 + ": " + cost3);

        String shippingType4 = "INTERNATIONAL";
        double cost4 = calculator.calculateShippingCost(shippingType4, weight);
        System.out.println("Shipping cost for " + shippingType4 + ": " + cost4);

        String shippingType5 = "OVERNIGHT";
        double cost5 = calculator.calculateShippingCost(shippingType5, weight);
        System.out.println("Shipping cost for " + shippingType5 + ": " + cost5);
    }

}
```



- 
