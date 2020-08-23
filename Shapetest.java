package Lab;

public class Shapetest {
    public static void main(String[] args) {
        Shape s1 = new Rectangle("red",4,5);
        Shape s2 = new Triangle("Blue",56,9);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s2);
        System.out.println(s2.getArea());
    }

}
