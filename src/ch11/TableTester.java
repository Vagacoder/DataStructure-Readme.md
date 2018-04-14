package ch11;

public class TableTester {

	public static void main(String[] args) {
		Table tb = new Table(5);
		tb.put("Alex", 101001);
		tb.put("Alex", 301001);
		tb.put("Allen", 101002);
		tb.put("Bob", 101003);
		tb.put("Buck", 401203);
		tb.put("Charlie", 674021);
		tb.put("Dave", 899645);
		System.out.println(tb.get("Buck"));

	}

}
