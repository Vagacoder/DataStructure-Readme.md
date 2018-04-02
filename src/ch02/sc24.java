package ch02;

import edu.colorado.geometry.*;

public class sc24 {

	public static void main(String[] args) {
		Location l0 = new Location(0, 0);
		Location l1 = new Location(1, 1);
		System.out.println(Location.distance(l0, l1));
		Location l2 = Location.midpoint(l0, l1);
		System.out.printf("%.2f  %.2f", l2.getX(), l2.getY());

	}

}
