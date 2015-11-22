package main;

import visitors.implementations.VisitorSVG;
import geometry.Circle;
import geometry.Drawing;
import geometry.Ellipse;
import geometry.Line;
import geometry.Point;
import geometry.Rectangle;

public class Main {
	
	public static void main(String[] args) {
//		Drawing d = new Drawing(500, 500);
//		
//		Point center = new Point(50,50);
//		Circle c = new Circle(center, 50, "blue");
//		d.addElementToDrawing(c);
//		
//		Point start = new Point(0,0);
//		Point end = new Point(200,200);
//		Line l = new Line(start, end, 2, "red");
//		d.addElementToDrawing(l);
//		
//		Point origin = new Point(20,20);
//		Rectangle r = new Rectangle(origin, 100, 100, "black");
//		d.addElementToDrawing(r);
//		
//		Point centerEllipse = new Point(200, 80);
//		Ellipse e = new Ellipse(centerEllipse, 100, 50, "vert");
//		d.addElementToDrawing(e);
//		
//		VisitorSVG svgVisitor = new VisitorSVG();
//		
//		System.out.println(svgVisitor.visit(d));
		
		Window w = new Window();
		w.setVisible(true);
	}
}
