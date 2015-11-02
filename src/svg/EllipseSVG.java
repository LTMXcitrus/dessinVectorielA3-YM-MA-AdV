package svg;

import geometry.Ellipse;
import geometry.Point;

public class EllipseSVG extends Ellipse<String> {

	public EllipseSVG(Point<String> center, double radiusX, double radiusY, String color) {
		super(center, radiusX, radiusY, color);
	}

	@Override
	public String draw() {
		String result =  "<ellipse cx=\""
				+this.getCenter().getX()+""
						+ "\" cy=\""+
				this.getCenter().getY()+""
						+ "\" rx=\""
						+ this.getRadiusX()+"\" ry=\""
						+ this.getRadiusY()+"\" fill=\""
								+ this.getColor()+"\" />";
		//System.out.println(result);
		return result;
	}

}
