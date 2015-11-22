package visitors.implementations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import visitors.Visitor;
import geometry.Circle;
import geometry.Drawing;
import geometry.Ellipse;
import geometry.Line;
import geometry.Point;
import geometry.Rectangle;
import geometry.interfaces.Element;

public class VisitorSVG implements Visitor<String> {
	private static final String OPEN_SVG = "<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" ";
	private static final String CLOSE_SVG = "</svg>";
	private static final String WIDTH_DRAWING = "width=\"";
	private static final String WIDTH = "\" width=\"";
	private static final String HEIGHT = "\" height=\"";
	private static final String FIRST_CLOSE = "\">\n";
	private static final String OPEN_CIRCLE = "<circle ";
	private static final String OPEN_ELLIPSE = "<ellipse ";
	private static final String OPEN_LINE =  "<line ";
	private static final String	OPEN_RECTANGLE = "<rect ";
	private static final String CENTER_X = "cx=\"";
	private static final String CENTER_Y = "\" cy=\"";
	private static final String RADIUS = "\" r=\"";
	private static final String FILL = "\" fill=\"";
	private static final String CLOSE = "\" />";
	private static final String RADIUS_X = "\" rx=\"";
	private static final String RADIUS_Y = "\" ry=\"";
	private static final String START_X = "x1=\"";
	private static final String START_Y = "\" y1=\"";
	private static final String END_X = "\" x2=\"";
	private static final String END_Y = "\" y2=\"";
	private static final String COLOR_LINE = "\" style=\"stroke:";
	private static final String THICKNESS = ";stroke-width:";
	private static final String ORIGIN_X = "x=\"";
	private static final String ORIGIN_Y = "\" y=\"";

	@Override
	public String visit(Circle c) {
		String stringSVG =  
				OPEN_CIRCLE + CENTER_X +c.getCenter().getX()+ CENTER_Y+c.getCenter().getY()+ RADIUS+ c.getRadius()
				+FILL+ c.getColor()+ CLOSE;
		return stringSVG;
	}

	@Override
	public String visit(Drawing c) {
		String stringSVG = OPEN_SVG
				+ WIDTH_DRAWING +c.getWidth()+ HEIGHT +c.getHeight()+ FIRST_CLOSE;
		for(Element e : c.getElements()){
			stringSVG += e.accept(this) + "\n";
		}
		stringSVG += CLOSE_SVG;

		return stringSVG;
	}

	@Override
	public String visit(Ellipse e) {
		String result =  OPEN_ELLIPSE + CENTER_X + e.getCenter().getX() + CENTER_Y + e.getCenter().getY()	+ RADIUS_X+ e.getRadiusX()
				+ RADIUS_Y+ e.getRadiusY()+ FILL + e.getColor()+CLOSE;
		return result;
	}

	@Override
	public String visit(Line l) {
		String result =  OPEN_LINE + START_X + l.getStart().getX() + START_Y + l.getStart().getY()
				+ END_X	+l.getEnd().getX() + END_Y +	l.getEnd().getY()
				+ COLOR_LINE +l.getColor() + THICKNESS +l.getWidth()+ CLOSE;
		return result;
	}

	@Override
	public String visit(Point p) {
		return null;
	}

	@Override
	public String visit(Rectangle r) {
		String result =  OPEN_RECTANGLE + ORIGIN_X + r.getOrigin().getX() + ORIGIN_Y +	r.getOrigin().getY()
				+ WIDTH + r.getWidth() + HEIGHT + r.getHeight() + FILL +r.getColor() + CLOSE;
		return result;
	}

}
