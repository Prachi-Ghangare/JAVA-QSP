//write a program that displays the area and perimeter of a rectangle eith the width of 4.5 and height of 7.9

class Rectangle {
    public static void main(String[] args) {
        float height = 7.9f;
        float width = 4.5f;
        float area = width * height ;
        float perimeter = 2 * (width + height) ;
        System.out.println("Area of Rectangle is "+area+" cm^2"+" whose height and width are "+height+" cm and "+ width+" cm respectively"); 
        System.out.println("Perimeter of Rectangle is "+perimeter+" cm"+" whose height and width are "+height+" cm and "+ width+" cm respectively");
    }    
}
