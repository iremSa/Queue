package org.kodluyoruz;

public class Node<E> {
	   E value;
	   Node<E> next;

	  public Node (E value) {
	     this.value = value;
	  }
	  public Node(E value,Node<E>next){
		  this.value = value;
		  this.next = next;
	  }

		public void setValue(E value) {
	     this.value = value;
	  }

	  public E getValue() {
	     return value;
	  }

	  public void setNext(Node<E> next) {
	     this.next = next;
	  }
	  public Node<E> getNext() {
	return next;
		  }


	

	
}
