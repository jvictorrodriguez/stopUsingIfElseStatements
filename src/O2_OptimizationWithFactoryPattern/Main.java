package O2_OptimizationWithFactoryPattern;

public class Main {
    public static void main(String[] args) {
        //La clase ShippingCostCalculator
        String shippingType = "STANDARD";

        //Se instancia un objeto de la Clase que:
        // -recuperará una instancia del tipo del Shipping
        // - obtendré el resultado del cálculo para ese objeto
        ShippingCostCalculator calculator = new ShippingCostCalculator();
        double cost = calculator.calculateShippingCost(shippingType, 10);
        System.out.println("El costo de envío para " + shippingType + " es: $" + cost);

    }
}
