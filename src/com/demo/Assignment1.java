package com.demo;


/*
 * Question 1 (10 minutes)
Write a java program to create the power function by using only plus(+) operation.
Example:
-Input base=2, pow=2 => Output 4
-Input base=2, pow=4 => Output 16
-Input base=10, pow=3 => Output 10
*/
public class Assignment1 {
	
	public static void main(String[] args) {
		Assignment1 ans = new Assignment1();
		System.out.println("1) Input base=2, pow=2 => Output 4");
		ans.process(2,2);
		
		System.out.println("2) Input base=2, pow=2 => Output 4");
		ans.process(2, 4);
		
		System.out.println("3) Input base=2, pow=2 => Output 4");
		ans.process(10, 3);
		
	}
	
	public int process(int base, int pow) {
		int result = 1;
		int count = 1;
		while (count <= pow) {
			// result = base * result;
			result = sumMul(base, result);
			System.out.println(count + " \t " + result);
			count++;
		}
		System.out.println(result);
		return result;
	}

	static int sumMul(int x, int y) {
		int sum = 0;
		for (int i = 1; i <= x; i++) {
			sum = sum + y;
		}
		return sum;
	}


}
