package com.bellinfo.example;

public class DivByNum {

	public static void main(String[] args) {
		for (int i=1;i<100;i++ ) {
			if(i%3 == 0 ) {
				System.out.print(i+",");
			}
		}	
		System.out.println("\n");
				for (int j=1;j<100;j++ ) {
					if(j%5 == 0 ) {
						System.out.print(j+ ",");
						
					}
				}	
				System.out.println("\n");		
						for (int k=1;k<100;k++ ) {
							if(k%3==0 && k%5==0) {
								System.out.print(k+ ",");
							}
						}
						
	}
}
	
