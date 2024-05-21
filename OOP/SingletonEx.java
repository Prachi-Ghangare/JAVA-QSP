class SingletonEx{
	String name;
	String branch;
	private static SingletonEx obj;

	private SingletonEx(String name,String branch){
		this.name = name;
		this.branch = branch;
	}

	public static SingletonEx getInstance(String name,String branch){
		if(obj==null){
			obj = new SingletonEx(name,branch);
			return obj;
		}
		else
			return obj;
	}

	public static void main(String[] args) {
		SingletonEx obj = getInstance("Ramesh","Cs");
		System.out.println(obj.name);
	}
}