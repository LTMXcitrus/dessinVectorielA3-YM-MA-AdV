package geometry;

import geometry.interfaces.Element;

public abstract class Rectangle<T,H> implements Element<T,H> {
	
	private Point<T,H> origin;
	private double width;
	private double height;
	private String color;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(Point<T,H> origin, double width, double height, String color) {
		super();
		this.origin = origin;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public Point<T,H> getOrigin() {
		return origin;
	}
	public void setOrigin(Point<T,H> origin) {
		this.origin = origin;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
