//Write a program that prompt the user to enter v in m/s and the acceleration a in m/s^2 and display the minimum runway length

import java.util.Scanner;

class RunwayLength{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter speed and acceleration:");
		float speed = sc.nextFloat();
		float accl = sc.nextFloat();
		float len = (speed*speed)/(2*accl);
		System.out.print("The minimum runway length for this airplane is "+len);
	}
}