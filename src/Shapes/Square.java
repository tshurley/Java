package Shapes;

public class Square extends Rectangle {
	
	public Square () {
		this(1);
	}

	public Square(double s) {
		super(1,1);
	}
	
	@Override
	public String toString() {
		return "Square [s=" + w + " perimeter=" + calculatePerimeter() + " area=" + calculateArea() + "]";
	}

}
