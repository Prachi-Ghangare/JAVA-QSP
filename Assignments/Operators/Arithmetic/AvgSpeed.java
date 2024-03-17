// Assume a runner runs 14 km in 45 min and 30 sec. Write a program that average speed in miles per hour.

class AvgSpeed {
    public static void main(String[] args) {
         double distance = 14;
         double time = 45.5/60;
         double avgSpeed = (distance / time )/1.6;
         System.out.println("Average Speed of runner is "+avgSpeed+" miles per hour");
    }
}
 