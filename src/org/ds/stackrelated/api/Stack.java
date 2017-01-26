package org.ds.stackrelated.api;

/*
 * Stack data structure 
 * 
 */
public interface Stack<E> extends Iterable<E> {

	public void push(E e) ;
	
	public E pop();
	
	public E peek();	
	
}
