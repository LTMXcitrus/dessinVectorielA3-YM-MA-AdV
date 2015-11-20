package geometry;

import geometry.interfaces.Element;

public abstract class Ellipse<T,H> implements Element<T,H> {
	
	private Point<T,H> center;
	private double radiusX;
	private double radiusY;
	private String color;
	
	public Ellipse(Point<T,H> center, double radiusX, double radiusY, String color) {
		super();
		this.center = center;
		this.radiusX = radiusX;
		this.radiusY = radiusY;
		this.color = color;
	}

	public Ellipse() {
		super();
	}

	public Point<T,H> getCenter() {
		return center;
	}

	public void setCenter(Point<T,H> center) {
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
