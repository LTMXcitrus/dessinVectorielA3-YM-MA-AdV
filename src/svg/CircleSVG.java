package svg;

import geometry.Circle;
import geometry.Point;

public class CircleSVG extends Circle<String>{
	
	public CircleSVG(Point center, double radius, String color){
		super(center, radius, color);
	}
	
	public String draw(){
		String result =  "<circle cx=\""
				+this.getCenter().getX()+""
						+ "\" cy=\""+
				this.getCenter().getY()+""
						+ "\" r=\""
						+ this.getRadius()+"\" fill=\""
								+ this.getColor()+"\" />";
		//System.out.println(result);
		return result;
	}

}
