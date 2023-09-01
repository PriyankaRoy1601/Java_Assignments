package polymorphism;

public class Rect extends Shape{
	 private double length;
	 private double width;

	    public Rect(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    public double area() {
	        return length * width;
	    }

}
