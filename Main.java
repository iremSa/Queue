package org.kodluyoruz;

public class Main {
	

   public static void main(String[] args) {
    Queue<String>queue=new Queue<>();
       queue.add("Ayþe");
       queue.add("Fatma");
       queue.add("Mehmet");
       queue.add("Ahmet");
 
       System.out.println(queue.poll());
       System.out.println(queue.poll());
       System.out.println(queue.poll());
       System.out.println(queue.poll());
     
      Process myThread=new Process("Ayþe");
	  Thread t1=new Thread(myThread);
	  Process myThread1=new Process("Fatma");
	  Thread t2=new Thread(myThread1);
	  Process myThread2=new Process("Mehmet");
	  Thread t3=new Thread(myThread2);
	  Process myThread3=new Process("Ahmet");
	  Thread t4=new Thread(myThread3);

	
  try {
    t1.start();
    Thread.sleep(100);
    t2.start();
    Thread.sleep(100);
    t3.start();
    Thread.sleep(100);
    t4.start();
   

    t1.join();
    t2.join();
    t3.join();
    t4.join();
    
  } catch (InterruptedException e) {
    System.out.println(e);
  }

}
   }

