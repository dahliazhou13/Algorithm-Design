package linkedList;

public class SimpleStack {
	int t;
	int[] stack;
	
	public SimpleStack(){
		stack = new int[8];

		t = -1;
	}
	public SimpleStack(int size){
		stack = new int[size];

		t = -1;
	}
	public boolean isEmpty() {
		return t == -1;
	}
	public boolean isFull() {
		return t==stack.length-1;
	}
	public int size() {
		return t+1;
	}
	public void doubleSize() {
		int[] doubleStack = new int[2*stack.length];
		for(int i=0; i<=t; i++) {
			doubleStack[i] = stack[i];
		}
		this.stack = doubleStack;
	}
	public void halfSize() {
		int[] halfStack = new int[stack.length/2];
		for(int i=0; i<=t; i++) {
			halfStack[i] = stack[i];
		}
		this.stack = halfStack;
	}
	public void push(int e) {
		if(this.isFull()) {
			doubleSize();
		}
		t++;
		stack[t] = e;
	}
	public int pop() {
		if(isEmpty()) {
			return -999;
		}
		int e = stack[t--];
		if(t<stack.length/4)
			halfSize();
		return e;
	}
	public void print() {
		if(isEmpty()) {
			System.out.println("Empty Tree");
			return;
		}
		for(int i=0; i<t; i++) {
			System.out.print(stack[i] + " ");
		}
		System.out.println(stack[t]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method

		SimpleStack s = new SimpleStack(1);
		for(int i = 0; i<100; i++) {
			s.push(i);
		}
		s.print();
		for(int i = 0; i<100; i++) {
			System.out.print(s.pop()+ " ");
		}
		
	}
}
