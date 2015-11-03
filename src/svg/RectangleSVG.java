package svg;

import geometry.Point;
import geometry.Rectangle;

public class RectangleSVG extends Rectangle<String,Void> {

	public RectangleSVG(Point<String,Void> origin, double width, double height, String color) {
		super(origin, width, height, color);
	}

	@Override
	public String draw(Void v) {
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