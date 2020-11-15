/**
 * 
 */
package it.unibo.oop.lab.nesting2;

import java.util.Iterator;
import java.util.List;

/**
 * @author Andrea
 *
 */
public class OneListAcceptable<T> implements Acceptable<T> {

	private final List<T> list;
	
	public OneListAcceptable(final List<T> list) {
		this.list = list;
	}


	@Override
	public Acceptor<T> acceptor() {
		final Iterator<T> iterator = list.iterator();
		return new Acceptor<T>() {
			@Override
			public void accept(final T element) throws ElementNotAcceptedException {
				 try {
	                    if (element.equals(iterator.next())) {
	                        return;
	                    }
	                } catch (Exception e) {
	                    System.out.println("list has no more element");
	                }
	                throw new Acceptor.ElementNotAcceptedException(element);
				
			}
			@Override
			public void end() throws EndNotAcceptedException {
				try {
                    if (!iterator.hasNext()) {
                        return;
                    }
                } catch (Exception e) {
                    System.out.println("2" + e.getMessage());
                }
                throw new Acceptor.EndNotAcceptedException();
			}
		};
	}
}
