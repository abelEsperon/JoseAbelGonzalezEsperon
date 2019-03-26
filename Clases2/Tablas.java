import java.util.Scanner;

class Tablas{
    
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        int opc ;
        int aux = 1;

        do{
            System.out.println("Teclee el numero de tabla que desee generar \nTeclee 0 para salir");
            opc = scan.nextInt();
                    do {
                        System.out.println(opc+" X "+aux+" = "+(opc*aux));
                        aux ++;
                    } while (aux != 11);               
        }while (opc != 0 );
    }

}