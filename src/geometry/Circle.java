package geometry;

import interfaces.Element;

/**
 * Class that represents a Circle and implements an Element
 */
public abstract class Circle implements Element {
	
	private Point center;
	private double radius;
	private Color color;
	
	public Circle() {
		super();
	}

	public Circle(Point center, double radius, Color color) {
		super();
		this.center = center;
		this.radius = radius;
		this.color = color;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
