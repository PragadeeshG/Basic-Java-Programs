package com.ReversalOfString;

public class Fibonacci {

	public static void main(String[] args) {
	
		// 0,1,1,2,3,5,8,13
		
		// 5 		8 		13 		21 		34 		55 		89

		
		int count = 7;
		int n1 = 5;
		int n2 = 8;
		int n3 = 0;
		System.out.print(n1 + " " + n2);// printing 0 and 1
		for (int i = 2; i < count ; i++)// loop starts from 2 because 0 and 1 are already printed
		{
			 n3  = n2 + n1;
			 System.out.print( " " + n3);
			n1 = n2;
			n2 = n3;
		}

	}
}
