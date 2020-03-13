package com.training.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList1 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();//Creating arraylist    
	      list.add("Ravi");//Adding object in arraylist    
	      list.add("Vijay");    
	      list.add("Ravi");    
	      list.add("Ajay");    
	      //Invoking arraylist object   
	    //  System.out.println(list);  
	      
	    //Traversing list through Iterator  
//	      Iterator itr=list.iterator();  
//	      while(itr.hasNext()){  
//	       System.out.println(itr.next());  
//	      } 
	      
//	      for(String obj:list)  {
//	    	    System.out.println(obj);  
//	    	 }  
	      
	      
	      ListIterator<String> list1=list.listIterator(list.size());  
          while(list1.hasPrevious())  
          {  
              String str=list1.previous();  
              System.out.println(str);  
          } 
	}
}
