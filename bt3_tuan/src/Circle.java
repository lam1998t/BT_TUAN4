public class Circle extends Shape{
    protected double radius;

    Circle(){}
    Circle(double radius){
        this.radius = radius;
    }
    Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*3.14;
    }

    @Override
    public double getPerimeter() {
        return 2*radius*3.14;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + super.toString() +
                '}';
    }
}
