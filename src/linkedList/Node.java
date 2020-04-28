package linkedList;

public class Node {
	public int data;
	public Node next;
	public Node(){
		data = 0;
		next = null;
	}
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
}
