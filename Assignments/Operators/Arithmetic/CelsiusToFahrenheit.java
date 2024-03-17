//Write a program that reads a celcius degree in a double value from the console, then convert it to fahrenheit and displays the result.

import java.util.Scanner;

class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius :");
        double celsius = ip.nextDouble();
        double fahrenheit = (9.0/5)*celsius+32;
        System.out.println(celsius+"Celsius is "+fahrenheit+" Fahrenheit");
    }
}
 