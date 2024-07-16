import java.util.*;
class KarthikNotHaveGf extends Exception{
	KarthikNotHaveGf(String desc){
		super(desc);
	}
}

class KartikLife{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String kartikGf="";
		String kartikWife="Kareena";
		if(kartikGf.isEmpty()){
			try{
				throw new KarthikNotHaveGf("Kartik does not have GF");
			}
			catch(KarthikNotHaveGf k){
				k.printStackTrace();
				if(kartikWife.isEmpty())
				{
					System.out.println("Kartik does not have wife");
				}
				else{
					System.out.println("Wife Name: "+kartikWife);
				}
			}
		}
	}
}