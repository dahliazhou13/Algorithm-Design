package linkedList;

public class Palindrome {
	public static boolean isPalinedrome1(Node p) {
		SimpleStack s = new SimpleStack();
		Node head = p;
		while(p!=null) {
			s.push(p.data);
			p = p.next;
		}
		p=head;
		while(p!=null) {
			if(p.data!=s.pop()) {
				return false;
			}
			p=p.next;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		SimpleLinkedList l = new SimpleLinkedList();
		for(int i = 0; i< 50; i ++) {
			l.insert(i);
		}
		for(int i = 50; i>=0; i --){
			l.insert(i);
		}
		l.print();
		
		System.out.println("\n"+ isPalinedrome1(l.head));
	}
}
