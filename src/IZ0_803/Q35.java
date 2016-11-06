package IZ0_803;

public class Q35 {
	public static int cc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Q9_14:
		// if(1==1) {
		// System.out.println("abc");
		// break;
		// continue;
		// }
						
		//Q8_28:
		Boolean ba = new Boolean(Boolean.parseBoolean("TRUE"));
		Boolean bb = new Boolean(null);
		System.out.println(ba + " " + bb);

		// Q9_17:
		String[] colors = { "red", "gold", "green", "yellow", "maroon", "dark", "grey" };
		for (String c : colors) {
			if (c.length() != 6) {
				continue;
			}
			System.out.println(c + ", ");
		}

		// Q9_15:
		int[] x = { 7, 8, 9 };
		for (int i : x) {
			System.out.print(i + " ");
			i++;
		}

		System.out.println();
		System.out.println("===================");

		// Q9_16:
		int i = 5;
		int isum = 0;
		do {
			isum += i;
		} while ((i--) > 1);
		System.out.println("The sum is " + isum + ".");

		System.out.println("===================");

		String[] table = { "aa", "bb", "cc" };
		for (String ss : table) {
			int ii = 0;
			while (ii < table.length) {
				System.out.println(ii);
				ii++;
				break;
			}
		}

		StringBuilder sb = new StringBuilder();
		String h1 = "HelloWorld";
		sb.append("Hello").append("World");
		if (h1 == sb.toString()) {
			System.out.println("They match");
		}

		if (h1.equals(sb.toString())) {
			System.out.println("They really match.");
		}
	}

}
