package graphics;

import geometry.Circle;
import geometry.Point;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class CircleGraphics extends Circle<Void,Graphics>{
	
	public CircleGraphics(Point<Void,Graphics> center, double radius, String color){
		super(center,radius,color);
	}

	@Override
	public Void draw(Graphics g) {
		double centerX  = this.getCenter().getX();
		double centerY = this.getCenter().getY();
		double radius = this.getRadius();
		Graphics2D g2d = (Graphics2D) g;
	    Shape theCircle = new Ellipse2D.Double(centerX - radius, centerY - radius, 2.0 * radius, 2.0 * radius);
	    g2d.draw(theCircle);
		return null;
	}

}
