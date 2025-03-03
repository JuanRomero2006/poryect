//menu areas

import java.lang.StackWalker.Option;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.util.Scanner;

public class Sw {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion;
    System.out.println("Manú");
    System.out.println("1 circulo");
    System.out.println("2 triangulo");
    System.out.println("3 cuadrado");
    System.out.println("9 salir");
    System.out.println("ingrese una opcion");
    opcion=sc.nextInt();
    switch (opcion){
        case 1:
            System.out.println("valor del radio");
            int radio=sc.nextInt();
            double area=Math.pow(radio, 2);
            System.out.println("area= "+area);
            sc.nextLine();
            break;
        case 2:
            System.out.println("ingrese la altura");
            int altura=sc.nextInt();
            System.out.println("ingrese la base");
            int base=sc.nextInt();
            int areat=(base*altura/2);
            System.out.println("area"+areat);
            sc.nextLine();
             break;
        case 3:
            System.out.println("ingrese lado a");
            int ladoA=sc.nextInt();
            System.out.println("ingrese lado b");
            int ladoB=sc.nextInt();
            int areaC=(ladoA*ladoB);
            System.out.println("area"+areaC);
            sc.nextLine();
            break;
        case 4:
            
        case 9:
    System.out.println("gracias por usar el programa");
        break;

        default:
    System.out.println("opcion equivocada");
            break;
        
    }
    }
}
