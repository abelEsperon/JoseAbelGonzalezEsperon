import java.util.Scanner;

public class Examen{
    //atributos
    private int num;

    
    //metodos
    public int getNum() {
        return num;
    }

 
    public void setNum(int num) {
        this.num = num;
    }
    public boolean numM(){
        if (num>0)return true;
        else return false; 
    }
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        Examen E1 = new Examen();
               
        for (int i=0; i<10; i++) {
            System.out.println("Ingresa un numero");
            int a=scanner.nextInt();
            E1.setNum(a);
            if (E1.numM() == true){
                System.out.println("Numero positivo");
            } else System.out.println("Numero negativo");
        }
    }
}

