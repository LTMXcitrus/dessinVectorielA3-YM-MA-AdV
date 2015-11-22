package geometry;

import visitors.Visitor;
import geometry.interfaces.Element;

/**
 * Class that represents a Point represented by its coordinates and implements an Element
 */

public class Point implements Element{
	
	private double x;
	private double y;
	
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

	@Override
	public Object accept(Visitor v) {
		return v.visit(this);
	}
}
