package com.ReversalOfNumber;

class Dummy{
	public int reverse(int n) {
		int rev = 0;
		int rem = 0;
		while(n > 0) {
			rem = n%10;
			rev = (rev*10) + rem;
			n = n/10;
		}
		return rev;
	}
}
public class NumberReverse {

	public static void main(String[] args) {
		int x = 2675348;
		Dummy obj = new Dummy();
		int output = obj.reverse(x);
		System.out.println("Original number is:   " + x);
		System.out.println("Reversed number is:  " + output);
	}

}
