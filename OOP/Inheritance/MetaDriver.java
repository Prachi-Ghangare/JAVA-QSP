class Meta{
	String ceo;
	int inventedYear;
	int noOFHeadquart;
	double annRevenue;
	int noOfEmp;

	Meta(String ceo,int inventedYear,int noOFHeadquart,double annRevenue,int noOfEmp){
		super();
		this.ceo = ceo;
		this.inventedYear = inventedYear;
		this.noOFHeadquart = noOFHeadquart;
		this.annRevenue = annRevenue;
		this.noOfEmp = noOfEmp;
	}

	public void displayMeta(){
		System.out.println("***** Meta Details *****");
		System.out.println("CEO Name:"+ceo);
		System.out.println("Invented Year:"+inventedYear);
		System.out.println("No. of HeadQuarters:"+noOFHeadquart);
		System.out.println("Annual Revenue:"+annRevenue+"billion");
		System.out.println("No. of Employees:"+noOfEmp);
		System.out.println();
	}
}

class Instagram extends Meta{
	String ceoIg;
	int inventedYearIg;
	int noOFHeadquartIg;
	double annRevenueIg;
	int noOfEmpIg;
	double dailyUsersIg;

	Instagram(String ceoIg,int inventedYearIg,int noOFHeadquartIg,double annRevenueIg,int noOfEmpIg,double dailyUsersIg,String ceo,int inventedYear,int noOFHeadquart,double annRevenue,int noOfEmp){
		super(ceo,inventedYear,noOFHeadquart,annRevenue,noOfEmp);
		this.ceoIg = ceoIg;
		this.inventedYearIg = inventedYearIg;
		this.noOFHeadquartIg = noOFHeadquartIg;
		this.annRevenueIg = annRevenueIg;
		this.noOfEmpIg = noOfEmpIg;
		this.dailyUsersIg = dailyUsersIg;
	}

	public void displayIg(){
		System.out.println("***** Instagram Details *****");
		System.out.println("CEO Name:"+ceoIg);
		System.out.println("Invented Year:"+inventedYearIg);
		System.out.println("No. of HeadQuarters:"+noOFHeadquartIg);
		System.out.println("Annual Revenue:$"+annRevenueIg+"billion");
		System.out.println("No. of Employees:"+noOfEmpIg);
		System.out.println("No. of Daily Users:"+dailyUsersIg+"million");
		System.out.println();
	}
}

class WhatsApp extends Meta{
	String ceoWp;
	int inventedYearWp;
	int noOFHeadquartWp;
	double annRevenueWp;
	int noOfEmpWp;
	double dailyUsersWp;

	WhatsApp(String ceoWp,int inventedYearWp,int noOFHeadquartWp,double annRevenueWp,int noOfEmpWp,double dailyUsersWp,String ceo,int inventedYear,int noOFHeadquart,double annRevenue,int noOfEmp){
		super(ceo,inventedYear,noOFHeadquart,annRevenue,noOfEmp);
		this.ceoWp = ceoWp;
		this.inventedYearWp = inventedYearWp;
		this.noOFHeadquartWp = noOFHeadquartWp;
		this.annRevenueWp = annRevenueWp;
		this.noOfEmpWp = noOfEmpWp;
		this.dailyUsersWp = dailyUsersWp;
	}

	public void displayWp(){
		System.out.println("***** WhatsApp Details *****");
		System.out.println("CEO Name:"+ceoWp);
		System.out.println("Invented Year:"+inventedYearWp);
		System.out.println("No. of HeadQuarters:"+noOFHeadquartWp);
		System.out.println("Annual Revenue:$"+annRevenueWp+"billion");
		System.out.println("No. of Employees:"+noOfEmpWp);
		System.out.println("No. of Daily Users:"+dailyUsersWp+"million");
		System.out.println();
	}
}

class MetaDriver{
	public static void main(String[] args) {
		Instagram obj1 = new Instagram("Adam Mosseri",2010,1,85,19000,500,"Mark Zuckerberg",2009,1,134,66185);
		WhatsApp obj2 = new WhatsApp("Jan Koum",2009,2,51.4,1883,23.8,"Mark Zuckerberg",2009,1,134,66185);
		obj1.displayMeta();
		obj1.displayIg();
		obj2.displayWp();
	}
}