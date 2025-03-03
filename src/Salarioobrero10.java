import java.util.Scanner;

public class Salarioobrero10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("horas trabajas");
        int horasTrabajadas=sc.nextInt();
        double salariohora=5000;
        double salarioTotal=0;
        double horasExtras=0;

        if (horasTrabajadas<=40) {
            salarioTotal = horasTrabajadas*salariohora;
        } else
        horasExtras = horasTrabajadas-40;
        salarioTotal = (horasTrabajadas*salariohora)+(horasExtras * salarioTotal*0.20);

        System.out.println("salario total semanal es: $"+salarioTotal);
    }
}
