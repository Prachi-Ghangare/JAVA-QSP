import java.util.*;
class AreaHexagon{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side:");
		double side = sc.nextDouble();
		double area = (3*Math.sqrt(3)/2)*(side*side);
		System.out.print("The area of the hexagon is "+area);			
	}
}