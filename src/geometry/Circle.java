package geometry;

import visitors.Visitor;
import geometry.interfaces.Element;

/**
 * Class that represents a Circle represented by its center, a radius and a color and implements an Element
 */
public class Circle implements Element {
	
	private Point center;
	private double radius;
	private String color;
	

	public Circle(Point center, double radius, String color) {
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
