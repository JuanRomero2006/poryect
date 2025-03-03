import java.util.Scanner;

public class Heladeria {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean indSabor = true, indFac = true;
        int acumLimon = 0, acumnNuez = 0, acumLulo = 0, acumFresa = 0, acumCrema = 0;
        int cantidad = 0;
        int numFac = 1;
        while (indFac) {
            System.out.println("No. Fac"+numFac);
            indFac = true;
            while (indSabor) {
                mostrarMenu();
            int sabor = sc.nextInt();
            sc.nextLine();
                switch (sabor) {
                    case 1:
                        System.out.println("cantidad de paletas de limón");
                        int cantL = sc.nextInt();
                        sc.nextLine();
                        acumLimon+=cantL;
                        break;
                    case 2:
                        System.out.println("cantidad de paletas de Nuez");
                        int cantN = sc.nextInt();
                        sc.nextLine();
                        //valida la cantidad
                        acumnNuez+=cantN;
                        break;
                    case 3:
                        System.out.println("cantidad de paletas de Lulo");
                        int cantLu = sc.nextInt();
                        sc.nextLine();
                        //valida la cantidad
                        acumLulo+=cantLu;
                        break;
                    case 4:
                        System.out.println("cantidad de paletas de fresa");
                        int cantF = sc.nextInt();
                        sc.nextLine();
                        //valida la cantidad
                        acumFresa+=cantF;
                        break;
                    case 5:
                        System.out.println("cantidad de paletas de crema");
                        int cantC = sc.nextInt();
                        sc.nextLine();
                        //valida la cantidad
                        acumCrema+=cantC;
                        break;
                    default:
                        System.out.println("Error en el sabor ingresado");
                        
                }
                System.out.println("Desea incluir otro sabor (S/N)");
                String rta = sc.nextLine();

                if (rta.toUpperCase().equals("S")) {
                    indSabor = true;
                    
                }
                else
                    indSabor = false;   
                }

                System.out.println("Deseas otro factura(S/N)");
                String rta = sc.nextLine();
                if (rta.toUpperCase().equals("S")) {
                    indFac = true;
                    numFac++;   
                }
                
                else
                    indFac = false;
            }
            System.out.println("sabo        CantVenta       TotalVenta");
            System.out.println("Limon       "+acumLimon+"     "+(acumLimon*2500));
            System.out.println("nuez        "+acumnNuez+"      "+(acumnNuez*2800));
            System.out.println("Lulo        "+acumLulo+"       "+(acumLulo*2600));
            System.out.println("frasa       "+acumFresa+"      "+(acumFresa*2000));
            System.out.println("Crema     "+acumCrema+"         "+(acumCrema*3000));
        }
        public static void mostrarMenu() {
            System.out.println("");
            System.out.println("Menú");
            System.out.println("1 Limon");
            System.out.println("2 Nuez");
            System.out.println("3 Lulo");
            System.out.println("4 Fresa");
            System.out.println("5 Crema");
                    
        }
        public static int leerCantidad(String sabor){
            Scanner entrada=new Scanner(System.in);
            int cantidad;
            System.out.println("cantidad de helado de"+sabor+":");
            do{
                cantidad=entrada.nextInt();

            } while(cantidad<=0);
            return cantidad;
        }
    }
    //public static void (){}
    //revisar el codigo y optimizar las variables por al de los arreglos
    //y por lo menos una vairable


