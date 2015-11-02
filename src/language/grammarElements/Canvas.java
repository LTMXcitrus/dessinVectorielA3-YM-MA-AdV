package language.grammarElements;

import java.util.ArrayList;

import svg.DrawingSVG;

public class Canvas extends AST{

	private Params params;
	
	public Canvas(Params params){
		this.params=params;
	}
	public Canvas(){
		this(new Params());
	}
	
	public DrawingSVG draw(){
		ArrayList<Param> drawingSize = params.getParams();
		double width = Double.parseDouble(drawingSize.get(0).getValue());
		double height = Double.parseDouble(drawingSize.get(1).getValue());
		return new DrawingSVG(width,height);
	}
}
