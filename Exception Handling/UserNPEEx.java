import java.util.*;

class Student{
	String name;
	Student(String name){
		this.name=name;
	}
}
class UserException extends RuntimeException{
	UserException(String desc){
		super(desc);
	}
}
class UserNPEEx{
	public static void main(String[] args) {
		Student obj= new Student("Ramesh");
		System.out.println(obj.name);
		Student obj1=null;
		if(obj1==null){
			try{
				throw new UserException("NPE Handled");
			}
			catch(UserException ue){
				ue.printStackTrace();
			}
		}
		else{
			System.out.println(obj1.name);
		}
	}
}