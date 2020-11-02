package exercises;

import java.util.Scanner;

//Java Exercises link Source = https://www.w3resource.com/java-exercises/conditional-statement/index.php

public class ConditionalStatement {

	public static String getDayName(int day) {
		String dayName="";
		switch (day) {
			case 1:
				dayName="Sunday";
				break;
			case 2:
				dayName="Monday";
				break;
			case 3:
				dayName="Tuesday";
				break;
			case 4:
				dayName="Wednesday";
				break;
			case 5:
				dayName="Thursday";
				break;
			case 6:
				dayName="Friday";
				break;
			case 7:
				dayName="Saturday";
				break;
			default:
				dayName="Invalid day range";
		}
		return dayName;
	}
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	/*
	 * System.out.println("Input a number: "); int num = scan.nextInt(); if(num > 0)
	 * { System.out.println("Number is positive"); } else if(num < 0) {
	 * System.out.println("Number is negative"); }else {
	 * System.out.println("Number is Zero"); }
	 */
	
	
	
	/*
	 * System.out.println("Enter 3 numbers: "); int num1 = scan.nextInt(); int num2
	 * = scan.nextInt(); int num3 = scan.nextInt(); if(num1 > num2 && num1 > num3) {
	 * System.out.println("The greatest is: "+num1); } else if(num2 > num1 && num2 >
	 * num3) { System.out.println("The greatest is: "+num2); }else {
	 * System.out.println("The greatest is: "+num3); }
	 */
	
	
	
	/*
	 * System.out.println("Input number: "); int num = scan.nextInt();
	 * System.out.println(getDayName(num));
	 */
	
	
	
	
	/*
	 * int numberOfDaysInMonth = 0; String monthName ="";
	 * System.out.print("Input a month number: "); int month = scan.nextInt();
	 * System.out.print("Input a year: "); int year = scan.nextInt();
	 * 
	 * switch (month) {
	 * 
	 * case 1: monthName = "January"; numberOfDaysInMonth = 31; break; case 2:
	 * monthName ="February"; if(year % 400 == 0 || year % 4 == 0 || year % 100 !=
	 * 0) numberOfDaysInMonth = 29; else numberOfDaysInMonth = 28; break; case 3:
	 * monthName = "March"; numberOfDaysInMonth = 31; break; case 4: monthName =
	 * "April"; numberOfDaysInMonth = 30; break; case 5: monthName = "May";
	 * numberOfDaysInMonth = 31; break; case 6: monthName = "June";
	 * numberOfDaysInMonth = 30; break; case 7: monthName = "July";
	 * numberOfDaysInMonth = 31; break; case 8: monthName = "August";
	 * numberOfDaysInMonth = 31; break; case 9: monthName = "September";
	 * numberOfDaysInMonth = 30; break; case 10: monthName = "October";
	 * numberOfDaysInMonth = 31; break; case 11: monthName = "November";
	 * numberOfDaysInMonth = 30; break; case 12: monthName = "December";
	 * numberOfDaysInMonth = 31;
	 * 
	 * }
	 * 
	 * System.out.print(monthName + " " + year + " has " + numberOfDaysInMonth +
	 * " days\n");
	 */
	
	
	
	
	/*
	 * System.out.print("Input number: "); int n = scan.nextInt(); int sum =0;
	 * System.out.println("Natural Numbers are: "); for(int i=1; i<=n; i++) {
	 * System.out.println(i); sum += i; }
	 * System.out.println("The sum of natural numbers is: "+sum);
	 */
	
	
	
	
	
	
	/*
	 * System.out.print("Input 5 numbers: "); int num, avg=0, sum = 0; for(int i =
	 * 0; i < 5; i++) { num = scan.nextInt(); sum += num;
	 * 
	 * } avg = sum /5; System.out.println("The Sum is: "+sum);
	 * System.out.println("The Average is: "+avg);
	 */
	
	
	
	
	
	/*
	 * System.out.println("Input number of terms: "); int num = scan.nextInt(); int
	 * cube = 0; for(int i = 1; i <= num; i++) { cube = i * i * i;
	 * System.out.println("Number is: "+i+ " and cube is: "+cube); }
	 */
	
	
	
	
	
	/*
	 * System.out.print("Input the number: "); int num = scan.nextInt(); for(int i =
	 * 0; i <= 12; i++) { System.out.println(num +" x "+ i +" = "+(num * i)); }
	 */
	
	
	
	
	/*
	 * System.out.println("Input number of terms is: "); int num = scan.nextInt();
	 * System.out.println("The odd numbers are: "); int odd, sum=0; for(int i = 1; i
	 * <= num ; i++) { odd = 2* i -1; System.out.println(odd); sum += odd; }
	 * System.out.println("Sum is: "+sum);
	 */
	
	
	
	
	
	
	
	/*
	 * System.out.print("Enter number of rows: "); int num =scan.nextInt(); for(int
	 * i = 1; i <= num; i++) { for(int j = 1; j <= i; j++) System.out.print(j);
	 * System.out.println(""); }
	 */
	
	
	
	
	
	/*
	 * System.out.print("Enter number of rows: "); int num =scan.nextInt(); for(int
	 * i = 1; i <= num; i++) { for(int j = 1; j <= i; j++) System.out.print(i);
	 * System.out.println(""); }
	 */
	
	
	
	
	
	/*
	 * System.out.print("Enter number of rows: "); int num =scan.nextInt(); int k
	 * =1; for(int i = 1; i <= num; i++) { for(int j = 1; j <= i; j++)
	 * System.out.print(k++ +" "); System.out.println(""); }
	 */
	
	
	}
}
