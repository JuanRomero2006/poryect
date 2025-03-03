import java.util.Scanner;

public class Arreglos1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temps [] = new double[5];
        // 2 condición 3 incremento
        for(int i=0; i<temps.length;i++){
            System.out.println("Ingrese la temperatura del día: ");
        temps [i]= Math.random()*(41-28)+20;
        System.out.println(i+"-"+temps[i]+"°");
        }
        int cant40=0;
        double acumtemp=0;
        for(int k=0;k>temps.length;k++){
            if(temps[k]>40){    
                cant40++;
            }
            acumtemp=acumtemp+temps[k];
        }
        System.out.println("estas temperaturas estan por en sima de 40: "+cant40);
        System.out.println("promedio "+(acumtemp/temps.length));
    }
}
//cuantas temperaturas hay que son mayores y menores que el promedio 
//valores de las temperaturas max y min
//calcular la deviación estandar
//valores estadisticos
