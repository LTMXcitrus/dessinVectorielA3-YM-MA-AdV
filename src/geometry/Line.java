package geometry;

import visitors.Visitor;
import geometry.interfaces.Element;

public class Line implements Element {
	
	private Point start;
	private Point end;
	private String color;
	private double width;

	
	public Line(Point start, Point end, double width, String color) {
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

	@Override
	public Object accept(Visitor v) {
		return v.visit(this);
	}


	

}
