package ch04;

public class NodeOfDouble {

	private double data;
	NodeOfDouble prev = null;
	NodeOfDouble next = null;
	
	
	public NodeOfDouble(double data) {
		this.data = data;
	}

	public NodeOfDouble(double data, NodeOfDouble prev, NodeOfDouble next) {
		this.data = data;
		this.prev = prev;
		this.next = next;
	}
	
	public double getData() {
		return data;
	}

	public void setData(double data) {
		this.data = data;
	}
	
	public void addNodeAfer(double data) {
		next = new NodeOfDouble(data, this, next);
	}
	
}
