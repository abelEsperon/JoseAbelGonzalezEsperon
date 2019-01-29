import java.util.Scanner;

public class Estudiante{

    //Atributos
    public String nombre;
    public double annioNac, ANNIO_ACTUAL;

    ANNIO_ACTUAL = 2019;

    //Metodos

    public double calcularEdad(){
        
        return (ANNIO_ACTUAL-annioNac);
    }
    public String imprimirInformacion(){
        return System.out.printl("");
    }

    public static void main(String[] args) {
        Estudiante studiante = new Estudiante();

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Teclee su año de nacimiento");
        studiante.annioNac = scanner.nextDouble();


    }   
}