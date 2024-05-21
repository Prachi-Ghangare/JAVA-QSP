abstract class Arithmetic{
	abstract int addition(int num1,int num2);
	abstract int substraction(int num1,int num2);
	abstract int multiplication(int num1,int num2);
	abstract int division(int num1,int num2);
	abstract int modulus(int num1,int num2);
}
class Implementation extends Arithmetic{
	public int addition(int num1,int num2){
		return num1+num2;
	}
	public int substraction(int num1,int num2){
		return (num1-num2);
	}
	public int multiplication(int num1,int num2){
		return num1*num2;
	}
	public int division(int num1,int num2){
		return num1/num2;
	}
	public int modulus(int num1,int num2){
		return num1%num2;
	}
}
class AbstractionEx{
	public static void main(String[] args) {
		Implementation obj = new Implementation();
		System.out.println("Additon is:"+obj.addition(10,5));
		System.out.println("substraction is:"+obj.substraction(10,5));
		System.out.println("multiplication is:"+obj.multiplication(10,5));
		System.out.println("division is:"+obj.division(10,5));
		System.out.println("modulus is:"+obj.modulus(10,5));
	}
}