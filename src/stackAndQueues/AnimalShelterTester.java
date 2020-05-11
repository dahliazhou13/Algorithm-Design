package stackAndQueues;

public class AnimalShelterTester {
	public static void main(String[] args) {
		AnimalShelter a = new AnimalShelter();
		for(int i = 0; i < 5; i++) {
			a.enqueue(new Cat());
		}
		for(int i = 0; i < 10; i++) {
			a.enqueue(new Dog());
		}
		for(int i = 0; i < 5; i++) {
			a.enqueue(new Cat());
		}
		a.print();
		for(int i = 0; i < 10; i++) {
			System.out.println(a.dequeueAny()+ " is adopted");
		}
		for(int i = 0; i < 2; i++) {
			System.out.println(a.dequeueCat()+ " is adopted");
		}
		for(int i = 0; i < 2; i++) {
			System.out.println(a.dequeueDog()+ " is adopted");
		}
		a.print();
	}


}