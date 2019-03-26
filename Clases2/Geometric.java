
class Geometric{
    private String color;
    private boolean filled;
    private Date dateCreated;

    
    Geometric(){}
     
    Geometric(double Largo, double alto) {

    }
    Geometric(double radius ,String color,boolean filled){
        this.radius = radius;
        color = "";
        filled = false;
    }
     public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return Math.PI * Math.pow(radius), 2);
    }
    public double getPerimeter(){
        return 2 * Math.PI * (radius);
    }
    public double getDiameter(){
        return radius*2;
    }
    public void printCircle(){
        System.out.println("El area es: "+);
    }

    public static void main(String[] args) {
        Circle cir1 = new Circle();
        Circle cir2 = new Circle(23.5);
        Circle cir3 = new Circle(23.5,"red",true);

        Rectangle rectangulito1 = new Rectangle();
        Rectangle rectangulito2 = new Rectangle(15.3,30.5);
        Rectangle rectangulito3 = new Rectangle(15.3,30.5, "blue", false);
        
    }    
}