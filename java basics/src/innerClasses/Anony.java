package innerClasses;

public class Anony {

	public static void main(String[] args) {
		Popcorn p = new Popcorn() {
			public void taste() {
				System.out.println("spicy");
			}
		};
		p.taste();//spicy
		
		Popcorn p1 = new Popcorn();
		p1.taste();//salty
		
		Popcorn p2 = new Popcorn() {
			public void taste() {
				System.out.println("sweet");
			}
		};
		
		p2.taste();//sweet
		
		System.out.println(p.getClass().getName());//Anony$1
		System.out.println(p1.getClass().getName());//Popcorn
		System.out.println(p2.getClass().getName());//Anony$2

	}

}
