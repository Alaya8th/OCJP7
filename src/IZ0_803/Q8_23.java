package IZ0_803;

class Star {
	String name;
	int neighbor;

	public Star(String name, int n) {
		this.name = name;
		this.neighbor = n;
	}
}

public class Q8_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Star[] stars = { new Star("Mercury", 0), new Star("Venus", 0), new Star("Earth", 1), new Star("Mars", 2), };
		System.out.println(stars);
		System.out.println(stars[2]);
		System.out.println(stars[2].neighbor);
		System.out.println();

		// Q9_24:
		// while(int x=1;x<3){
		// x++;
		// System.out.println("ii="+x);
		// }

		// Q9_25:
		String[][] strArr = new String[2][];
		strArr[0] = new String[] { "hello", "world" };
		strArr[1] = new String[] { "banana", "apple", "grapes" };

		System.out.println("strArr[1] = " + strArr[1]);

		// Option A:
		System.out.println("Option A 測試結果:");
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				strArr[i][j] = strArr[i][j].toUpperCase();
				System.out.println("strArr[i][j] = " + strArr[i][j]);
			}
		}

		System.out.println("");

		// Option C:
		System.out.println("Option C 正確的寫法:");
		for (String a[] : strArr) {
			for (String x : a) {
				System.out.println(x.toUpperCase());
			}
		}

		// Q9_29: Compilation fails
		String[] colors = { "dark", "pink", "green", "yellow", "maroon", "cyan" };
		int count = 0;
		for (String c : colors) {
			if (count >= 5) {
				break;
			} else {
				continue;
			}
			
//			if (c.length() >= 3) {		//unreachable code
//
//			}
			
		}
	}
}
