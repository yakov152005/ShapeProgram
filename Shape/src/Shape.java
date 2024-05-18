public abstract class Shape {
    private int thicknessFrame;
    private String color;

    public Shape(int thicknessFrame, String color){
        this.thicknessFrame = thicknessFrame;
        this.color = color;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    public int getThicknessFrame() {
        return thicknessFrame;
    }

    public String getColor() {
        return color;
    }
    public String toString(){
        String output = getClass().getSimpleName();
        output += "---> " +"\n" +"Thickness frame: " + this.thicknessFrame + "\n";
        output += "Color: " + this.color;
        return output;
    }
}
