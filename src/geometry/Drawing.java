package geometry;

import geometry.interfaces.Element;

import java.util.ArrayList;
import java.util.List;

import visitors.Visitor;

/**
 * Class to create a Drawing and implements Element
 */
public class Drawing implements Element {

	private double width;
	private double height;
	private List<Element> elements;

	public Drawing(double width, double height){
		this.width=width;
		this.height=height;
		elements = new ArrayList<Element>();
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public List<Element> getElements() {
		return elements;
	}

	public void setElements(List<Element> elements) {
		this.elements = elements;
	}

	public void addElementToDrawing(Element e){
		elements.add(e);
	}

	@Override
	public Object accept(Visitor v) {
		return v.visit(this);
	}
	
}
