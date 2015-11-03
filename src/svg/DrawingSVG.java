package svg;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import geometry.Drawing;
import geometry.interfaces.Element;

public class DrawingSVG extends Drawing<String, Void> {
	
	private static final String OPEN = "<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" ";
	private static final String WIDTH = "width=\"";
	private static final String HEIGHT = "\" height=\"";
	private static final String FIRST_CLOSE = "\">\n";
	private static final String CLOSE = "</svg>";

	public DrawingSVG(double width, double height) {
		super(width, height);
	}

	@Override
	public String draw(Void v) {
		String stringSVG = OPEN
				+ WIDTH +this.getWidth()+ HEIGHT +this.getHeight()+ FIRST_CLOSE;
		for(Element<String,Void> e : this.getElements()){
			stringSVG += e.draw(v)+"\n";
		}
		stringSVG += CLOSE;
		
		try
		{
		    FileWriter fw = new FileWriter (new File("test.svg"));
		 
		    fw.write(stringSVG);
		 
		    fw.close();
		}
		catch (IOException exception)
		{
		    System.out.println ("Erreur lors de l'écriture du svg : " + exception.getMessage());
		}
		
		//System.out.println(stringSVG);
		return stringSVG;
	}

}
