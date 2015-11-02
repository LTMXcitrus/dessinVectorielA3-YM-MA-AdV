package language.grammarElements;

import java.util.ArrayList;

import svg.DrawingSVG;

public class Drawing extends AST{
	
	private Canvas canvas;
	
	private ArrayList<Shape> shapes;
	
	public Drawing(Canvas canvas, ArrayList<Shape> shapes){
		this.canvas= canvas;
		this.shapes=shapes;
	}
	
	public Drawing(){
		this(new Canvas(), new ArrayList<Shape>());
	}

	public void draw() {
		DrawingSVG drawing = canvas.draw();
		for(Shape shape : shapes){
			shape.draw(drawing);
		}
	}

}
