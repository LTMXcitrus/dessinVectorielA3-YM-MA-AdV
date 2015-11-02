package language.grammarElements;

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
