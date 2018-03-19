package ch04;

public class NodeOfIntAndDouble {
	
	private double data1;
	private int data2;
	NodeOfIntAndDouble prev = null;
	NodeOfIntAndDouble next = null;
	
	public NodeOfIntAndDouble(double data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	public NodeOfIntAndDouble(double data1, int data2, NodeOfIntAndDouble prev,
			NodeOfIntAndDouble next) {
		this.data1 = data1;
		this.data2 = data2;
		this.prev = prev;
		this.next = next;
	}

	public double getData1() {
		return data1;
	}

	public void setData1(double data1) {
		this.data1 = data1;
	}

	public int getData2() {
		return data2;
	}

	public void setData2(int data2) {
		this.data2 = data2;
	}
	
}
