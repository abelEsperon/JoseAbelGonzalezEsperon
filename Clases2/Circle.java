
class Circle extends Geometric{
    double radius;
    
    Circle(){}
     
    Circle(double Largo, double alto) {

    }
    Circle(double radius ,String color,boolean filled){
        super(color, filled);
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
        return Math.PI * Math.pow(radius) 2);
    }
    public double getPerimeter(){
        return 2 * Math.PI * (radius);
    }
    public double getDiameter(){
        return radius*2;
    }
    public void printCircle(){
        System.out.println("El area es: ");
    }
   
}