package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Java Exercises link Source = https://www.w3resource.com/java-exercises/array/index.php

public class Array {

	static int max;
	static int min;
	
	public static void max_min(int []arr) {
		max = arr[0];
		min = arr[0];
		int len = arr.length;
		for(int i = 0; i < len; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			else if(arr[i] < min){
				min = arr[i];
			}
		}
	}
	
	public static boolean contain(int[] arr, int item) {
		for(int i: arr)
			if(item == i)
				return true;
		return false;
	}
	
	public static int findIndex(int[] arr, int t) {
		if(arr == null)
			return -1;
		int i = 0;
		while(i < arr.length)
			if(arr[i] == t)
				return i;
			else
				i=i+1;
		return -1;
	}
	
	public static boolean result(int [] numbers, int search_num, int fixed_sum) {
		int temp_sum = 0;
		for(int number: numbers) {
			if(number == search_num) {
				temp_sum += number;
			}
			if(temp_sum > fixed_sum)
				break;
		}
		return temp_sum == fixed_sum;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
		 * int[] my_array1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472,
		 * 2365, 1456, 2165, 1457, 2456};
		 * 
		 * String[] my_array2 = { "Java",
		 * 
		 * "Python", "PHP", "C#", "C Programming", "C++" };
		 * System.out.println("Original numeric array: "+Arrays.toString(my_array1));
		 * Arrays.sort(my_array1);
		 * System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));
		 * System.out.println("Original string array : "+Arrays.toString(my_array2));
		 * Arrays.sort(my_array2);
		 * System.out.println("Sorted string array : "+Arrays.toString(my_array2));
		 */

		
		
		
		
		
		/*
		 * int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; int sum = 0; for(int i :
		 * my_array) { sum += i; } System.out.println("The sum is " + sum);
		 */
		
		
		
		
		
		/*
		 * int [][] a = new int [10][10]; for(int i = 0; i < 10; i++) { for(int j = 0; j
		 * < 10; j++) { System.out.print(a[i][j]);} System.out.println("");}
		 */
		
		
		
		
		
		/*
		 * int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100}; int sum = 0;
		 * for(int i = 0; i < numbers.length; i++) sum += i;
		 * System.out.println("Sum is: "+sum); double avg = sum / numbers.length;
		 * System.out.println("Average is: "+avg);
		 */
		
		
		
		
		
		
		/*
		 * int[] my_array1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472,
		 * 2365, 1456, 2265, 1457, 2456}; System.out.println(contain(my_array1, 2013));
		 */
		
		
		
		
		
		
		/*
		 * int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		 * System.out.println("Index position of 25 is: " + findIndex(my_array, 25));
		 * System.out.println("Index position of 77 is: " + findIndex(my_array, 77));
		 */
		
		
		
		
		
		
		/*
		 * int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}; int[] new_array =
		 * new int[10];
		 * 
		 * System.out.println("Source Array : "+Arrays.toString(my_array)); for(int i =
		 * 0; i < my_array.length; i++) { new_array[i] = my_array[i]; }
		 * 
		 * System.out.println("New Array: "+Arrays.toString(new_array));
		 */
		
		
		
		
		/*
		 * int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}; max_min(my_array);
		 * System.out.println(" Original Array: "+Arrays.toString(my_array));
		 * System.out.println(" Maximum value for the above array = " + max);
		 * System.out.println(" Minimum value for the above array = " + min);
		 */
		
		
		
		
		
		
		
		/*
		 * int[] my_array = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472,
		 * 2365, 1456, 2165, 1457, 2456}; int[] new_array = new int[my_array.length];
		 * for(int i = my_array.length-1 ; i >= 0; i--) {
		 * System.out.print(my_array[i]+" "); new_array[i] = my_array[i]; }
		 * System.out.println("\n"+Arrays.toString(new_array));
		 */
		
		
		
		
		
		
		/*
		 * int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2}; for(int i = 0; i<my_array.length;
		 * i++) for(int j = i+1; j<my_array.length; j++) if(my_array[i] == my_array[j]
		 * && i != j) System.out.println("Duplicate element: "+my_array[i]);
		 */
		
		
		
		
		
		/*
		 * String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"}; String[]
		 * array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
		 * System.out.println("Array1 : "+Arrays.toString(array1));
		 * System.out.println("Array2 : "+Arrays.toString(array2)); List<String> list =
		 * new ArrayList<String>(); for(int i = 0; i <array1.length; i++) for(int j = 0;
		 * j < array2.length; j++) if(array1[i] == array2[j]) list.add(array1[i]);
		 * System.out.println("Common Elements: "+(list));
		 */
		
		
		
		
		
		/*
		 * int[] my_array = { 10789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472,
		 * 2365, 1456, 2165, 1457, 2456};
		 * System.out.println("Original numeric array : "+Arrays.toString(my_array));
		 * Arrays.sort(my_array);
		 * System.out.println("Sorted numeric array : "+Arrays.toString(my_array)); int
		 * index = my_array.length -2;
		 * System.out.println("Second largest: "+my_array[index]);
		 */
		
		
		
		
		
		/*
		 * int r,c; System.out.println("Input number of rows of matrix"); r =
		 * scan.nextInt(); System.out.println("Input number of columns of matrix"); c =
		 * scan.nextInt(); int [][] arr1 = new int[r][c]; int [][] arr2 = new int[r][c];
		 * int [][] sum = new int[r][c];
		 * 
		 * System.out.println("Input elements of first matrix");
		 * 
		 * for(int i = 0; i < r; i++) for(int j = 0; j < c; j++) arr1[i][j] =
		 * scan.nextInt();
		 * 
		 * System.out.println("Input the elements of second matrix");
		 * 
		 * for(int i = 0; i < r; i++) for(int j = 0; j < c; j++) arr2[i][j] =
		 * scan.nextInt();
		 * 
		 * for(int i = 0; i < r; i++) for(int j = 0; j < c; j++) sum[i][j] = arr1[i][j]
		 * + arr2[i][j];
		 * 
		 * System.out.println("Sum of the matrices:-"); for ( int i = 0 ; i < r ; i++ )
		 * { for ( int j = 0 ; j < c ; j++ ) System.out.print(sum[i][j]+"\t");
		 * 
		 * System.out.println(); }
		 */
		
		
		
		
		
		
		/*
		 * String[] my_array = {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
		 * ArrayList<String> list = new ArrayList<String>(Arrays.asList(my_array));
		 * System.out.println(list);
		 */
		
		
		
		
		
		/*
		 * ArrayList<String> list = new ArrayList<String>(); list.add("Python");
		 * list.add("Java"); list.add("PHP"); list.add("C#"); list.add("C++");
		 * list.add("Perl"); String [] array = new String[list.size()];
		 * list.toArray(array); System.out.println(Arrays.toString(array));
		 */
		
		
		
		/*
		 * int[] array_nums = {5, 7, 2, 4, 9};
		 * System.out.println("Original Array: "+Arrays.toString(array_nums)); int
		 * countEven = 0; int countOdd = 0; for(int i = 0; i < array_nums.length; i++) {
		 * if(array_nums[i] %2 == 0) countEven++; else countOdd++; }
		 * System.out.printf("Even is %d Odd is %d",countEven, countOdd);
		 */
		
		
		
		
		/*
		 * int[] array_nums = {5, 7, 2, 4, 9};
		 * System.out.println("Original Array: "+Arrays.toString(array_nums)); int max =
		 * array_nums[0], min = array_nums[0]; for(int i = 0 ; i < array_nums.length;
		 * i++) { if(max < array_nums[i]) { max = array_nums[i]; } else if( min >
		 * array_nums[i]) { min = array_nums[i]; } } int diff = max - min; System.out.
		 * printf("The largest is %d The Smallest is %d\n The Difference is %d",max,min,
		 * diff);
		 */
		
		
		
		
		
		/*
		 * int[] array_nums = {10, 77, 10, 54, -11, 10};
		 * System.out.println("Original Array: "+Arrays.toString(array_nums)); int
		 * search_num = 10; int fixed_sum = 30;
		 * System.out.println("Result: "+result(array_nums, search_num, fixed_sum));
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
