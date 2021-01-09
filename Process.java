package org.kodluyoruz;


public class  Process implements Runnable{

	String name;

	 Process(String name) {
	   this.name=name;
	   System.out.println(name);
	  }

	  public void run() {
	    try {
	      for (int i =4; i > 0; i--) {
	        System.out.println(this.name+ ": " + i);
	        Thread.sleep(1000);
	      }
	    } catch (InterruptedException e) {
	      System.out.println(e);
	    }
	  }

	}



	

	
	
	
	
	

