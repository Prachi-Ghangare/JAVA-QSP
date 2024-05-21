/*class Parent{
	public static void greeting() {
		System.out.println("Good Morning");
	}
}
class Child extends Parent{
	public static void greeting() {
		System.out.println("Good Afternoon");
	}
}
class MethodShadowingEx{
	public static void main(String[] args) {
		Child obj = new Child();
		obj.greeting();
	}
}*/

//Same return type for primitive
/*class Parent{
	public static int m1(){
		return 0;
	}
}
class Child extends Parent{
	public static int m1(){
		return 0;
	}
}
class MethodShadowingEx{
	public static void main(String[] args) {
		Child obj = new Child();
		obj.m1();
	}
}*/

//Same return type for non-primitive
/*class Parent{
	public static String m1(){
		return null;
	}
}
class Child extends Parent{
	public static String m1(){
		return null;
	}
}
class MethodShadowingEx{
	public static void main(String[] args) {
		Child obj = new Child();
		obj.m1();
	}
}*/

//Covariant return type for non-primitive
/*class Parent{
	public static Object m1(){
		return null;
	}
}
class Child extends Parent{
	public static String m1(){
		return null;
	}
}
class MethodShadowingEx{
	public static void main(String[] args) {
		Child obj = new Child();
		obj.m1();
	}
}*/

//Covariant return type for non-primitive
/*class Parent{
	public static String m1(){
		return null;
	}
}
class Child extends Parent{
	public static Object m1(){ //CTE:m1() in Child cannot hide m1() in Parent
		return null;
	}
}
class MethodShadowingEx{
	public static void main(String[] args) {
		Child obj = new Child();
		obj.m1();
	}
}*/

/*//Same access modifier for both methods
class Parent{
	public static String m1(){
		return null;
	}
}
class Child extends Parent{
	public static String m1(){
		return null;
	}
}
class MethodShadowingEx{
	public static void main(String[] args) {
		Child obj = new Child();
		obj.m1();
	}
}*/

//Diff access modifier for both methods and CT sucessful
/*class Parent{
	static String m1(){
		return null;
	}
}
class Child extends Parent{
	public static String m1(){
		return null;
	}
}
class MethodShadowingEx{
	public static void main(String[] args) {
		Child obj = new Child();
		obj.m1();
	}
}*/

//Diff access modifier for both methods and CTE
class Parent{
	protected static String m1(){
		return null;
	}
}
class Child extends Parent{
	private static String m1(){ //CTE: m1() in Child cannot override m1() in Parent
		return null;
	}
}
class MethodShadowingEx{
	public static void main(String[] args) {
		Child obj = new Child();
		obj.m1();
	}
}
