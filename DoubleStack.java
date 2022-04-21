public class DoubleStack {
	private double[] stck;
	private int top;

	//private double[] stck;
	//private int top;

	public DoubleStack() {
		top = -1;
		stck = new double[30];
	}

	public double pop() {
		double temp = stck[top];
		top = top - 1;
		return temp;
	}

	public void push(double entity) {
		top = top + 1;
		stck[top] = entity;
	}

	public double peek() {
		return stck[top];
	}

	public boolean isEmpty() {
		if (top > -1) {
			return false;
		}
		return true;
	}
}