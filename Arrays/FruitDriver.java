import java.util.*;

class FruitStore{
	String [] fruits;
	static Scanner sc = new Scanner(System.in);

	public void storeFruits(String [] fruits){
		this.fruits=fruits;
		for(int i=0;i<fruits.length;i++){
			fruits[i]=sc.next();
		}
	}

	public void displayFruits(){
		System.out.println(Arrays.toString(fruits));
	}

	public void changeFruit(){
		System.out.println("Enter the fruit to change: ");
		String fruit=sc.next();
		for(int i=0;i<fruits.length;i++){
			if(fruit.equals(fruits[i])){
				System.out.println("Enter new fruit name: ");
				String newFruit=sc.next();
				fruits[i]=newFruit;
				displayFruits();
				break;
			}
		}
	}

	// public void closeStore(){
	// 	System.out.println("Want to close the store(yes/no): ");
	// 	String str = sc.next();
	// 	if(str=="yes")
	// 		System.exit(0); 
	// }
}

class FruitDriver{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FruitStore f = new FruitStore();

		boolean flag=true;
		while(flag){
			System.out.println("Choose operations to perform:");
			System.out.println("1.Insert Fruits");
			System.out.println("2.Display Fruits");
			System.out.println("3.Update Fruits");
			System.out.println("4.Exit");
			int opt = sc.nextInt();
			switch(opt){
				case 1:{
					System.out.println("Enter the size: ");
					int size = sc.nextInt();
					System.out.println("Enter fruits: ");
					String [] fruits=new String[size];
					f.storeFruits(fruits);
				}
				break;
				case 2:{
					if(f.fruits==null)
						System.out.println("Please add fruits first to display it");
					else
						f.displayFruits();
				}
				break;
				case 3:{
					if(f.fruits==null)
						System.out.println("Please add fruits first to update it");
					else
						f.changeFruit();
				}
				break;
				case 4:{
					System.exit(0);
				}
				break;
				default :{
					System.out.println("Enter valid option");
				}
			}
		}
	}
}