package com.bellinfo.example;

import java.util.Scanner;

public class SumOfInt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan .nextInt();
		int r,  res = 0;
		while(n>0) {
		r = n % 10;
		n = n / 10;
		res = res + r;
		
		}
		System.out.println(res);
	}

}
