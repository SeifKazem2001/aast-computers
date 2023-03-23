public class Triangle extends GeometricObject {
    //    public String setColor(String color){
//        this.color=color;
//    }
    private double side1;
    private double side2;
    private double side3;
    public Triangle(){}
    public Triangle(String color,boolean filled,double side1,double side2,double side3){
        super(color,filled);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    public double getArea() {
        return Math.sqrt((getPerimeter()/2)*(getPerimeter()/2-side1)*(getPerimeter()/2-side2)*(getPerimeter()/2-side3));
    }

    public double getPerimeter() {
        return side1+side3+side2;
    }
}