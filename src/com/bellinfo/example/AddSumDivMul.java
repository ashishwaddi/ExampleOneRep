package com.bellinfo.example;

import java.util.Scanner;

public class AddSumDivMul {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = scan .nextInt();
		int b = scan.nextInt();
		//System.out.println("Enter second number");
		int add = a + b;
		int sub = a - b;
		int div = a / b;
		int mul = a * b;
		System.out.println(div);
	}

}
