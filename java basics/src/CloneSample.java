
public class CloneSample implements Cloneable{
	
	int x =10;
	int y =20;

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneSample cs = new CloneSample();
		
		CloneSample cs1 = (CloneSample)cs.clone();
		cs1.x = 100;
		cs1.y = 200;
		System.out.println(cs.x +" "+ cs.y);
		

	}

}
