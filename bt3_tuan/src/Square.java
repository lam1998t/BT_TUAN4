public class Square extends Rectangle{
    protected double side;
    Square(){}
    Square(double side){
        super(side,side);
        this.side = side;
    }
    Square(double side, String color, boolean filled){
        this.color = "red";
        this.filled = true;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side + super.toString() +
                '}';
    }
}
