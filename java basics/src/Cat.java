
 
public class Cat extends Animal {
 
    public static void hide() {
        System.out.println("The hide method in Cat.");
    }
 
    public void override() {
        System.out.println("The override method in Cat.");
    }
 
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = (Animal)myCat;
        myAnimal.hide();
        myAnimal.override();
    }
}



