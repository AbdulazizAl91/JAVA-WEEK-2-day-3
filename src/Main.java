
public class Main {
    public static void main(String[] args) {

        Shape shape1= new Shape();
        shape1.setColor("black");
        shape1.setFilled(true);
        System.out.println(shape1.toString());

        Shape shape2= new Shape("blue",false);
        System.out.println(shape2.toString());

        Circle circle1 =new Circle(7);
        System.out.println("the radius= "+circle1.getRadius());
        circle1.setRadius(5);
        circle1.setColor("brown");
        circle1.setFilled(false);
        System.out.printf("the radius = %.2f \n",circle1.getArea());
        System.out.printf("the Perimeter = %.2f\n",circle1.getPerimeter());
        System.out.println(circle1.toString());
        System.out.println("");


        Circle circle2 = new Circle();
        circle2.setRadius(6);
        System.out.println("the radius= "+circle2.getRadius());
        circle2.setColor("red");
        circle2.setFilled(true);
        System.out.printf("the radius = %.2f \n",circle2.getArea());
        System.out.printf("the Perimeter = %.2f\n",circle2.getPerimeter());
        System.out.println(circle2.toString());
        System.out.println("");


        Rectangle rectangle1=new Rectangle();
        rectangle1.setLength(4);
        rectangle1.setWidth(7);
        rectangle1.setColor("yellow");
        rectangle1.setFilled(true);
        System.out.printf("the length = %.2f \n",rectangle1.getLength());
        System.out.printf("the width = %.2f \n",rectangle1.getWidth());
        System.out.printf("the area = %.2f\n",rectangle1.getArea());
        System.out.printf("the Perimeter = %.2f\n",rectangle1.getPerimeter());
        System.out.println(rectangle1.toString());
        System.out.println("");


        Rectangle rectangle2=new Rectangle(11,5);
        rectangle2.setColor("white");
        rectangle2.setFilled(false);
        System.out.printf("the length = %.2f \n",rectangle2.getLength());
        System.out.printf("the width = %.2f \n",rectangle2.getWidth());
        System.out.printf("the area = %.2f\n",rectangle2.getArea());
        System.out.printf("the Perimeter = %.2f\n",rectangle2.getPerimeter());
        System.out.println(rectangle2.toString());

        Square square1 = new Square();
        square1.setSide(14);
        square1.setColor("pink");
        square1.setFilled(true);
        System.out.printf("the side = %.2f \n",square1.getSide());
        System.out.printf("the area = %.2f\n",square1.getArea());
        System.out.printf("the Perimeter = %.2f\n",square1.getPerimeter());
        System.out.println(square1.toString());
        System.out.println("");


        Square square2 = new Square(16);
        square2.setColor("orange");
        square2.setFilled(false);
        System.out.printf("the side = %.2f \n",square2.getSide());
        System.out.printf("the area = %.2f\n",square2.getArea());
        System.out.printf("the Perimeter = %.2f\n",square2.getPerimeter());
        System.out.println(square2.toString());






    }
}