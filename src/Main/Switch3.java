package Main;

//3. Mejora a la sentencia Switch
//Tradicionalmente, switch se usaba para valores constantes. Convierta un switch tradicional
//que asigna un valor a una variable en una Switch Expression que devuelva el valor
//directamente.

public class Switch3 {

    public static void main(String[] args) {

        int opcion = 2;

        String metodoEnvio = switch (opcion) {
            case 1 -> "Transporte pesado";
            case 2 -> "Envio Premium";
            case 3 -> "Dron";
            default -> "Envio estandar";
        };

        System.out.println("Metodo de envio: " + metodoEnvio);

    }
}
