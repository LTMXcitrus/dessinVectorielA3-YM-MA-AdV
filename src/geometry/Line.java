package geometry;

import interfaces.Element;

public abstract class Line<T> implements Element<T> {
	
	private Point<T> start;
	private Point<T> end;
	private String color;
	private double width;

	public Line() {
		super();
	}
	
	public Line(Point<T> start, Point<T> end, double width, String color) {
		super();
		this.start = start;
		this.end = end;
		this.color = color;
		this.width = width;
	}
	
	public Point<T> getStart() {
		return start;
	}

	public void setStart(Point<T> start) {
		this.start = start;
	}

	public Point<T> getEnd() {
		return end;
	}

	public void setEnd(Point<T> end) {
		this.end = end;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}


	

}
