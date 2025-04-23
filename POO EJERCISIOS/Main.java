import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    Alumno al = new Alumno("Juan", 5.0);
    
    System.out.println("Nombre: " + al.getNombre());
    System.out.println("Nota: " + al.getNota());
    System.out.println("Aprobada: " + al.Aprobadas());

    String alumnos []= new String[31];
    double nota [] = new double[11];

    
    for (int i=0; i<alumnos.length; i++){
        for (int j=0; j<nota.length; j++){
            if ("fin".equals(alumnos[i])) {
                System.out.println("no hay mas alumnos por ingresar");
                alumnos[i] = sc.nextLine();
                sc.nextInt();
            }
            if (nota[j] >= 5.0) {
                System.out.println("no hay mas notas por ingresar");
                nota[j] = sc.nextDouble();  
            }
            
            System.out.println("Ingrese el nombre del alumno: ");
            alumnos[i]=sc.nextLine();
            System.out.println("Ingrese la nota del alumno: ");
            nota[j]=sc.nextDouble();
            sc.nextLine(); 
        
             
            System.out.println("Nombre: " + alumnos[i]);
            System.out.println("Nota: " + nota[j]);
        }
    }
    }
}