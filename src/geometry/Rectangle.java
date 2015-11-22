package geometry;

import visitors.Visitor;
import geometry.interfaces.Element;

/**
 * Class that represents a Rectangle represented by an origin Point, its width, its height and a color and implements an Element
 */
public class Rectangle implements Element {
	
	private Point origin;
	private double width;
	private double height;
	private String color;
	
	
	public Rectangle(Point origin, double width, double height, String color) {
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
