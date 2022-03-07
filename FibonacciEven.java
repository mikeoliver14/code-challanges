package com.revature;

public class FibonacciEven {

	public static void main(String[] args) {
		
		long sum = 0;
		long a = 1;
		long b = 2;
		long temp = 0;
		
		while (a <= 4_000_000 && b <= 4_000_000) {
			
			if (b % 2 == 0) {
				sum += b;
			}
			temp = a;
			a = b;
			b = a + temp;
			System.out.println(b);
			
		}
		
		System.out.println(sum);

	}

}
