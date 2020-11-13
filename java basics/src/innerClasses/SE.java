package innerClasses;

public class SE {
	int x =10;
	static int y =20;
	public class Inn{
		public void m1() {
			System.out.println(x);
			System.out.println(y);
		}
	}

	public static void main(String[] args) {
		SE s = new SE();
		SE.Inn i = s.new Inn();
		i.m1();

	}

}
