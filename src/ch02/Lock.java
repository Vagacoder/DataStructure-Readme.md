package ch02;

public class Lock {

	private int x, y, z, current = 0;
	private boolean locked = true;
	private boolean clockwise = true;


	public Lock(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}


	public void setNewPass(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}


	public void reset() {
		current = 0;
	}


	public void lockIt() {
		locked = true;
	}

}
