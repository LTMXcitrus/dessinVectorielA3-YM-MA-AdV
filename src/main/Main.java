package main;

import geometry.Color;
import geometry.Drawing;
import svg.CircleSVG;
import svg.DrawingSVG;
import svg.LineSVG;
import svg.PointSVG;

public class Main {
	
	public static void main(String[] args) {
		Drawing d = new DrawingSVG(200, 200);

		
		PointSVG center = new PointSVG(50,50);
		CircleSVG c = new CircleSVG(center, 50, Color.BLUE);
		d.addElementToDrawing(c);
		
		PointSVG start = new PointSVG(0,0);
		PointSVG end = new PointSVG(200,200);
		LineSVG l = new LineSVG(start, end, 2, Color.RED);
		d.addElementToDrawing(l);
		
		d.draw();
	}
}
