import java.util.Scanner;
class Calificaciones{
    private double promedio;
    private int noCal;

    
    public double getPromedio() {
        return promedio;
    }
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    public void setNoCal(int noCal){
        this.noCal = noCal;
    }
    public int getNoCal() {
        return noCal;
    }
    public void promediar(double sumatoria){
        promedio = sumatoria/noCal;
    }

    public static void main(String[] args) {
        Calificaciones c = new Calificaciones();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Cuantas calificaciones vas a promediar");
        int n = scan.nextInt();
        c.setNoCal(n);
        int i; double sumatoria = 0;
        for(i=0; i< c.getNoCal(); i++){
            System.out.println("Ingrese la calificacion "+(i+1));
            double aux = scan.nextDouble();
            sumatoria+=aux;
        }
        c.promediar(sumatoria);
        System.out.println("Su promedio es: "+c.getPromedio());
    }
}