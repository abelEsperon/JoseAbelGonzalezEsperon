import java.math.BigDecimal;
import java.util.Scanner;

public class Cuenta{

    private String titular;
    private double cantidad;

    public void ingresar(Double cantidad){
        this.cantidad = this.cantidad + cantidad;
    }
    public void retirar(Double cantidad){ 
        this.cantidad = this.cantidad - cantidad;
    }
    public String toString(){
        return "Titular: "+ titular + "\n  Total = "+cantidad;
    }
    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }
    /**
     * @return the cantidad
     */
    public double getCantidad() {
        return cantidad;
    }
    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }
    /**
     * @param cantidad the cantidad to set
       this. = para hacer referencia al atibuto */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }


    public static void main(String[] args ){
        
        Cuenta cliente1 = new Cuenta();
        Scanner scanner= new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        cliente1.titular = scanner.next();
        System.out.println("Ingresa la cantidad");
        cliente1.ingresar(100.55);
        System.out.println(cliente1.getCantidad());


        System.out.println("Ingresa la cantidad");
        cliente1.ingresar(200.45);
        System .out.println(cliente1.getCantidad());

        System.out.println("Ingresa la cantidad a retirar");
        cliente1.retirar(150.35);
        System.out.println(cliente1.getCantidad());

        System.out.println(cliente1.toString());
        
        cliente1.getTitular();
        cliente1.getCantidad();

        //condicion que evalue, modificar el metodo retirar cuando la cantidad este en ceros 
        
    }
}