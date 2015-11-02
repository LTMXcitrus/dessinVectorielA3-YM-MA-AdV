package language.grammarElements;

import svg.DrawingSVG;

public class Shape extends AST{
	
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
		//TODO
	}

}
