package stackAndQueues;

import java.util.LinkedList;

public class AnimalShelter {
	LinkedList<Dog> dogQueue = new LinkedList<Dog>();
	LinkedList<Cat> catQueue = new LinkedList<Cat>();
	private static int GLOBALID = 0;
	int dogSize;
	int catSize;
	
	private void enqueueCat(Cat c) {
		catQueue.addLast(c);
	}
	private void enqueueDog(Dog d) {
		dogQueue.addLast(d);
	}
	public void enqueue(Object o) {
		GLOBALID++;
		if(o.getClass() == Cat.class) {
			((Cat) o).id = GLOBALID;
			enqueueCat((Cat) o);
		}
		if(o.getClass()==Dog.class) {
			((Dog) o).id = GLOBALID;
			enqueueDog((Dog) o);
		}
	}
	public Object dequeueAny() {
		if(dogQueue.getFirst().id < catQueue.getFirst().id) {
			return dogQueue.removeFirst();
			}
		else
			return catQueue.removeFirst();
	}
	public Dog dequeueDog() {
		return dogQueue.removeFirst();
	}
	public Cat dequeueCat() {
		return catQueue.removeFirst();
	}
	private void printCat() {
		System.out.print("Cat Queue: ");
		for(int i = 0; i < catQueue.size()-1;i++) {
			System.out.print(catQueue.get(i) + "-> ");
		}
		System.out.println(catQueue.getLast());
	}
	private void printDog() {
		System.out.print("Dog Queue: ");
		for(int i = 0; i < dogQueue.size()-1;i++) {
			System.out.print(dogQueue.get(i) + "-> ");
		}
		System.out.println(dogQueue.getLast());
	}
	public void print() {
		if(catQueue.isEmpty()&&dogQueue.isEmpty()) {
			System.out.println("No animal in the shelter");
			return;
		}
		else if(catQueue.isEmpty()) {
			printDog();
		}
		else if(dogQueue.isEmpty()) {
			printCat();
		}
		else {
			printCat();
			printDog();
		}
		
		
	}


}
