package language.grammarElements;

import geometry.Circle;
import geometry.Drawing;
import geometry.Ellipse;
import geometry.Line;
import geometry.Point;
import geometry.Rectangle;

import java.util.ArrayList;

import language.interpreter.ErrorHandler;

/**
 * Class which handles the given shapes given by the user (circle, ellipse, etc.) and add them in the drawing to be shown to the user
 */
public class Shape extends AST {

	private static final String CERCLE = "CERCLE", ELLIPSE ="ELLIPSE", LINE ="LINE", RECT="RECT";

	private String shape;
	private Params params;
	private ErrorHandler handler;

	/**
	 * Constructor of the class Shape
	 * @param shape The name of the shape to add to the Drawing (circle, ellipse, etc.)
	 * @param params The parameters given by the user corresponding to the shape
	 * @param handler Handle the errors
	 */
	public Shape(String shape, Params params, ErrorHandler handler) {
		this.shape = shape;
		this.params = params;
		this.handler = handler;
	}

	/**
	 * This method handles the given shapes, instantiates the equivalent Java class and add it to the Drawing.
	 * @param drawing The drawing the user wants to show.
	 */
	public void draw(Drawing drawing) {
		ArrayList<Param> params = this.params.getParams();
		switch(shape){
		case CERCLE:
			try{
				double x = Double.parseDouble(params.get(0).getValue());
				double y = Double.parseDouble(params.get(1).getValue());
				double radius = Double.parseDouble(params.get(2).getValue());
				String color = params.get(3).getValue();

				Point centerCircle = new Point(x,y);
				Circle c = new Circle(centerCircle, radius,color);
				drawing.addElementToDrawing(c);
			}
			catch(Exception e){
				handler.addError("wrong argument in a circle construction",e);
			}
			break;
		case ELLIPSE:
			try{
				double x = Double.parseDouble(params.get(0).getValue());
				double y = Double.parseDouble(params.get(1).getValue());
				double radiusX = Double.parseDouble(params.get(2).getValue());
				double radiusY = Double.parseDouble(params.get(3).getValue());
				String color = params.get(4).getValue();

				Point centerEllipse = new Point(x, y);
				Ellipse e = new Ellipse(centerEllipse, radiusX,	radiusY, color);
				drawing.addElementToDrawing(e);
			}
			catch(Exception e){
				handler.addError("wrong argument in an ellipse construction", e);
			}
			break;
		case LINE:
			try{
				Point start = new Point(Double.parseDouble(params.get(0).getValue()),
						Double.parseDouble(params.get(1).getValue()));
				Point end = new Point(Double.parseDouble(params.get(2).getValue()),
						Double.parseDouble(params.get(3).getValue()));
				double width = Double.parseDouble(params.get(4).getValue());
				String color  = params.get(5).getValue();
				Line line = new Line(start,end,width,color);
				drawing.addElementToDrawing(line);
			}
			catch(Exception e){
				handler.addError("wrong argument in a line construction", e);
			}
			break;
		case RECT:
			try{
				Point origin = new Point(Double.parseDouble(params.get(0).getValue()),
						Double.parseDouble(params.get(1).getValue()));
				double widthRect = Double.parseDouble(params.get(2).getValue());
				double height = Double.parseDouble(params.get(3).getValue());
				String colorRect = params.get(4).getValue();
				Rectangle rect = new Rectangle(origin, widthRect, height, colorRect);
				drawing.addElementToDrawing(rect);
			}
			catch(Exception e){
				handler.addError("wrong argument in a rectangle construction", e);
			}
			break;
		}
	}

}
