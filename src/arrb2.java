import java.util.Scanner;

public class arrb2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double inditemp = true;
        int biarr[][];
        biarr=new int[4][];
        biarr[0]=new int[3];
        biarr[1]=new int[2];
        biarr[2]=new int[4];
        biarr[3]=new int[3];
        
        System.out.println(biarr.length);
        System.out.println(biarr[2].length);

        for(int f=0; f<biarr.length; f++){
            for(int c=0;c<biarr[f].length;c++){
                biarr[f][c]=(int)Math.random()*30+1;
                System.out.println("biarr["+f+"]["+c+"]="+biarr[f][c]);
                
                System.out.println("Desea incluir otro sabor (S/N)");
                String rta = sc.nextLine();

                if (rta.toUpperCase().equals("S")) {
                    inditemp = true;
                    
                }
                else
                    inditemp = false;
                    
            }
        }
    }
}
//capturar las temperaturas del año 2025 por cada mes
//promedio de temperaturas de año
//promedio de temperatura del mes
//temperatura max y min de cada mes
//temeperatura max y min del año