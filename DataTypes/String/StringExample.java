class StringExample {
    public static void main(String[] args) {
        String a = "Hello";     // " " -> String Literal
        System.out.println(a);
        String b = new String("Hello");  // new Keyword
        System.out.println(b);

        // String a = "Hello";
        // String b = "hello"; 
        // System.out.println(a==b);   //true

        // String a ="Hello";
        // String a = new String("Hello");
        // System.out.println(a==b); // false
        // System.out.println(a.equals(b)); //equals() is a method in String class. O/P - true

        // String a = new String("Hello");
        // String b = new String("hello"); 
        // System.out.println(a==b);   // false
        // System.out.println(a.equals(b));    //true
    }
}
