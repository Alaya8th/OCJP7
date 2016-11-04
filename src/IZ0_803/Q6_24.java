package IZ0_803;

public class Q6_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Jim";
		String s2 = new String("Jim");
		String s3 = s2;
		if (s1.equals(s3)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		if(s1.equalsIgnoreCase(s2)){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}
