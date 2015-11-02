package svg;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import geometry.Drawing;
import interfaces.Element;

public class DrawingSVG extends Drawing<String> {

	public DrawingSVG(double width, double height) {
		super(width, height);
	}

	@Override
	public String draw() {
		String stringSVG ="<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" "
				+ "width=\""+this.getWidth()+"\""
				+ " height=\""+this.getHeight()+"\">\n";
		for(Element<String> e : this.getElements()){
			stringSVG += e.draw()+"\n";
		}
		stringSVG +="</svg>";
		
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
