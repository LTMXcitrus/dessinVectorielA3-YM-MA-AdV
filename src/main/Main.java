package main;

import geometry.Color;
import geometry.Drawing;
import svg.CircleSVG;
import svg.DrawingSVG;
import svg.EllipseSVG;
import svg.LineSVG;
import svg.PointSVG;
import svg.RectangleSVG;

public class Main {
	
	public static void main(String[] args) {
		Drawing d = new DrawingSVG(500, 500);
		
		PointSVG center = new PointSVG(50,50);
		CircleSVG c = new CircleSVG(center, 50, "blue");
		d.addElementToDrawing(c);
		
		PointSVG start = new PointSVG(0,0);
		PointSVG end = new PointSVG(200,200);
		LineSVG l = new LineSVG(start, end, 2, Color.RED);
		d.addElementToDrawing(l);
		
		PointSVG origin = new PointSVG(20,20);
		RectangleSVG r = new RectangleSVG(origin, 100, 100, Color.BLACK);
		d.addElementToDrawing(r);
		
		PointSVG centerEllipse = new PointSVG(200, 80);
		EllipseSVG e = new EllipseSVG(centerEllipse, 100, 50, Color.GREEN);
		d.addElementToDrawing(e);
		
		d.draw();
	}
}
