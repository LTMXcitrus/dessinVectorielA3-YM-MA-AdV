package geometry;

import interfaces.Element;

public abstract class Ellipse implements Element {
	
	private Point center;
	private double radiusX;
	private double radiusY;
	private Color color;
	
	public Ellipse(Point center, double radiusX, double radiusY, Color color) {
		super();
		this.center = center;
		this.radiusX = radiusX;
		this.radiusY = radiusY;
		this.color = color;
	}

	public Ellipse() {
		super();
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
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

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	

}
