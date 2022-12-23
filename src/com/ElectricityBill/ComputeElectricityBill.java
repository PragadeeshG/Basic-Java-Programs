package com.ElectricityBill;

import java.util.Scanner;

class CalculateBill {
	double billPay;

	public void bill(int units) {
		if (units <= 100) {
			billPay = units * 1.20;
		} else if (units <= 300) {
			billPay = (100 * 1.20) + (units - 100) * 2;
		} else if (units > 300) {
			billPay = (100 * 1.20) + (200 * 2) + (units - 300) * 3;
		}
	}
}

public class ComputeElectricityBill {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter number of units: ");
		int units = input.nextInt();
		System.out.println();
		CalculateBill obj = new CalculateBill();
		obj.bill(units);
		System.out.println("Bill to pay is: " + obj.billPay);

	}

}
