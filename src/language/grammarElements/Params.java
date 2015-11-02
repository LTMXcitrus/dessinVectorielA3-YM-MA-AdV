package language.grammarElements;

import java.util.ArrayList;

public class Params extends AST{
	
	private ArrayList<Param> params;
	
	public Params(ArrayList<Param> params){
		this.params = params;
	}
	
	public Params(){
		this(new ArrayList<Param>());
	}
	
	public ArrayList<Param> getParams(){
		return params;
	}

}
