package geometry;

import interfaces.Element;

public abstract class Rectangle<T> implements Element<T> {
	
	private Point<T> origin;
	private double width;
	private double height;
	private String color;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(Point<T> origin, double width, double height, String color) {
		super();
		this.origin = origin;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public Point<T> getOrigin() {
		return origin;
	}
	public void setOrigin(Point<T> origin) {
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
