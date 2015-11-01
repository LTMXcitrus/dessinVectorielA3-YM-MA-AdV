package geometry;

import interfaces.Element;

public abstract class Rectangle implements Element {
	
	private Point origin;
	private double width;
	private double height;
	private Color color;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(Point origin, double width, double height, Color color) {
		super();
		this.origin = origin;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public Point getOrigin() {
		return origin;
	}
	public void setOrigin(Point origin) {
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
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	
}
