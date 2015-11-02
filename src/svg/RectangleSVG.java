package svg;

import geometry.Color;
import geometry.Point;
import geometry.Rectangle;

public class RectangleSVG extends Rectangle {

	public RectangleSVG(Point origin, double width, double height, Color color) {
		super(origin, width, height, color);
	}

	@Override
	public String draw() {
		String result =  "<rect x=\""
				+this.getOrigin().getX()
						+ "\" y=\""+
				this.getOrigin().getY()
						+ "\" width=\""+
				this.getWidth()
						+ "\" height=\""+
				this.getHeight()
						+ "\" style=\"fill:"+this.getColor()
						+ "\"  />";
		//System.out.println(result);
		return result;
	}

}
