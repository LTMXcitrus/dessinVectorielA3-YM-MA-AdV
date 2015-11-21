package geometry.interfaces;

import visitors.Visitor;

/**
 * Interface Element
 */

public interface Element {
	
	Object accept(Visitor v);

}
