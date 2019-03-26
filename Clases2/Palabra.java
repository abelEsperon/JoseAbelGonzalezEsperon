import java.util.Scanner;
public class Palabra{

    //Atributos 
    
    private String word;

    //Metodos

    public String getWord(){
        return word;
    }

    public void setWord(String word){
        this.word = word;

    }
    public boolean numLet(){
        if (word.length()  >= 8){
            return true;
        }else return false;
    }
     public int contarLetras(){
         return word.length();
     }
     public static void main(String[] args){

         Palabra p = new Palabra();
         Scanner scanner = new Scanner(System.in);

         System.out.println("Escriba una palabra");
         String pal = scanner.next();
         p.setWord(pal);
         System.out.println("La palabra " + p.getWord()+  "tiene " + p.contarLetras()+" palabras");
            if (p.numLet() == true){
        System.out.println("La palabra tiene 8 o más letras");
        }
     }}
