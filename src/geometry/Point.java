package geometry;

import geometry.interfaces.Element;

/**
 * Class that represents a point and implements an Element
 */

public abstract class Point<T,H> implements Element<T,H>{
	
	private double x;
	private double y;
	
	public Point() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
