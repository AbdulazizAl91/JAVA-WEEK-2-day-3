public class Square extends Rectangle{

    public Square() {

    }
    public Square(double side){
        super(side,side);

    }
    public Square (double side,String color,boolean filled){
        super(color,filled,side,side);


    }
    public double getSide(){
        return getWidth();

    }
    public void setSide(double width){
        setWidth(width);
        setLength(width);

    }
    @Override
    public double getArea(){
        double area = Math.pow(getSide(),2);
        return area;
    }
    @Override
    public double getPerimeter(){
        double perimeter = getSide() * 4;
        return perimeter;
    }

    @Override
    public String toString() {
        return "A Square with side= " + getSide() + "which is a subclass of " + super.toString();
    }
}
