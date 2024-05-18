public class Circle extends Shape{
    private int radius;
    public static final double PAI= 3.14;

    public Circle(int thicknessFrame,String color,int radius){
        super(thicknessFrame,color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PAI * (radius * radius);
    }

    @Override
    public double getPerimeter() {
        return 2 * PAI * radius;
    }
    public String toString(){
        return super.toString() + "\nRadius: " + this.radius + "\n" +
               "Area: " + getArea() + "\n" + "Perimeter: " + getPerimeter();
    }
}
