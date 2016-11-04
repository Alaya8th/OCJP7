package IZ0_803;

public class Q6_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Duke";
		//char str2[] = { 'D', 'u', 'k', 'e' };
		String str2[] = { "D", "u", "k", "e" };
		String s3 = null;
		//for (char c : str2) {
		for (String c : str2) {
			System.out.println(c);
			s3 = s3 + c;
		}
		System.out.println(s1.toString());
		System.out.println();
		System.out.println(s3.toString());
		System.out.println(s3);
		if (s3.equals(s1))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
