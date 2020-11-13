
public class Constructor {
	String name;
	int ID;

	public Constructor(String name,int ID) {
		this.name=name;
		this.ID=ID;	
	}
	public static void main(String[] args) {
		Constructor c1=new Constructor("sachin",100);
		Constructor c2=new Constructor("sai",101);
		Constructor c3=new Constructor("samrat",102);
		Constructor c4=new Constructor("chalvaji",103);
		Constructor c5=new Constructor("sambaih",104);
		Constructor c6=new Constructor("sammy",105);
		
     System.out.println(c1.ID+" "+c1.name);
     System.out.println(c2.ID+" "+c2.name);
     System.out.println(c3.ID+" "+c3.name);
     
     
	}

}
