import java.util.*;
class ProgrammingLanguage{
	String type;
	String level;
	int inventedYear;
	String founderName;
	double latestVersion;
	String extention;

	ProgrammingLanguage(String type,String level,int inventedYear,String founderName,double latestVersion,String extention){
		super();
		this.type = type;
		this.level = level;
		this.inventedYear= inventedYear;
		this.founderName = founderName;
		this.latestVersion = latestVersion;
		this.extention = extention;
	}

	public void displayProgrammingLanguage(){
		System.out.println("*****Programming Language******");
		System.out.println("Type:"+this.type);
		System.out.println("Level:"+this.level);
		System.out.println("Invented Year:"+this.inventedYear);
		System.out.println("Founder Name:"+this.founderName);
		System.out.println("Latest Version:JDK "+this.latestVersion);
		System.out.println("Extension:"+this.extention);
		System.out.println();
	}
}

class Java extends ProgrammingLanguage{
	String [] features;
	boolean platformIndependent;

	Java(String [] features,boolean platformIndependent,String type,String level,int inventedYear,String founderName,double latestVersion,String extention){
		super(type,level,inventedYear,founderName,latestVersion,extention);
		this.platformIndependent = platformIndependent;
		this.features = features;
	}

	public void displayJava(){
		System.out.println("****JAVA*****");
		System.out.println("Features of java:"+Arrays.toString(this.features));
		System.out.println("Is it platform independent:"+this.platformIndependent);
	}
}

class SingleLevelDriver{
	public static void main(String[] args) {
		String [] features = {"1.MultiThreaded","2.Robust and Secure","3.Portable","4.Dynamic"};
		Java obj = new Java(features,true,"ObjectOriented","High level",1991,"James Gosling",1.22,".java");
		obj.displayProgrammingLanguage();
		obj.displayJava();
	}
}