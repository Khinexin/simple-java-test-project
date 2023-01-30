package com.demo;

/*
 * Question 3 (30 minutes)
Apple falls down every day from the Apple tree. First day=1
Given the total of Apple and speed of falling. 
The amount of Apple that being fallen = speed * fallen amount of previous day
 
How many Apple left from Apple tree with specific day?
Example:
 -Input 10, speed=2, day=1 => Output Apple left=9   
day1 => fallen amount=1 => Apple left = 10-1 = 9
-Input 10, speed=2, day=2 => Output Apple left=7 
day1 => fallen amount=1 => Apple left = 10-1 = 9
	day2 => fallen amount=2*1 =2 => Apple left = 9-2 = 7
 -Input 10, speed=2, day=5 => Output Apple left=0
day1 => fallen amount=1 => Apple left = 10-1 = 9
	day2 => fallen amount=2*1 =2 => Apple left = 9-2 = 7
day3 => fallen amount=2*2 =4 => Apple left = 7-4 = 3
day4 => fallen amount=2*4 =8, but only 3 left from the tree =3 => Apple left = 3-3 = 0
day5 => fallen amount=no apple from the tree => Apple left = 0
 -Input 20, speed=3, day=3 => Output Apple left=7
day1 => fallen amount=1 => Apple left = 20-1 = 19
	day2 => fallen amount=3*1 =3 => Apple left = 19-3 = 16
day3 => fallen amount=3*3 =9 => Apple left = 16-9 = 7*/

public class Assignment3 {

	public static void main(String[] args) {
		Assignment3 ans = new Assignment3();
		System.out.println("1) Input 10, speed=2, day=1 => Output Apple left=9 ");
		int result1 = ans.process(10, 2, 1);
		System.out.println(result1);

		System.out.println("2) Input 10, speed=2, day=5 => Output Apple left=0");
		int resul2 = ans.process(10, 2, 5);
		System.out.println(resul2);

		System.out.println("3) Input 20, speed=3, day=3 => Output Apple left=7");
		int result3 = ans.process(20, 3, 3);
		System.out.println(result3);

	}

	public int process(int amount, int speed, int day) {
		int left = amount;

		int fallenAmt = 1;
		for (int i = 0; i < day; i++) {
			left = left - fallenAmt;
			fallenAmt = fallenAmt * speed;

		}

		if (left <= 0) {
			left = 0;
		}

		return left;

	}

}
