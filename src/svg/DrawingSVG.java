package svg;

import geometry.Drawing;
import interfaces.Element;

public class DrawingSVG extends Drawing{

	public DrawingSVG(double width, double height) {
		super(width, height);
	}

	@Override
	public void draw() {
		System.out.println(
				"<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" "
				+ "width=\""+this.getWidth()+"\""
						+ " height=\""+this.getHeight()+"\">");
		for(Element e : this.getElements()){
			e.draw();
		}
		System.out.println("</svg>");
	}

}
