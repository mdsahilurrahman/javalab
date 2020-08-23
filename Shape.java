package Lab;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return  "Shape[colour ="+color+"]";
    }
    public double getArea(){
        System.err.println("shape is unknown,can't pass");
        return 0;
    }

}
