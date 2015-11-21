package visitors;

import geometry.Circle;
import geometry.Drawing;
import geometry.Ellipse;
import geometry.Line;
import geometry.Point;
import geometry.Rectangle;

public interface Visitor<T> {
	
	T visit(Circle c);
	T visit(Drawing c);
	T visit(Ellipse e);
	T visit(Line l);
	T visit(Point p);
	T visit(Rectangle r);
	

}
