package Lab;

import static java.lang.Math.PI;

public class Circle {
   private double radius;//minus means private
   public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
       return PI*radius*radius;
    }
    public String toString(){
       return "Circle[radius = "+radius+"]";
    }

}
