import java.util.Scanner;

public class Laboratorio6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double edad = 0;
        double sexo = 0;
        double nilvelhemoglobina = 0;
        boolean repetir = true;

        System.out.print("Ingrese la edad del paciente: ");
        edad = sc.nextDouble(); 
        while (true) {
            System.out.print("Ingrese el sexo del paciente (1 para masculino, 2 para femenino): ");
            sexo = sc.nextInt();
            if (sexo == 1 || sexo == 2) {
                break; 
            } else {
                System.out.println("Sexo no válido. Por favor, ingrese 1 para masculino o 2 para femenino.");
            }
        }
        System.out.println("Ingrese el nivel de hemoglobina del paciente: ");
        nilvelhemoglobina = sc.nextDouble();

        boolean tieneAnemia=false;

        if (edad<=1.0/12) {
            tieneAnemia = nilvelhemoglobina < 13|| nilvelhemoglobina > 26;
        } else if (edad>6.0/15) {
            tieneAnemia = nilvelhemoglobina < 10 || nilvelhemoglobina > 18;
        } else if (edad<=12.0/12) {
            tieneAnemia = nilvelhemoglobina < 11 || nilvelhemoglobina > 15;
        } else if (edad<=5){
            tieneAnemia = nilvelhemoglobina < 12.5 || nilvelhemoglobina > 15;
        } else if (edad<=10) {
            tieneAnemia = nilvelhemoglobina < 12.6 || nilvelhemoglobina > 15;
        } else if (edad<=15) {
            tieneAnemia = nilvelhemoglobina < 13 || nilvelhemoglobina > 15.5;  
        } else 
            if (sexo==1) {
                tieneAnemia = nilvelhemoglobina < 14 || nilvelhemoglobina > 18;
            } else {
                tieneAnemia = nilvelhemoglobina < 12 || nilvelhemoglobina > 16;             
            }
        if (tieneAnemia) {
            System.out.println("El paciente tiene anemia");
        } else {
            System.out.println("El paciente no tiene anemia");
        } 
    }
}
