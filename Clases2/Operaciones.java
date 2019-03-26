import java.util.Scanner;
public class Operaciones{

    private float a,b;
    
    public void setA(float a) {
        this.a = a;
    }
    public void setB(float b) {
        this.b = b;
    }
    public float suma(){
        return a+b;
    }
    public float resta(){
        return a-b;
    }
    public float multiplicacion(){
        return a*b;
    }
    public float division(){
        return a/b;
    }
    public static void main(String[] args) {
        
        Operaciones op = new Operaciones();
        Scanner scanner = new Scanner(System.in);

        
        int opcion =0;
        while (opcion!=6){
            System.out.println("Elija una opcion");
            
            System.out.println("1) Leer 2 numeros\n 2) Sumar a y b\n 3)Restar a y b\n 4) Multiplicar a y b\n 5) Dividir a y b\n 6) Salir");
            opcion = scanner.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Introduce dos numeros reales");
                    float a = scanner.nextFloat();
                    op.setA(a);
                    float b = scanner.nextFloat();
                    op.setB(b);
                break;
                case 2:
                    System.out.println("La suma es igual a: "+op.suma());
                break;
                case 3:
                    System.out.println("La resta es igual a: "+op.resta());
                break;
                case 4:
                    System.out.println("La multiplicacion es igual a: "+op.multiplicacion());
                break;
                case 5:
                    System.out.println("La division es igual a: "+op.division());
                break;
                default: System.out.println("Bye...");
                break;
            }
        }

    }
}