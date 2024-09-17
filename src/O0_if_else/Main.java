package O0_if_else;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de ShippingCostCalculator
        ShippingCostCalculator calculator = new ShippingCostCalculator();

        // Datos de ejemplo
        String shippingType = "EXPRESS";
        double weight = 2.5;  // peso en kg

        // Calcular el costo de envío
        double cost = calculator.calculateShippingCost(shippingType, weight);

        // Mostrar el resultado
        System.out.println("El costo de envío para " + shippingType + " es: $" + cost);
    }
}
