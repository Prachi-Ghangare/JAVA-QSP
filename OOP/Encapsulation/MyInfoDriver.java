class MyInfo{
	private String name, nativeP, branch;
	MyInfo(String name, String nativeP,String branch)
	{
		this.name = name;
		this.nativeP = nativeP;
		this.branch = branch;
	}
	public String getName() {
		return name;
	}
	public void setName(String uname) {
		this.name = uname;
	}
	public String getNativeP() {
		return nativeP;
	}
	public void setNativeP(String unativeP) {
		this.nativeP = unativeP;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String ubranch) {
		this.branch = ubranch;
	}
}

class MyInfoDriver{
	public static void main(String[] args) {
		MyInfo obj = new MyInfo("Ramesh","Pune","CS");
		System.out.println(obj.getName());
		System.out.println(obj.getNativeP());
		System.out.println(obj.getBranch());
	}
}