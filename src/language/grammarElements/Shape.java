package language.grammarElements;

import java.util.ArrayList;

import svg.CircleSVG;
import svg.DrawingSVG;
import svg.PointSVG;

public class Shape extends AST{
	
	private static final String CERCLE = "CERCLE", ELLIPSE ="ELLIPSE", LINE ="LINE", RECT="RECT";
	
	
	
	private String shape;
	private Params params;
	
	public Shape(String shape, Params params){
		this.shape=shape;
		this.params=params;
	}
	
	public Shape(){
		this("", new Params());
	}
	
	public void draw(DrawingSVG drawing){
		ArrayList<Param> params = this.params.getParams();
		switch(shape){
		case CERCLE:
			PointSVG center = new PointSVG(Double.parseDouble(params.get(0).getValue()),
					Double.parseDouble(params.get(1).getValue()));
			CircleSVG c = new CircleSVG(center, Double.parseDouble(params.get(2).getValue()),
					params.get(3).getValue());
			drawing.addElementToDrawing(c);
			break;
		}
	}

}
