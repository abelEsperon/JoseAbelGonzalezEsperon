import java.util.Scanner;
class Palindromo2 {

   private String palabra; 
     
   public String  getPalabra(){
       return palabra; 
   }

   public void setPalabra(String palabra){
    this.palabra = palabra; 
   }
   
   public String cambiarPalabra(){
       String palabraCambiada = "";
       int longitud = palabra.length();
       //while = mientras para cumplir una condición 
       while (longitud > 0) {
           //+= acumulador 
           //Se le pone -1 porque empesamos a contar desde 0
           palabraCambiada += palabra.charAt(longitud-1);
           longitud--;
       }
       return palabraCambiada;
   }
   public void evaluarPalabra(String palabra2){
       if (palabra.equalsIgnoreCase(palabra2)){
           //equalsIgnoreCase es para ver si es igual e ignorar si la palabra tiene  letras mayusculas
           System.out.println("Es un palindromo");
       } else 
           System.out.println("No es un palindromo");
       
   }
   public static void main(String[] args){
       Palindromo2 p = new Palindromo2();
       Scanner scanner = new Scanner(System.in);
       
        int opc = 0;
        String aux="";  
        while (opc != 3){
        System.out.println("-------palindromos------\n 1) pedir palabra \n 2) evaluar palabra \n 3) salir");

        opc = scanner.nextInt();

        switch (opc) {
  
            case 1:
            System.out.println("Introduce la palabra");
            aux = scanner.next();
                break; 
                
            case 2:
            p.setPalabra(aux);
            System.out.println(aux);
            String cambiada = p.cambiarPalabra();
            p.evaluarPalabra(cambiada);
                 
                break;
        
            default:
                System.out.println("bye bye");
                break;
        }
        }
   } 
}