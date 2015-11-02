package geometry;

import interfaces.Element;

public abstract class Line implements Element {
	
	private Point start;
	private Point end;
	private Color color;
	private double width;

	public Line() {
		super();
	}
	
	public Line(Point start, Point end, double width, Color color) {
		super();
		this.start = start;
		this.end = end;
		this.color = color;
		this.width = width;
	}
	
	public Point getStart() {
		return start;
	}

	public void setStart(Point start) {
		this.start = start;
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}


	

}
