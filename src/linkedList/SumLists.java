package linkedList;

public class SumLists {
	public static int sum(Node p1, Node p2) {
		return sumHelper(p1, 1, 0) + sumHelper(p2, 1, 0);
	}
	public static int sumHelper(Node p, int mul, int result) {
		if(p==null) {
			return result;
		}
		else {
			result += p.data * mul;
			return sumHelper(p.next, mul * 10, result);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleLinkedList l1 = new SimpleLinkedList();
		l1.insert(9);
		l1.insert(1);
		l1.insert(2);
		l1.print();
		System.out.print(" + ");
		SimpleLinkedList l2 = new SimpleLinkedList();
		l2.insert(5);
		l2.insert(9);
		l2.insert(3);
		l2.print();
		System.out.println(" = " + sum(l1.head,l2.head));
	}
}