package com.training.array;

public class MultidimensionalArray {

	public static void main(String[] args) {
		int[][] arr=new int[3][3];//3 row and 3 column  
		/*arr[0][0]=1;  
		arr[0][1]=2;  
		arr[0][2]=3;  
		arr[1][0]=4;  
		arr[1][1]=5;  
		arr[1][2]=6;  
		arr[2][0]=7;  
		arr[2][1]=8;  
		arr[2][2]=9; */
		
		for(int row=0;row<3;row++){
			for(int col=0;col< 3;col++){
				arr[row][col] = row+col; 
			}
		}
		
		for(int row[]:arr){
			for(int columnValue:row){
				System.out.println(columnValue);
			}
		}

	}

}
