//tablas de multiplicar

import java.util.Scanner;

public class Rep {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("valor de tabla a generar");
    int vr=sc.nextInt();
    System.out.println("Numero de termino");
    int nt=sc.nextInt();
    //unsar for
    System.out.println("tabla de multiplicar del "+vr);
    for(int i=1;i<=nt;i++){
        System.out.println(vr+"*"+i+"="+(vr*i));
}
//while
    int i=1;
    while (i<=nt){
        System.out.println("w: "+vr+"*"+i+"="+(vr*i));
        
    }
    }
}
