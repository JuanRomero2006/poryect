import java.util.Scanner;

public class Calificacionservsocial8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la edad de la persona: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese la antigüedad en el empleo (en años): ");
        int antiguedad = sc.nextInt();

        if (edad >= 60 && antiguedad < 25) {
            System.out.println("La persona se jubilará por edad.");
        } else if (edad < 60 && antiguedad >= 25) {
            System.out.println("La persona se jubilará por antigüedad joven.");
        } else if (edad >= 60 && antiguedad >= 25) {
            System.out.println("La persona se jubilará por antigüedad adulta.");
        } else {
            System.out.println("La persona no cumple con los requisitos para jubilarse en el año 2004.");
        }
    }
}

