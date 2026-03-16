package Main;

//1. El dilema del Inventario
//Un sistema de logística debe decidir el método de envío.
//        • Regla A: Si el peso es > 50kg y la distancia > 100km, usar “Transporte pesado”.
//        • Regla B: Si el peso es < 50kg pero el producto es “Frágil”, usar “Envío Premium”.
//        • Regla C: Si el peso es < 10kg y la distancia < 20km, usar “Dron”.



public class Inventario1 {

    public static void main(String[] args) {

        double peso = 50;
        double distancia = 100;
        String producto = "Normal";

        if (peso >= 50 && distancia >= 100) {
            System.out.println("Usar Transporte pesado");
        }
        else if (peso <= 50 && producto.equals("Fragil")) {
            System.out.println("Usar Envío Premium");
        }
        else if (peso <= 10 && distancia <= 20) {
            System.out.println("Usar Dron");
        }

    }
}
