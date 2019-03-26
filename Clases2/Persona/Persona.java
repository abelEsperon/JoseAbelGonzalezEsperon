import java.util.Date;
public class Persona{

    //Atributos 
    private String nombre;
    private int edad;
    private boolean sexo; 
    private Date dateCreate;

    //Constructor 
    public Persona(){}
    public Persona(String nombre,int edad, Boolean sexo ){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    //Metodo
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public Date getDateCreated(){
        Date Utt =new Date();
        return Utt;
    }
    public static void main(String[]abel){

        Estudiante est1 = new Estudiante();
        Estudiante est2 = new Estudiante();
        Estudiante est3 = new Estudiante();

        Profesor pro1 = new Profesor();
        Profesor pro2 = new Profesor();
        Profesor pro3 = new Profesor();


    }
}