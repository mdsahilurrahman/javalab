package Lab;

public class Cylinder extends Circle {
    private double height;

    //construction of Cylinder instance with given height & radius
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    //return the volume of the circle
    public double getVolume(){
        return  super.getArea()*height;
    }
    //Implement the area of the Cylinder
    //Method override
    @Override
    public double getArea() {
        return 2.0*Math.PI*getRadius()*height;
    }
    public String toString(){
       return "Circle[height = "+height +" "+super.toString()+"]";
   }

    public static void main(String[] args) {
        Circle c1 = new Cylinder(1.1,5.8);
        System.out.println("the area of radius:"+c1.getRadius());
        System.out.println("the volume of the Cylinder:"+c1.getArea());

    }

}
