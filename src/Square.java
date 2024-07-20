public class Square extends Shape {

    private double width;

    public Square (double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return Math.pow(width, 2);
    }
}
