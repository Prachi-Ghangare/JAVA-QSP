class Parent{}
class Child1 extends Parent{}
class SubChild1 extends Child1{}
class Child2 extends Parent{}
class SubChild2 extends Child2{}
class SubChild3 extends Child2{}

class UpcastingEx{
	public static void main(String[] args) {
		System.out.println("Hello World");
		SubChild1 obj = new SubChild1();
		// SubChild2 obj1 = new Child2(); //CTE:Child2 cannot be converted to SubChild2
		// Child2 obj3 = new SubChild1(); //CTE:SubChild1 cannot be converted to Child2
		// Child2 obj4 = new SubChild2();
		// Child2 obj5 = new SubChild3();
		// Parent obj6 = new Child1();
		// Parent obj7 = new Child2();
		// Parent obj8 = new SubChild1();
		// Parent obj9 = new SubChild2();
		// Parent obj10 = new SubChild3();
	}
}