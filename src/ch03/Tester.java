package ch03;

public class Tester {

	public static void main(String[] args) {
		
		int[] b;
		b =new int[1000];
		for (int i = 1; i<=1000; i ++) {
			b[i-1] =i;
		}
		int[] a= {1,2,3,4,6};
		int[] c = {8,9,10};
		System.out.println(a.toString());
		
		Sc11 newtest = new Sc11();
		int[] d = newtest.copyElements(a, c, 3);
		for (int i : d) {
			System.out.println(i);
		}
		
	}

}
