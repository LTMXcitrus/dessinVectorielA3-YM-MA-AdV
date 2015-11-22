package geometry;

import visitors.Visitor;
import geometry.interfaces.Element;

/**
 * Class that represents a Ellipse represented by a center, two radius and a color and implements an Element
 */
public class Ellipse implements Element {
	
	private Point center;
	private double radiusX;
	private double radiusY;
	private String color;
	
	public Ellipse(Point center, double radiusX, double radiusY, String color) {
		super();
		this.center = center;
		this.radiusX = radiusX;
		this.radiusY = radiusY;
		this.color = color;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public double getRadiusX() {
		return radiusX;
	}

	public void setRadiusX(double radiusX) {
		this.radiusX = radiusX;
	}

	public double getRadiusY() {
		return radiusY;
	}

	public void setRadiusY(double radiusY) {
		this.radiusY = radiusY;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public Object accept(Visitor v) {
		return v.visit(this);
	}
}
