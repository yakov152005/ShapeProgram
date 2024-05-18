public class Square extends Shape{
    private int length;

    public Square(int thicknessFrame, String color,int length){
        super(thicknessFrame,color);
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.length*this.length;
    }
    @Override
    public double getPerimeter() {
        return this.length*4;
    }

    public int getLength() {
        return length;
    }

    public void draw(int length){
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public String toString(){
        String s = super.toString() + "\nLength: " + this.length;
        s += "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
        return s;
    }

}
