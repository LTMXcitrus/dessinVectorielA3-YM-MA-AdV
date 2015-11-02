package svg;

import geometry.Line;
import geometry.Point;

public class LineSVG extends Line<String> {

	public LineSVG(Point<String> start, Point<String> end, double width, String color) {
		super(start, end, width, color);
	}

	@Override
	public String draw() {
		String result =  "<line x1=\""
				+this.getStart().getX()+""
						+ "\" y1=\""+
				this.getStart().getY()+""
						+ "\" x2=\""
				+this.getEnd().getX()+""
						+ "\" y2=\""+
				this.getEnd().getY()+""
						+ "\" style=\"stroke:"+this.getColor()
						+";stroke-width:"+this.getWidth()+"\"  />";
		//System.out.println(result);
		return result;
	}

}
