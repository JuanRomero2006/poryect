import java.util.Scanner;

public class Utilidadtrabajo9 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Ingrese el salario mensual del trabajador: ");
        double salario = sc.nextDouble();

        System.out.print("Ingrese la antigüedad del trabajador en la empresa (en años): ");
        int antiguedad = sc.nextInt();

        double utilidad = 0;

        if (antiguedad < 1) {
            utilidad = salario * 0.05;
        } else if (antiguedad >= 1 && antiguedad < 2) {
            utilidad = salario * 0.07;
        } else if (antiguedad >= 2 && antiguedad < 5) {
            utilidad = salario * 0.10;
        } else if (antiguedad >= 5 && antiguedad < 10) {
            utilidad = salario * 0.15;
        } else if (antiguedad >= 10) {
            utilidad = salario * 0.20;
        }

        System.out.println("La utilidad anual que recibirá el trabajador es: $" + utilidad);
    }
}

