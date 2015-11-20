package geometry;

import geometry.interfaces.Element;

/**
 * Class that represents a Circle and implements an Element
 */
public abstract class Circle<T,H> implements Element<T,H> {
	
	private Point<T,H> center;
	private double radius;
	private String color;
	
	public Circle() {
		super();
	}

	public Circle(Point<T,H> center, double radius, String color) {
		super();
		this.center = center;
		this.radius = radius;
		this.color = color;
	}

	public Point<T,H> getCenter() {
		return center;
	}

	public void setCenter(Point<T,H> center) {
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
