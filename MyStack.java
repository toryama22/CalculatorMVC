public class MyStack {
	private char[] stck;
	private int top;

	public MyStack() {
		top = -1;
		stck = new char[30];
	}

	public char pop() {
		char temp = stck[top];
		top = top - 1;
		return temp;
	}

	public void push(char entity) {
		top = top + 1;
		stck[top] = entity;
	}

	public char peek() {
		return stck[top];
	}

	public boolean isEmpty() {
		if (top > -1) {
			return false;
		}
		return true;
	}
}