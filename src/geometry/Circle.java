package geometry;

import interfaces.Element;

/**
 * Class that represents a Circle and implements an Element
 */
public abstract class Circle<T> implements Element<T> {
	
	private Point<T> center;
	private double radius;
	private String color;
	
	public Circle() {
		super();
	}

	public Circle(Point<T> center, double radius, String color) {
		super();
		this.center = center;
		this.radius = radius;
		this.color = color;
	}

	public Point<T> getCenter() {
		return center;
	}

	public void setCenter(Point<T> center) {
		this.center = center;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
