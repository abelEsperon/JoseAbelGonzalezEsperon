
class Rectangle extends Geometric{
    
    double width, heigth;
    
    Rectangle(){}
     
    Rectangle(double width, double heigth) {
    }
    Rectangle(double width, double heigth,String color,boolean filled){
        super(color,filled);
        this.width = width;
        this.heigth = heigth;
    }
     public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeigth() {
        return heigth;
    }
    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getArea(){
        return heigth*width;
    }
    public double getPerimeter(){
        return (heigth+width)*2;
    }
}