class Parent{}
class Child1 extends Parent{}
class SubChild1 extends Child1{}
class SubChild2 extends Child1{}
class Child2 extends Parent{}
class SubChild3 extends Child2{}
class SubChild4 extends Child2{}

class DowncastingEx{
	public static void main(String[] args) {
		Parent obj = new Child1();
		SubChild1 obj1 = (SubChild1)obj; //RTE:class Child1 cannot be cast to class SubChild1
		// Parent obj = new SubChild2();
		// Child1 obj1 = (Child1)obj;
		// SubChild2 obj1 = (SubChild2)obj;
		// Child1 obj1 = (SubChild2)obj;
		// SubChild1 obj = new SubChild1();
		// SubChild1 obj1 = (SubChild1)obj;
		// Child1 obj = new SubChild1();
		// SubChild2 obj1 = (SubChild2)obj; //RTE:class SubChild1 cannot be cast to class SubChild2
		// SubChild1 obj1 = (Child1)obj; //CTE:Child1 cannot be converted to SubChild1 
	}
}