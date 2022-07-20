package org.collection;
import java.util.*;

public class Collection {
public static void main(String[] args) {
		
		System.out.println("ArrayList");
		ArrayList<String> A=new ArrayList<String>();   
	      A.add("Chennai");//
	      A.add("Thiruvallur");    	   
	      System.out.println(A);  

	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> v = new Vector();
	      v.add(50); 
	      v.add(150); 
	      System.out.println(v);
	      
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Harish");  
	      names.add("Prakash");  	      
	      Iterator<String> i=names.iterator();  
	      while(i.hasNext()){  
	       System.out.println(i.next());  
	       
	      }
	      System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> hs=new HashSet<Integer>();  
	       hs.add(55);  
	       hs.add(66);  
	       hs.add(77);
	       hs.add(88);
	       System.out.println(hs);
	       
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();  
	       lhs.add(101);  
	       lhs.add(202);  
	       lhs.add(303);
	       lhs.add(404);	       
	       System.out.println(lhs);
	      } 

}
