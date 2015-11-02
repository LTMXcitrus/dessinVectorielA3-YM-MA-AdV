package geometry;

import interfaces.Element;

public abstract class Ellipse<T> implements Element<T> {
	
	private Point<T> center;
	private double radiusX;
	private double radiusY;
	private String color;
	
	public Ellipse(Point<T> center, double radiusX, double radiusY, String color) {
		super();
		this.center = center;
		this.radiusX = radiusX;
		this.radiusY = radiusY;
		this.color = color;
	}

	public Ellipse() {
		super();
	}

	public Point<T> getCenter() {
		return center;
	}

	public void setCenter(Point<T> center) {
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
}
