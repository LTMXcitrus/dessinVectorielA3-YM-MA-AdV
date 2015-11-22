package visitors.implementations;

import visitors.Visitor;
import geometry.Circle;
import geometry.Drawing;
import geometry.Ellipse;
import geometry.Line;
import geometry.Point;
import geometry.Rectangle;
import geometry.interfaces.Element;

/**
 * Class which implements Visitor to create a description of what the user entered
 */
public class VisitorDescription implements Visitor<String>{

	@Override
	public String visit(Circle c) {
		return "- a "+ c.getColor() +" circle with a center " + c.getCenter().accept(this)
				+ " and a radius of "+c.getRadius();
	}

	@Override
	public String visit(Drawing c) {
		if(c.getElements().isEmpty()){
			return "It is an emtpy drawing with a size of "+c.getWidth() +" on "+ c.getHeight();
		}
		String result = "It is a drawing with a size of "+c.getWidth() +" on "+ c.getHeight()+ " which contains: ";
		for(Element e : c.getElements()){
			result +="\n" + e.accept(this);
		}
		return result + "\nAnd that's it";
	}

	@Override
	public String visit(Ellipse e) {
		return "- a "+ e.getColor() +" ellipse with a center: "+ e.getCenter().accept(this)+", "
				+ "with a horizontal radius of "+ e.getRadiusX() +", "
						+ "and a vertical radius of "+ e.getRadiusY();
	}

	@Override
	public String visit(Line l) {
		return "- a "+l.getColor()+" line going from "+ l.getStart().accept(this) + " to "+l.getEnd().accept(this) +" with a thickness of "
				+ ""+l.getWidth();
	}

	@Override
	public String visit(Point p) {
		return "("+p.getX()+", "+p.getY()+")";
	}

	@Override
	public String visit(Rectangle r) {
		return "- a "+r.getColor()+" rectangle with this origin :"+r.getOrigin().accept(this) + ", a width of "
				+ ""+r.getWidth()+", a height of "+r.getHeight();
	}

}
