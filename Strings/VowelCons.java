class VowelCons{
	public static void main(String[] args) {
		String str = "Hello World";
		String v ="";
		String c ="";
		int vCount=0;
		int cCount=0;
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch==' ')
				continue;
			else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
				vCount++;
				v+=ch;
			}
			else{
				cCount++;
				c+=ch;
			}
		}
		System.out.println("Vowel Count: "+vCount);
		System.out.println("Consonents Count: "+cCount);
		System.out.println("Vowels from string: "+v);
		System.out.println("Consonents from string: "+c);
	}
}