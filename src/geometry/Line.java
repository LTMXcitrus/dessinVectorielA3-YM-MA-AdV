package geometry;

import geometry.interfaces.Element;

public abstract class Line<T,H> implements Element<T,H> {
	
	private Point<T,H> start;
	private Point<T,H> end;
	private String color;
	private double width;

	public Line() {
		super();
	}
	
	public Line(Point<T,H> start, Point<T,H> end, double width, String color) {
		super();
		this.start = start;
		this.end = end;
		this.color = color;
		this.width = width;
	}
	
	public Point<T,H> getStart() {
		return start;
	}

	public void setStart(Point<T,H> start) {
		this.start = start;
	}

	public Point<T,H> getEnd() {
		return end;
	}

	public void setEnd(Point<T,H> end) {
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
