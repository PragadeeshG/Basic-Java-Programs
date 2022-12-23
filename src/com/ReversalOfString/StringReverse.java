package com.ReversalOfString;

class Dummy {
	public String reverse(String x) {
		String abc  ="";
		//abc = 'C';
		abc = 'C' +"";
		
		String rev = "";
		for (int i = x.length() - 1; i >= 0; i--) {
			rev = rev + x.charAt(i);
		}
		return rev;
	}
}

public class StringReverse {

	public static void main(String[] args) {
		String name = "pommagranate is good for health";
		Dummy obj = new Dummy();
		String output = obj.reverse(name);
		System.out.println("Original String is:   " + name);
		System.out.println("Reversed String is:  " + output);
	}

}
