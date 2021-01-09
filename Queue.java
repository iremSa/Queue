package org.kodluyoruz;

public class Queue<E>{
	 
	Node<E> first;
	   Node<E> last;
	  public void add(E value) {
			Node<E> node = new Node<E>(value);
		    if(first==null){
		      first = node;
		      last = node;
		    } else{
		    	  last.setNext(node);
		    	  last = node;
		     }
		    }
E peek(){
	
	return first != null? first.getValue():null;

	   	}

  E poll() {
  	  E value=null;
  	  if(first != null){
  		  Node<E>node=first;
		 first=first.getNext();
		      value=node.getValue();
		    }
  	  return value;

  	

  	}

	
}



			

	

		
		


