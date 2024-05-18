import java.util.Scanner;
public class ShapeProgram {
    public static void main(String[] args) {
        String color;
        int thickness;
        System.out.println("How many shapes? ");
        int numOfShapes = s.nextInt();

        Shape[] shapes = new Shape[numOfShapes];
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Enter 1 for Square, 2 for Circle: ");
            int choice = s.nextInt();

            switch (choice){

                case SQUARE:
                    System.out.println("Enter thickness frame: ");
                    thickness = s.nextInt();
                    System.out.println("Enter color: ");
                    color = s.next();
                    System.out.println("Enter a length: ");
                    int length = s.nextInt();
                    shapes[i] = new Square(thickness,color,length);
                    break;
                case CIRCLE:
                    System.out.println("Enter thickness frame: ");
                    thickness = s.nextInt();
                    System.out.println("Enter color: ");
                    color = s.next();
                    System.out.println("Enter a radius: ");
                    int radius = s.nextInt();
                    shapes[i] = new Circle(thickness,color,radius);
            }
        }
        printShapes(shapes);

    }
    public static void printShapes(Shape[] shapes){
        System.out.println("The shapes: ");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println((i+1) +":" + shapes[i].toString());
            if (shapes[i] instanceof Square){
                Square square =(Square) shapes[i];
                square.draw(square.getLength());
            }
            System.out.println();
        }
    }
    public static Scanner s = new Scanner(System.in);
    public static final int CIRCLE = 2;
    public static final int SQUARE = 1;
}
