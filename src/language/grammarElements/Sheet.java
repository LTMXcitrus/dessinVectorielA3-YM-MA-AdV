package language.grammarElements;

import geometry.Drawing;

import java.util.ArrayList;

public class Sheet extends AST{
	
	private Canvas canvas;
	
	private ArrayList<Shape> shapes;
	
	public Sheet(Canvas canvas, ArrayList<Shape> shapes){
		this.canvas= canvas;
		this.shapes=shapes;
	}
	
	public Sheet(){
		this(new Canvas(), new ArrayList<Shape>());
	}

	public Drawing draw() {
		Drawing drawing = canvas.draw();
		for(Shape shape : shapes){
			shape.draw(drawing);
		}
		return drawing;
	}

}
