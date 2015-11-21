package geometry.interfaces;

import visitors.Visitor;

/**
 * Interface Element
 */

public interface Element {
	
	/**
	 * This method allows to call a visitor on a object wich is an unknown sub-type of Element.
	 * @param v the visitor to use
	 * @return v.visit(this)
	 */
	Object accept(Visitor v);

}
