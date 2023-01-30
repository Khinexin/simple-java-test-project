package com.demo;

import java.util.Arrays;
import java.util.List;

/*Question 2 (20 minutes)
Write a java program to create HTML script table with specific list of data and number of columns
Example:
-Input [a, b, c], column=2 
=> Output <table><tr><td>a</td><td>b</td></tr><tr><td>c</td><td></td></tr></table>
-Input [a, b, c], column=3
=> Output <table><tr><td>a</td><td>b</td><td>c</td></tr></table>*/

public class Assignment2 {
	
	public static void main(String[] args) {
		Assignment2 ans = new Assignment2();
		System.out.println("1) Input [a, b, c], column=2 ");
		String result1 = ans.process(Arrays.asList("a", "b", "c"), 2);
		System.out.println(result1);
		
		System.out.println("2) Input [a, b, c], column=3 ");
		String result2 = ans.process(Arrays.asList("a", "b", "c"), 3);
		System.out.println(result2);
		
	}

	public String process(List<String> list, int col) {
		String tempString = "";
		int count = 0;
		String tempVal = "1";
		String result = "";
		while (!tempVal.equals("")) {
			String tempRow = "<tr>";
			String tempCol = "";
			for (int i = 0; i < col; i++) {
				try {
					tempString = list.get(count);
				} catch (ArrayIndexOutOfBoundsException e) {
					tempString = "";
				}
				tempVal = tempString;
				tempCol = tempCol + "<td>" + tempVal + "</td>";
				count++;
			}
			tempRow = tempRow + tempCol + "</tr>";
			result = result + tempRow;
		}

		return "<table>" + result + "</table>";
	}

}
