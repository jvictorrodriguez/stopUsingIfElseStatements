## O2_OptimizationWithFactoryPattern

-  1 Interfaz `ShippingCostStrategy`
```java
public interface ShippingCostStrategy {
    double calculate(double weight);
}
```
-  5 Clases. Una para cada uno de los sistema de envío. Implementan una interfaz con un solo metodo, "calculate"
   + `STANDARD`
   + `EXPRESS`
   + `SAME_DAY`
   + `INTERNATIONAL`
   + `OVERNIGHT` 
   
   ```java
   public class StandardShipping implements ShippingCostStrategy{
    @Override
    public double calculate(double weight) {
        return weight * 5.0;
    }
   }
   ```

-  1 Clase `ShippingCostFactory`
```java
public class ShippingCostFactory {
    //Esta clase crea un objeto de cada clase de envío y lo coloca en un HashMap
    //El objetivo es devolver el objeto que corresponda al String
    //El único mét_odo de la clase devuelve un objeto del HashMap que corresponde con su clave
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
```


-  1 Clase  `ShippingCostCalculator`
```java
  public class ShippingCostCalculator {
    //Esta clase recupera el objeto del tipo de shipping type y devuelve el cálculo
    public double calculateShippingCost(String shippingType, double weight) {
        ShippingCostStrategy strategy = ShippingCostFactory.getStrategy(shippingType);
        return strategy.calculate(weight);
   }
}
``` 
-  1 Clase `Main`
```java
public class Main {
    public static void main(String[] args) {
        //La clase ShippingCostCalculator
        String shippingType = "STANDARD";

        //
        ShippingCostCalculator calculator = new ShippingCostCalculator();
        double cost = calculator.calculateShippingCost(shippingType, 10);
        System.out.println("El costo de envío para " + shippingType + " es: $" + cost);

    }
}
```



- 
