package svg;

import geometry.Circle;
import geometry.Color;
import geometry.Point;

public class CircleSVG extends Circle{
	
	public CircleSVG(Point center, double radius, Color color){
		super(center, radius, color);
	}
	
	public void draw(){
		String result =  "<circle cx=\""
				+this.getCenter().getX()+""
						+ "\" cy=\""+
				this.getCenter().getY()+""
						+ "\" r=\""
						+ this.getRadius()+"\" fill=\""
								+ this.getColor()+"\" />";
		System.out.println(result);
	}

}
