package language.grammarElements;

import geometry.Drawing;

import java.util.ArrayList;

/**
 * Class to draw the shapes previously added to the drawing
 */
public class Sheet extends AST {
	
	private Canvas canvas;
	
	private ArrayList<Shape> shapes;
	
	public Sheet(Canvas canvas, ArrayList<Shape> shapes) {
		this.canvas = canvas;
		this.shapes = shapes;
	}
	
	public Sheet() {
		this(new Canvas(), new ArrayList<Shape>());
	}

	/**
	 * Method which draws the different shapes previously added to the drawing
	 * @return the drawing with all the element given by the user
	 */
	public Drawing draw() {
		Drawing drawing = canvas.draw();
		for(Shape shape : shapes){
			shape.draw(drawing);
		}
		return drawing;
	}

}
