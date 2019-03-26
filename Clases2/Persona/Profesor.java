public class Profesor extends Persona{
    
    private int matricula;

    
    public Profesor(){}
    public Profesor(int matricula){}
    public Profesor(int matricula,String nombre,int edad, String sexo){
        super(nombre,edad,sexo);
        this.matricula = matricula;
    }
    
    public double getNoDoc() {
        return matricula;
    }
    
    public void setNoDoc(int matricula) {
        this.matricula = matricula;
    }
}