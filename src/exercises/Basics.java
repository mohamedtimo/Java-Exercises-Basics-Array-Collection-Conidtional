package exercises;

import java.util.Arrays;
import java.util.Scanner;


//Java Exercises link Source = https://www.w3resource.com/java-exercises/basic/index.php

public class Basics {
	
	public static void count(String x) {
		char []ch = x.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		
		for(int i =0; i<x.length(); i++) {
			if(Character.isLetter(ch[i])) {
				letter++;
			}
			else if(Character.isDigit(ch[i])) {
				num++;
			}
			else if(Character.isSpaceChar(ch[i])) {
				space++;
			}
			else {
				other ++;
			}
		}
		System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("other: " + other);
	}
	
	public static int sumDigits(long n) {
		int sum = 0;
		while (n!= 0) {
			sum += n%10;
			n /= 10;
		}
		return sum;
	}
	
	public static boolean sumOfTwo(int a, int b, int c) {
		return((a + b) == c || (a + c) == b || (b + c) == a);
	}
	
	public static boolean greaterThan(int a, int b, int c) {
		return (c > b && b > a);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("Hello\nMohamed Timor");
		
		
		//System.out.println(25 + 75);
		
		
		//System.out.println(75/3);
		
		
		
		
		/*
		 * System.out.println(-5 + 8 * 6); System.out.println((55+9) % 9);
		 * System.out.println(20 + -3*5 / 8); System.out.println(5 + 15 / 3 * 2 - 8 %
		 * 3);
		 */
		
		
		
		
		/*
		 * System.out.println("Input First Number: "); int n1 = scan.nextInt();
		 * 
		 * System.out.println("Input Second Number: "); int n2 = scan.nextInt();
		 * 
		 * System.out.printf("Product of "+n1+" +  "+n2+" is = " + n1*n2);
		 */
		
		
		
		
		
		/*
		 * System.out.println("Input First Number: "); int n1 = scan.nextInt();
		 * 
		 * System.out.println("Input Second Number: "); int n2 = scan.nextInt();
		 * 
		 * System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
		 * System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
		 * System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));
		 * System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
		 * System.out.println(n1 + " mod " + n2 + " = " + (n1 % n2));
		 */
		
		
		
		/*
		 * System.out.println("Input First Number: "); int num = scan.nextInt(); for(int
		 * i = 1; i <= 12; i++) { System.out.println(num +" x "+ i + " = " + (num * i));
		 * }
		 */
		
		
		
		
		/*
		 * System.out.println("   J    a   v     v  a  ");
		 * System.out.println("   J   a a   v   v  a a ");
		 * System.out.println("J  J  aaaaa   V V  aaaaa ");
		 * System.out.println(" JJ  a     a   V  a     a");
		 */
		
		
		//System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
		
		
		
//		double pi = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
//		System.out.println(pi);
		
		
		
		
		/*
		 * double radius = 7.5; double Perimeter = 2*Math.PI*radius; double area =
		 * Math.PI*radius*radius; System.out.println("Perimeter is = "+ Perimeter);
		 * System.out.println("Area is = "+ area);
		 */
		
		
		
		
		/*
		 * System.out.println("Enter 3 numbers"); int n1 = scan.nextInt(); int n2 =
		 * scan.nextInt(); int n3 = scan.nextInt();
		 * 
		 * System.out.println("Average is = "+(n1 + n2 + n3)/3);
		 */
		
		
		
		
		
		/*
		 * double width = 5.5; double height = 5.5; double area = width*height; double
		 * perimeter = 2 * (width + height); System.out.println("Area is = "+area);
		 * System.out.println("Perimeter is = "+perimeter);
		 */
		
		
		
		
		/*
		 * int a, b, temp; a = 10; b = 5;
		 * 
		 * System.out.println("Before Swapping :a, b = "+a+", "+b); temp = a; a = b; b =
		 * temp; System.out.println("Before Swapping :a, b = "+a+", "+b);
		 */
		
		
		
		/*
		 * System.out.println("First Number : "); int n1 = scan.nextInt();
		 * System.out.println("Second Number : "); int n2 = scan.nextInt();
		 * 
		 * if(n1 == n2) System.out.println(n1 + " == " + n2); if(n1 != n2)
		 * System.out.println(n1 + " != " + n2); if(n1 < n2) System.out.println(n1 +
		 * " < " + n2); if(n1 > n2) System.out.println(n1 + " > " + n2); if(n1 <= n2)
		 * System.out.println(n1 + " <= " + n2); if(n1 >= n2) System.out.println(n1 +
		 * " >= " + n2);
		 */
		
		
		
		/*
		 * System.out.print("Input an integer: "); long n = scan.nextLong();
		 * System.out.println("The sum of the digits is: " + sumDigits(n));
		 */
		
		/*
		 * System.out.println("Input a String : "); char[] letters =
		 * scan.nextLine().toCharArray(); System.out.println("Reverse String : "); for
		 * (int i = letters.length -1; i >= 0 ; i--){
		 * 
		 * System.out.print(letters[i]); } System.out.println("\n");
		 */
		
		
		
		/*
		 * String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		 * count(test);
		 */
		
		
		
		
		
		/*
		 * int amount = 0;
		 * 
		 * for(int i = 1 ; i <= 4; i++) { for(int j = 1; j<=4; j++) { for(int k = 1;
		 * k<=4; k++) { if(k!=i && k!=j && i!=j) { amount++; System.out.println(i + "" +
		 * j + "" + k); } } } }
		 * System.out.println("Total number of the three-digit-number is " + amount);
		 */
		
		
		
		
		
		/*
		 * int chr = 'Z'; System.out.println("The ASCII Value of Z is : "+chr);
		 */
		
		
		
		
		
		
		/*
		 * int n = scan.nextInt();
		 * 
		 * System.out.printf("%d + %d%d + %d%d%d", n, n,n, n,n,n);
		 */
		
		 
		 
		 
		 
		 
		/*
		 * for(int i =1; i< 100; i++) { if( i % 2 != 0) { System.out.println(i); } }
		 */
		
		
		
		
		
		/*
		 * int num = scan.nextInt(); if(num %2 == 0) { System.out.println(1); } else {
		 * System.out.println(0); }
		 */
		
		
		
		
		/*
		 * System.out.println("Divided By 3:\n"); for(int i = 1; i < 100; i++) { if(i %3
		 * == 0) { System.out.print(i+", "); } }
		 * 
		 * System.out.println("\nDivided By 5:"); for(int i = 1; i < 100; i++) { if(i %5
		 * == 0) { System.out.print(i+", "); } }
		 * System.out.println("\nDivided By 5 and 3:"); for(int i = 1; i < 100; i++) {
		 * if(i %5 == 0 && i % 3 == 0) { System.out.print(i+", "); } }
		 */
		
		
		
		
		/*
		 * System.out.println("Input a number as string"); String str = scan.nextLine();
		 * int result = Integer.parseInt(str);
		 * System.out.println("String as number is "+result);
		 */
		
		
		
		
		
		
		
		/*
		 * int a = scan.nextInt(); int b = scan.nextInt(); int c = scan.nextInt(); int
		 * result = a + b; if(result == c ) System.out.println("The Result is : True");
		 * else System.out.println("The Result is : False");
		 */
		
		
		
		
		
		/*
		 * System.out.println("Input First Number : "); int a = scan.nextInt();
		 * System.out.println("Input Second Number : "); int b = scan.nextInt();
		 * System.out.println("Input Third Number : "); int c = scan.nextInt();
		 * 
		 * System.out.println("The result is "+ sumOfTwo(a, b, c));
		 */
		
		/*
		 * System.out.println("Input First Number : "); int a = scan.nextInt();
		 * System.out.println("Input Second Number : "); int b = scan.nextInt();
		 * System.out.println("Input Third Number : "); int c = scan.nextInt();
		 * System.out.println("The result is "+greaterThan(a, b, c));
		 */
		
		
		
		
		
		/*
		 * System.out.println("Input Seconds :"); int seconds = scan.nextInt(); int p1 =
		 * seconds % 60; int p2 = seconds / 60; int p3 = p2 / 60; p2 = p2 %60;
		 * System.out.print( p3 + ":" + p2 + ":" + p1); System.out.print("\n");
		 */
		
		
		
		
		
		/*
		 * System.out.println("Input a Sentence: "); String line = scan.nextLine();
		 * String[] words = line.split("[ ]+");
		 * System.out.println("word: "+words[words.length -2]);
		 */
		
		
		
		
		/*
		 * String str = scan.nextLine(); String lastThree = str.substring(str.length()
		 * -3); System.out.println(lastThree + lastThree + lastThree + lastThree);
		 * System.out.printf("%s %s %s %s", lastThree, lastThree, lastThree, lastThree);
		 */
		
		
		
		
		
		/*
		 * String word = "Pythonn"; if(word.length() %2 == 0) {
		 * System.out.println("Length is even"); System.out.println(word.substring(0,
		 * word.length()/2)); }else { System.out.println("Length is odd"); }
		 */
		
		
		
		
		
		
		/*
		 * String str1 = "Python"; String str2 = "Tutorial"; if(str1.length() >
		 * str2.length()) System.out.println(str2+str1+str2); else
		 * System.out.println(str1+str2+str1);
		 */
		
		
		
		
		
		
		/*
		 * String str1 = "Python"; String str2 = "Tutorial";
		 * System.out.println(str1.substring(1) + str2.substring(1));
		 */
		
		
		
		
		/*
		 * String str = "Mohamed"; System.out.println(str.substring(0, 3));
		 */
		
		
		
		
		
		/*
		 * String str1 = "Mohamed"; String str2 = "Timor"; String result =
		 * str1.substring(0,1) + str2.substring(0,1); System.out.println(result);
		 */
		
		
		
		
		
		/*
		 * int[] arr = {10, -20, 0, 30, 40, 60, 10}; System.out.println((arr[0] == 10 ||
		 * arr[arr.length-1] == 10));
		 */
		
		
		
		
		
		
		/*int[] array1 = {50, -20, 0, 30, 40, 60, 12};
		int[] array2 = {50, 20, 10, 20, 30, 50, 11};
		if(array1.length >= 2 && array2.length >= 2) {
			System.out.println(array1[0] == array2[0] || array1[array1.length -1] == array2[array2.length -1]);
		}
		else {
			System.out.println("Size less than 2");
		}*/
		
		
		
		
		/*
		 * int [] array1 = {80, 0, 10}; int [] array2 = {50, 15, 30}; int [] finalArray
		 * = {array1[0], array2[array2.length -1]}; for(int i : finalArray) {
		 * System.out.print(i+", "); }
		 * System.out.println("\n"+Arrays.toString(finalArray));
		 */
		
		
	
	
	
		/*
		 * int[] array = {5, 7}; for(int i = 0; i < array.length; i++) { if(array[i] ==
		 * 4 || array[i] == 7) System.out.println("true"); else
		 * System.out.println("false"); }
		 * 
		 * int[] array_nums = {5, 7};
		 * System.out.println("Original Array: "+Arrays.toString(array_nums));
		 * if(array_nums[0] == 4 || array_nums[0] == 7) System.out.println("True"); else
		 * System.out.println(array_nums[1] == 4 || array_nums[1] == 7);
		 */
		
		
		
		
		
		
		
		
		
		
	}

}
