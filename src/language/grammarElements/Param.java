package language.grammarElements;

/**
 * Class which represents a parameter (given by the user) for the AST
 */
public class Param extends AST{
	
	private String value;
	
	public Param(String value){
		this.value = value;
	}
	
	public Param(){
		this("");
	}
	
	public String getValue(){
		return value;
	}

}
