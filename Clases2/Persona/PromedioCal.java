import java.util.Scanner;
class PromedioCal{

    PromedioCal(){
        
    }    
    public void leerCalificacion(){

    }
    public void escribirCalificaciones() {
        
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Numero de calificaciones");
        int cal = scan.nextInt();

        float[]promedio = new float[cal];
        float contador = 0;
		for (int i = 0; i < promedio.length; i++) {
            System.out.print("Ingrese calificacion no."+(i+1));
            promedio[i] = scan.nextInt();   
        }

        for (int i = 0; i<cal; i++){
            System.out.println("Calificacion # "+i);
            System.out.println(promedio[i]); 
            contador = contador + promedio[i]; 
        }
        System.out.println("Su promedio es:"+contador/cal);
        
    }
}