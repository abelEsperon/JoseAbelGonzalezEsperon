import java.util.*;
public class Word{
    //Atributos
    
    public String word;
    public int longitud;

    public void setWord(String word){
        this.word = word;
    }

    public String getWord(){
        return word;
    }

    public String contarLetras(){
        String mensaje = "la palabra"+word+"tiene"+word.length();
        return mensaje;
    }

    public boolean esMayor(){
        if (word.length()>10){
            return true;
            }else{
            return false;
            }
    }


    public void setLongitud(int longitud){
        this.longitud = longitud;
    }

    public int getLongitud(){
        return longitud;
    }

    public static void main(String[]args){
        Word newword = new Word();
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cual es la palabra?: ");
        String word = scanner.next();
        newword.setWord(word);

        System.out.println(newword.contarLetras());

        if (newword.esMayor()){
            System.out.println("El nombre: "+ word +" tiene mas de 8 palabras ");
        }else{
            System.out.println("EL nombre: "+ word +" tiene menos de 8 palabras ");
        }
        System.out.println(newword.contarLetras());
    }
}