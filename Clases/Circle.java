public class Circle {
    //Atributos
    double area,length,perimeter,width;

    //Metodos
    public void calcArea(){
        area = Math.PI * Math.pow(width / 2), 2); 
    }
    public void calcPerimeter(){
        perimeter = 2 * Math.PI * (width / 2);
    }
    public double getArea(){
        return area;
    }
    public double getPerimeter(){
        return perimeter;
    }
    public void setLength(double Length){

    }
    public static void main(String[] args){
        //Circle circle1;
        //circle1 = new Circle();
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();

        circle1.width = 5.2d;
        circle2.width = 10d;
        circle3.width = 20d;

        circle1.calcArea();
        circle2.calcArea();
        circle3.calcArea();

        System.out.printhln("El area de circle1 es:" + circle1.getArea());
        System.out.printhln("El area de circle2 es:" + circle2.getArea());
        System.out.printhln("El area de circle1 es:" + circle3.getArea());

        circle1.calcPerimeter("El perimetro de circle1 es:"+ circle1.getPerimeter());
        circle2.calcPerimeter("El perimetro de circle1 es:"+ circle2.getPerimeter());
        circle3.calcPerimeter("El perimetro de circle1 es:"+ circle3.getPerimeter());

        System.out.printhln("El perimetro de circle1 es:" + circle1.getPerimeter());
        System.out.printhln("El perimetro de circle2 es:" + circle2.getPerimeter());
        System.out.printhln("El perimetro de circle1 es:" + circle3.getPerimeter());
    }
}