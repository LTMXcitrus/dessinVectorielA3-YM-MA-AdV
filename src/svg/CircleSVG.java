package svg;

import geometry.Circle;
import geometry.Point;

public class CircleSVG extends Circle<String, Void>{
	
	private static final String OPEN = "<circle ";
	private static final String CENTER_X = "cx=\"";
	private static final String CENTER_Y = "\" cy=\"";
	private static final String RADIUS = "\" r=\"";
	private static final String FILL = "\" fill=\"";
	private static final String CLOSE = "\" />";
	
	
	public CircleSVG(Point center, double radius, String color){
		super(center, radius, color);
	}
	
	public String draw(Void v){
		String result =  
				OPEN + CENTER_X +this.getCenter().getX()+ CENTER_Y+this.getCenter().getY()+ RADIUS+ this.getRadius()
				+FILL+ this.getColor()+ CLOSE;
		//System.out.println(result);
		return result;
	}

}
