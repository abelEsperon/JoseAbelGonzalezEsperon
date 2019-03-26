import java.util.Scanner;

public class Course{
    private  String courseName;
    private String[] students = new String [100];
    private int numberOfStudents;

    //constructor
    /*Course(String course){
        this.courseName = course; 
    } */
    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public int deleteStudent(){
        //students[numberOfStudents] = student;
        return numberOfStudents--;
    }
    public String[] getStudents() {
        return students;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    /*public int contarLetras(){
        return students[].lenght();
    } */
    public static void main(String[] args) {
        Course c1= new Course();
        Scanner scan = new Scanner(System.in);

        int opc=0;
        while (opc!=6){
            System.out.println("Elija una opcion:\n 1.Nombre del curso\n 2.Agregar estudiante\n 3.Mostrar estudiantes\n 4.Mostrar total de estudiantes\n 5.Eliminar estudiante\n6.Salir");
            opc = scan.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Ingrese nombre del curso");
                    c1.courseName = scan.next();
                break;
                case 2:
                    System.out.println("Ingrese el nombre");
                    String e = scan.next();
                    c1.addStudent(e);
                break;
                case 3:
                    System.out.println(c1.courseName);
                    for(int i=0; i < c1.getNumberOfStudents(); i++){
                    System.out.println("Estudiante "+(i+1)+": "+c1.students[i]);
                    }

                break;
                case 4:
                    for(int i=0; i<c1.getNumberOfStudents(); i++)
                        if(c1.students[i].equals("")){
                            c1.deleteStudent();
                        }
                        System.out.println("Numero de estudiantes = "+c1.numberOfStudents);
                break;
                case 5:
                    System.out.println("Estudiante a eliminar");
                    String est = scan.next();
                    for(int i = 0; i< c1.getNumberOfStudents(); i++){
                        if(est.equals(c1.students[i])){
                            c1.students[i] = "";
                        }
                    }
                break;
                default: System.out.println("Good bye");
                break;
            }
    }
    }
}