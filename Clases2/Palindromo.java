import java.util.Scanner;
class Palindromo {

    private String palabra;

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    public String getPalabra() {
        return palabra;
    }
    public void cambiarPalabra(String pal){
        String palabraCambiada= "" ;
        int longitud = palabra.length();
        
            palabraCambiada += palabra.charAt(longitud-1);
        
        if (palabra == palabraCambiada){
            System.out.println(palabra + " No es un palindrmo");
        }else System.out.println(palabra + "Es un palindromo");
    }

    public static void main(String[] args) {
        Palindromo p = new Palindromo();
        Scanner scanner= new Scanner(System.in);

        System.out.println("Escriba una palabra");
        
        String pal= scanner.next();
        p.setPalabra(pal);
        
        p.cambiarPalabra(pal);
        System.out.println(p.getPalabra());
    }
}