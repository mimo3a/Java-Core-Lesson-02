package Logos;

public class application {
	public static void main(String[] args) {

		boolean a = true;
		char b = 'l';
		float c = 5.5F;
		double d = 6.6;
		int e = 25;
		byte f = 100;
		short j = 31875;
		long k = 1763765465455L;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(j);
		System.out.println(k);
		System.out.println("Byte min = " + Byte.MIN_VALUE);
		System.out.println("Byte max = " + Byte.MAX_VALUE);
		System.out.println("Short max = " + Short.MAX_VALUE);
		System.out.println("Short min = " + Short.MIN_VALUE);
		System.out.println("Short max = " + Short.MAX_VALUE);
		System.out.println("Long min = " + Long.MIN_VALUE);
		System.out.println("Long max = " + Long.MAX_VALUE);
		System.out.println("Int max = " + Integer.MIN_VALUE);
		System.out.println("Int min = " + Integer.MAX_VALUE);
		System.out.println("Char min = " + Character.MIN_VALUE);
		System.out.println("Char max = " + Character.MAX_VALUE);
		System.out.println("Float min = " + Float.MIN_VALUE);
		System.out.println("Float max = " + Float.MAX_VALUE);
		System.out.println("Double min = " + Double.MIN_VALUE);
		System.out.println("Double max = " + Double.MAX_VALUE);

		int[] my_arrow = { 2, 555, -25, 298, 16, -5, -156, 13, -13, 10 };
		int min_maning = my_arrow[0];
		int max_maning = my_arrow[0];
		for (int i = 0; i < my_arrow.length; i++) {
			if (my_arrow[i] < min_maning) {
				min_maning = my_arrow[i];

			} else if (my_arrow[i] > max_maning) {
				max_maning = my_arrow[i];
			}

		}
		System.out.println("Minimum is " + min_maning);
		System.out.println("Maximum is " + max_maning);

	}

}
