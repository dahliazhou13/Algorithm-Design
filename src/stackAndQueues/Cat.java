package stackAndQueues;

public class Cat {
// A cat class that probably will have more features like weight type age...
	//Here i use a simple class with no real functionality
	public int id;
	Cat(){
		
	}
	
	Cat(int id){
		this.id = id;
	}
	@Override
	public String toString(){
		return "Cat " + this.id;
	}
}
