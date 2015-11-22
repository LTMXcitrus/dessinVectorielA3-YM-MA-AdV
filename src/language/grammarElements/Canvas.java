package language.grammarElements;

import geometry.Drawing;

import java.util.ArrayList;

public class Canvas extends AST{

	private Params params;
	
	public Canvas(Params params){
		this.params=params;
	}
	public Canvas(){
		this(new Params());
	}
	
	/**
	 * 
	 * @return the drawing element with the given dimensions
	 */
	public Drawing draw(){
		ArrayList<Param> drawingSize = params.getParams();
		double width = Double.parseDouble(drawingSize.get(0).getValue());
		double height = Double.parseDouble(drawingSize.get(1).getValue());
		return new Drawing(width,height);
	}
}
