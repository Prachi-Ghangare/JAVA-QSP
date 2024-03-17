//write a java program to find a area of circle whose radius is 2.5 cm.
class AreaOfCircle {
    public static void main(String[] args) {
        double radius = 2.5;
        final double pi = 22/7;
        double area = pi * (radius*radius);
        System.out.println("Area of Circle is "+area+"cm^2"+"whose radius is "+radius+"cm"); 
    }
    
}