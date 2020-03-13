package com.training.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {
		List<String> list=new LinkedList<String>();//Creating arraylist    
	      list.add("Ravi");//Adding object in arraylist    
	      list.add("Vijay");    
	      list.add("Ravi");    
	      list.add("Ajay");
	      
	      //Traversing list through Iterator  
	      Iterator itr=list.iterator();  
	    //  while(itr.hasNext()){  
	     //  System.out.println(itr.next());  
	    //  } 
	      
	      list.remove("Ravi");
	      
	       itr=list.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	      } 

	}

}
