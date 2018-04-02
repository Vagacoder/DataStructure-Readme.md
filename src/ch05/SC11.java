package ch05;

public class SC11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public <E> int countOccurs(E[] data, E target) {
		int count = 0;
		for (E item : data) {
			if (item.equals(target) && item != null) {
				count++;
			}
		}

		return count;
	}


	public <S, T> boolean test(S[] sa, S ss, T[] ta, T tt) {
		return true;
	}
}
