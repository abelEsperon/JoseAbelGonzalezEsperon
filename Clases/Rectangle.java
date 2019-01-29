public class Rectangle {
    //Atributos 
    double area,length,perimeter,width;

    //Metodo
    public void calcArea(){
       area = width + length * 2
    }
    public void calcPerimeter(){
        perimeter =  (2 * length) + (width * 2); 
    }
    public double getArea(){
        return 0.0;
    }
    public double getPerimeter(){
        return 0.0;
    }
    public void setLength(length double){

    }
    public void setWidth(doblu Width){
        
    }
        public static void main(String[] args){
        //Rectangle rectangle1;
        //rectangle1= new Rectangle();
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        Rectangle rectangle3 = new Rectangle();

        rectangle1.width = 4.5d;
        rectangle2.width = 12d;
        rectangle3.width = 30d;

        rectangle1.calcArea();
        rectangle2.calcArea();
        rectangle3.calcArea();

        System.out.printhln("El area de rectangle1 es:" + rectangle1.getArea());
        System.out.printhln("El area de rectangle2 es:" + rectangle2.getArea());
        System.out.printhln("El area de rectangle3 es:" + rectangle3.getArea());

        rectangle1.calcPerimeter("El perimetro de rectangle1 es:"+ rectangle1.getPerimeter());
        rectangle2.calcPerimeter("El perimetro de rectangle2 es:"+ rectangle2.getPerimeter());
        rectangle3.calcPerimeter("El perimetro de rectangle3 es:"+ rectangle3.getPerimeter());

        System.out.printhln("El perimetro de rectangle1 es:" + rectangle1.getPerimeter());
        System.out.printhln("El perimetro de rectangle2 es:" + rectangle2.getPerimeter());
        System.out.printhln("El perimetro de rectangle3 es:" + rectangle3.getPerimeter());