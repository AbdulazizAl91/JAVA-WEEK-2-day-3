public class Circle extends Shape{
    double radius =1.0;
    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double area= Math.PI * Math.pow(radius,2);
        return area;
    }
    public double getPerimeter(){
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return "A Circle with radius= "+ radius + " which is a subclass of "+ super.toString();
    }
}
