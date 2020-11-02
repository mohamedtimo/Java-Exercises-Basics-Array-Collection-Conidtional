package exercises;

import java.util.Scanner;

//Java Exercises link Source = https://www.w3resource.com/java-exercises/datatypes/index.php
public class DataTypes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		/*
		 * System.out.println("Input a degree in Fahrenheit: "); int fahrenheit =
		 * scan.nextInt(); double celsius = (5 * (fahrenheit - 32.0)) /9.0;
		 * System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius +
		 * " in Celsius");
		 */
		
		 
		 
		
		
		/*
		 * System.out.print("Input a value for inch: "); double inch =
		 * scan.nextDouble(); double meters = inch * 0.0254; System.out.println(inch +
		 * " inch is " + meters + " meters");
		 */
		 
		 
		/*
		 * double minutesInYear = 60 * 24 * 365;
		 * System.out.print("Input the number of minutes: "); double min =
		 * scan.nextDouble(); long years = (long) (min / minutesInYear); int days =
		 * (int) (min / 60 / 24) % 365; System.out.println((int) min +
		 * " minutes is approximately " + years + " years and " + days + " days");
		 */
		
		
		
		
		
		/*
		 * System.out.print("Input the time zone offset to GMT: "); long timeZoneChange
		 * = scan.nextInt();
		 * 
		 * long totalMilliseconds = System.currentTimeMillis();
		 * 
		 * long totalSeconds = totalMilliseconds / 1000;
		 * 
		 * long currentSecond = totalSeconds % 60;
		 * 
		 * long totalMinutes = totalSeconds / 60;
		 * 
		 * long currentMinute = totalMinutes % 60;
		 * 
		 * long totalHours = totalMinutes / 60;
		 * 
		 * long currentHour = ((totalHours + timeZoneChange) % 24);
		 * 
		 * System.out.println("Current time is " + currentHour + ":" + currentMinute +
		 * ":" + currentSecond);
		 */
        
		
		
		
		
		
		/*
		 * System.out.println("Input distance in meters: "); float distance =
		 * scan.nextFloat(); System.out.print("Input hour: "); float hr =
		 * scan.nextFloat(); System.out.print("Input minutes: "); float min =
		 * scan.nextFloat(); System.out.print("Input seconds: "); float sec =
		 * scan.nextFloat();
		 * 
		 * float timeSeconds = (hr * 3600) + (min * 60) + sec; float mps = distance /
		 * timeSeconds; float kph = (distance / 1000.0f) / (timeSeconds / 3600.0f);
		 * float mph = kph /1.609f;
		 * 
		 * System.out.println("Your speed in meters/second is "+mps);
		 * System.out.println("Your speed in km/h is "+kph);
		 * System.out.println("Your speed in miles/h is "+mph); scan.close();
		 */
		
		
		
		
		
		
		/*
		 * System.out.print("Input the side length value: "); double val =
		 * scan.nextDouble(); System.out.println("Square: "+Math.pow(val, 2));
		 * System.out.println("Cube: "+Math.pow(val, 3));
		 * System.out.println("Fourth: "+Math.pow(val, 4));
		 */
		
		
		
		
		
		
		/*
		 * System.out.println("Input first integer: "); int n1 = scan.nextInt();
		 * System.out.println("Input second Integer: ");int n2 = scan.nextInt();
		 * System.out.println("Sum of two integers: "+ (n1 + n2));
		 * System.out.println("Difference of two integers: "+ (n1 - n2));
		 * System.out.println("Product of two integers: "+ (n1 * n2));
		 * System.out.println("Average of two integers: "+(double) (n1 + n2) /2);
		 * System.out.println("Distance of two integers: "+ Math.abs(n1 - n2));
		 * System.out.println("Max of two integers: "+ Math.max(n1, n2));
		 * System.out.println("Min of two integers: "+ Math.min(n1, n2));
		 */

		
		
		
		
		
		/*
		 * int n = 123456; String number = String.valueOf(n); char[] digits =
		 * number.toCharArray(); System.out.println(digits);
		 */
		
		
		/*
		 * int a,i,count=0; System.out.println("Enter an Integer: "); a =
		 * scan.nextInt(); while(a > 0) { i = a % 10; System.out.print(i+" "); a = a /
		 * 10; }
		 */
		
		
		
		
		
		
		
		
		/*
		 * int n1 = Integer.MIN_VALUE; int n2 = Integer.MAX_VALUE;
		 * System.out.println("Signed integers: " + n1 + ", " + n2); int
		 * compareSignedNum = Integer.compare(n1, n2);
		 * System.out.println("Result of comparing signed numbers: " +
		 * compareSignedNum); int compareUnsignedNum = Integer.compareUnsigned(n1, n2);
		 * System.out.println("Result of comparing unsigned numbers: " +
		 * compareUnsignedNum);
		 */
		
		
		
		
		
		
	}

}
