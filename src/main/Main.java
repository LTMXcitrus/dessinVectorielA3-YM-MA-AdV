package main;

import geometry.Color;
import geometry.Drawing;
import svg.CircleSVG;
import svg.DrawingSVG;
import svg.PointSVG;

public class Main {
	
	public static void main(String[] args) {
		PointSVG center = new PointSVG(50,50);
		CircleSVG c = new CircleSVG(center, 50, Color.BLUE);
		Drawing d = new DrawingSVG(200, 200);
		d.addElementToDrawing(c);
		d.draw();
	}
}
