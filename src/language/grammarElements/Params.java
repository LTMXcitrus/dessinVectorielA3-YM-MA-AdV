package language.grammarElements;

import java.util.ArrayList;

/**
 * Class which represents a list of parameters (given by the user) for the AST
 */
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
