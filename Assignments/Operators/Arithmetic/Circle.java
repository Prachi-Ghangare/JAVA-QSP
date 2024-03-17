//Write a program that displays the area and perimeter of a circle and has a radius of 5.5 

class Circle {
    public static void main(String[] args) {
        double radius = 5.5;
        final double pi = 22/7;
        double area = pi * (radius*radius);
        double perimeter = 2 * pi * radius;
        System.out.println("Area of Circle is "+area+" cm^2"+" whose radius is "+radius+" cm"); 
        System.out.println("Perimeter of Circle is "+perimeter+" cm"+" whose radius is "+radius+" cm"); 
    }
}
