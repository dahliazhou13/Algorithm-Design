package linkedList;

public class SimpleLinkedList {
	public Node head;
	public Node tail;
	SimpleLinkedList(){
		head=tail=null;
	}
	public void insert(int data) {
		if(head==null) {
			head = new Node(data, null);
			tail = head;
		}
		else {
			tail.next = new Node(data,null);
			tail = tail.next;
		}
	}
	public void print() {
		Node p = head;
		System.out.print("( ");
		while(p!=null) {
			if(p.next!=null) {
				System.out.print(p.data + " -> ");
			}
			else {
				System.out.print(p.data + ")");
			}
			p=p.next;
		}
	}
}
