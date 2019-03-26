public class Estudiante extends Persona{
    //Atributos 
    private int matricula;
    private String nombre;
    private int edad;
    private boolean sexo;

    //Constructor 
    Estudiante(){}
    Estudiante(int matricula){}
    Estudiante(int matricula, String nombre, int edad, String sexo){
        super(nombre,edad,sexo);
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = false;
    }
    //Metodo
    public double getMatricula() {
        return matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}