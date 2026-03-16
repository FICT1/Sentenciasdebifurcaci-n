package Main;

//Ejercicio2
//Sin usar la clase LocalDate, determinar si una fecha (día, mes, año)
//proporcionada por el usuario es válida. Se deben manejar meses de 30/31 días y
// la excepción de febrero en años bisiestos.

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int dia, mes, año;

    System.out.print("Ingrese el dia: ");
    dia = sc.nextInt();

    System.out.print("Ingrese el mes: ");
    mes = sc.nextInt();

    System.out.print("Ingrese el año: ");
    año = sc.nextInt();

    boolean valida = true;

        if (mes < 1 || mes > 12) {
            valida = false;
        }

        if (dia < 1 || dia > 31) {
            valida = false;}

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
        {
            if (dia > 30) {
                valida = false;}
        }

        if (mes == 2)
        {
            if (año % 4 == 0) {
                if (dia > 29) {
                    valida = false;
                }
            } else {
                if (dia > 28) {
                    valida = false;
                }
            }
        }

        if (valida) {
            System.out.println("La fecha es valida");
        } else {
            System.out.println("La fecha no es valida");
        }
    }

}
