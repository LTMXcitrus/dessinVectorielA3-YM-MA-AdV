package svg;

import geometry.Ellipse;
import geometry.Point;

public class EllipseSVG extends Ellipse<String,Void> {

	public EllipseSVG(Point<String,Void> center, double radiusX, double radiusY, String color) {
		super(center, radiusX, radiusY, color);
	}

	@Override
	public String draw(Void v) {
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
