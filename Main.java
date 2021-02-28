package pl.gda.wsb;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello world!");

	Human human1 = new Human("Jan", "Kowalski", "Programista");
	Human human2 = new Human("Pawel", "Kopacz", "Tester");

	Animal animal1 = new Animal("mouse", "Miki", 0.9);
	Animal animal2 = new Animal("lion", "Mufasa", 124.5);

	Phone phone1 = new Phone("Samsung","Galaxy S5", 2199.99);
	Phone phone2 = new Phone("LG", "G3", 1299.99);

	System.out.println(human1);
	System.out.println(human1.firstName);
    }
}
