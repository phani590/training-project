package com.training.loop;


public class BreakExample {
	
	public static void main(String[] args) {  
	    //using for loop  
	    for(int i=1;i<=10;i++){  
	        if(i==5){  
	            //breaking the loop  
	            break;  
	        }  
	     //   System.out.println(i);  
	    }  
	    
	    for(int i=1;i<=3;i++){    
            //inner loop  
            for(int j=1;j<=3;j++){    
                if(i==2&&j==2){    
                    //using break statement inside the inner loop  
                    break;    
                }    
                System.out.println(i+" "+j);    
            } 
            if(i==2){    
                //using break statement inside the inner loop  
                break;    
            } 
    }    
	}
}
