package geometry;

import interfaces.Element;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to create a Drawing and implments Element
 */
public abstract class Drawing<T> implements Element<T> {

	private double width;
	private double height;
	private List<Element<T>> elements;

	public Drawing(double width, double height){
		this.width=width;
		this.height=height;
		elements = new ArrayList<Element<T>>();
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

	public List<Element<T>> getElements() {
		return elements;
	}

	public void setElements(List<Element<T>> elements) {
		this.elements = elements;
	}

	public void addElementToDrawing(Element<T> e){
		elements.add(e);
	}
}
