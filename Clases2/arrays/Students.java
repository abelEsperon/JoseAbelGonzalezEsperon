import java.util.Scanner;

    class Students{
    
    private  String courseName;
    private String[] nombre = new String [100];
    private String[] a_paterno = new String [100];
    private String[] a_materno = new String [100];
    private String[] anio_nacimiento = new String [100];
    private String[] correo = new String [100];
    private int numberOfNames;
    private int numberOfapaterno;
    private int numberOfamaterno;
    private int numberOfannio;
    private int numberOfcorreo;

    public void addNombre(String nombres){
        nombre[numberOfNames] = nombres;
        numberOfNames++;
    }
    
    public void deleteNombre(String nombres){
        nombre[numberOfNames] = nombres;
        numberOfNames--;
    }

    public String[] getNombre() {
        return nombre;
    }
    public int getNumberOfNameStudents() {
        return numberOfNames;
    }

    public void addApaterno(String Apaternos){
        a_paterno[numberOfapaterno] = Apaternos;
        numberOfapaterno++;
    }

    public void deleteApaterno(String Apaternos){
        a_paterno[numberOfapaterno] = Apaternos;
        numberOfapaterno--;
    }

    public String[] getApaterno() {
        return a_paterno;
    }
    public int getNumberOfApaternoStudents() {
        return numberOfapaterno;
    }

    public void addAmaterno(String Amaternos){
        a_materno[numberOfamaterno] = Amaternos;
        numberOfamaterno++;
    }

    public void deleteAmaterno(String Amaterno){
        a_materno[numberOfamaterno] = Amaterno;
        numberOfamaterno--;
    }

    public String[] getAmaterno() {
        return a_materno;
    }
    public int getNumberOfAmaternoStudents() {
        return numberOfamaterno;
    }
    
    
    public void addAnio_nacimiento(String anio_nacimientos){
        anio_nacimiento[numberOfannio] = anio_nacimientos;
        numberOfannio++;
    }

    public void deleteAnioNacimiento(String anio_nacimientos){
        anio_nacimiento[numberOfannio] = anio_nacimientos;
        numberOfannio--;
    }

    public String[] getAnio_nacimiento() {
        return anio_nacimiento;
    }
    public int getNumberOfAnio_nacimientoStudents() {
        return numberOfannio;
    }
    
    
    public void addCorreo(String correos){
        correo[numberOfcorreo] = correos;
        numberOfcorreo++;
    }

    public void deleteCorreos(String correos){
        correo[numberOfcorreo] = correos;
        numberOfcorreo--;
    }

    public String[] getcorreo() {
        return correo;
    }
    public int getNumberOfcorreoStudents() {
        return numberOfcorreo;
    }
    
    public static void main(String[] args) {
        Students c1= new Students();
        Scanner scan = new Scanner(System.in);

        int opc=0;
        while (opc!=6){

            System.out.println("\n     ***MENU ***");
            System.out.println("1. Nombre del curso");
            System.out.println("2. Agregar estudiante");
            System.out.println("3. Mostrar estudiante");
            System.out.println("4. Total de estudiantes");
            System.out.println("5. Eliminar estudiante");
            System.out.println("6. Salir\n");
            System.out.println("   Teclee una opcion");
            opc = scan.nextInt();
            switch (opc){
                case 1:
                    System.out.println(" Curso : ");
                    c1.courseName = scan.next();
                break;
                case 2:
                    System.out.println("Nombre: ");
                    String a = scan.next();
                    c1.addNombre(a);
                    System.out.println("Apellido Paterno");
                    String b = scan.next();
                    c1.addApaterno(b);
                    System.out.println("Apellido Materno : ");
                    String c = scan.next();
                    c1.addAmaterno(c);
                    System.out.println("Anio de nacimiento : ");
                    String d = scan.next();
                    c1.addAnio_nacimiento(d);
                    System.out.println("Corrreo : ");
                    String e = scan.next();
                    c1.addCorreo(e);
                break;
                case 3:
                    System.out.println(c1.courseName);
                    for(int i=0; i < c1.getNumberOfNameStudents(); i++){
                    System.out.println("Nombre Estudiante "+(i+1)+": "+c1.nombre[i]);
                    System.out.println("Apellido Paterno: "+c1.a_paterno[i]);
                    System.out.println("Apellido Materno: "+c1.a_materno[i]);
                    System.out.println("Annio de Nacimiento: "+c1.anio_nacimiento[i]);
                    System.out.println("Correo: "+c1.correo[i]);
                    System.out.println("  __________________");
                    }

                break;
                case 4:
                    System.out.println("Numero de estudiantes: "+c1.getNumberOfNameStudents());
                break;

                case 5:
                    System.out.println("Nombre del estudiante");
                    String std = scan.next();
                    for(int i=0; i < c1.numberOfNames; i++){
                        if(c1.nombre[i].equals(std)){
                        c1.deleteNombre(std);
                        c1.deleteApaterno(std);
                        c1.deleteAmaterno(std);
                        c1.deleteAnioNacimiento(std);
                        c1.deleteCorreos(std);
                        System.out.println(" ______________________");
                        System.out.println("| Estudiante eliminado | ");
                        System.out.println("|______________________| ");
                        }else
                            {System.out.println(" ______________________");
                             System.out.println("| Estudiante no existe |");
                             System.out.println("|______________________|");
                        }
                    }
                break;
                default: System.out.println("Good Bye..");
                break;
            }
        }
    }
}
