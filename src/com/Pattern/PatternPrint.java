package com.Pattern;
import static java.lang.System.out;
public class PatternPrint {

	public static void main(String[] args) {
		System.out.print(1);
		System.out.println();
		System.out.print(2);
		System.out.print(2);
		System.out.println();
		System.out.print(3);
		System.out.print(3);
		System.out.print(3);
		
		for(int row = 1; row <=3; row++) {
			for(int col = 1; col <= row; col++) {
	             out.print(row);
			}
		}
		
	}

}
