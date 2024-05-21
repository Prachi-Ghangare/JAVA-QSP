class CopyConstr{
	int a,b;

	//Parameterized Constructer
	CopyConstr(int a,int b){
		this.a = a;
		this.b = b;
	}

	//Copy Constructers
	CopyConstr(CopyConstr obj){
		this.a = obj.a;
		this.b = obj.b;
	}

	public void Addition() {
		System.out.println("Addition is:"+(a+b));
	}

	public static void main(String[] args) {
		CopyConstr obj = new CopyConstr(10,20);
		obj.Addition();

		CopyConstr obj1 = new CopyConstr(obj);
		obj1.Addition();
	}
}