package svg;

import geometry.Color;
import geometry.Ellipse;
import geometry.Point;

public class EllipseSVG extends Ellipse {

	public EllipseSVG(Point center, double radiusX, double radiusY, Color color) {
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
