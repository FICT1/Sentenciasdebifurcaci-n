package Main;

public class Validador5 {

    public static void main(String[] args) {

        String contrasena = "CARAMELITOS123fff";
        boolean tieneNumero = false;
        boolean tieneMayuscula = false;

        for (int i = 0; i < contrasena.length(); i++) {

            char letra = contrasena.charAt(i);

            if (letra >= '0' && letra <= '9') {
                tieneNumero = true;
            }

            if (letra >= 'A' && letra <= 'Z') {
                tieneMayuscula = true;
            }
        }

        if (contrasena.length() < 8) {
            System.out.println("Insegura");
        }
        else if (contrasena.length() >= 8 && tieneNumero && tieneMayuscula) {
            System.out.println("Fuerte");
        }
        else if (contrasena.length() >= 8 && tieneNumero) {
            System.out.println("Moderada");
        }
        else {
            System.out.println("Insegura");
        }

    }
}