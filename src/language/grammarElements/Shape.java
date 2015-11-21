package language.grammarElements;

import geometry.Circle;
import geometry.Drawing;
import geometry.Ellipse;
import geometry.Line;
import geometry.Point;
import geometry.Rectangle;

import java.util.ArrayList;

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
	
	public void draw(Drawing drawing){
		ArrayList<Param> params = this.params.getParams();
		switch(shape){
		case CERCLE:
			Point centerCircle = new Point(Double.parseDouble(params.get(0).getValue()),
					Double.parseDouble(params.get(1).getValue()));
			Circle c = new Circle(centerCircle, Double.parseDouble(params.get(2).getValue()),
					params.get(3).getValue());
			drawing.addElementToDrawing(c);
			break;
		case ELLIPSE:
			Point centerEllipse = new Point(Double.parseDouble(params.get(0).getValue()),
					Double.parseDouble(params.get(1).getValue()));
			Ellipse e = new Ellipse(centerEllipse, Double.parseDouble(params.get(2).getValue()),
					Double.parseDouble(params.get(3).getValue()), params.get(4).getValue());
			drawing.addElementToDrawing(e);
			break;
		case LINE:
			Point start = new Point(Double.parseDouble(params.get(0).getValue()),
					Double.parseDouble(params.get(1).getValue()));
			Point end = new Point(Double.parseDouble(params.get(2).getValue()),
					Double.parseDouble(params.get(3).getValue()));
			double width = Double.parseDouble(params.get(4).getValue());
			String color  = params.get(5).getValue();
			Line line = new Line(start,end,width,color);
			drawing.addElementToDrawing(line);
			break;
		case RECT:
			Point origin = new Point(Double.parseDouble(params.get(0).getValue()),
					Double.parseDouble(params.get(1).getValue()));
			double widthRect = Double.parseDouble(params.get(2).getValue());
			double height = Double.parseDouble(params.get(3).getValue());
			String colorRect = params.get(4).getValue();
			Rectangle rect = new Rectangle(origin, widthRect, height, colorRect);
			drawing.addElementToDrawing(rect);
			break;
		}
	}

}
