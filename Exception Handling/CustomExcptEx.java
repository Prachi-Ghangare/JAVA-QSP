class CustomExcpt extends Throwable{
	CustomExcpt(String desc){
		super(desc);
	}
}

class CustomExcptEx{
	public static void main(String[] args) {
		try{
			throw new CustomExcpt("Custom Exception");
		}
	}
}