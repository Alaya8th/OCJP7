package IZ0_803;

public class Q9_19 {

	public static void update(int... arr) {
		for (int idx = 0; idx < arr.length; idx++) {
			arr[idx] = arr[idx] + 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 40 };
		update(arr);
		for (int x : arr) {
			System.out.print(x + ", ");
		}
		update(arr[0], arr[1], arr[2]);
		System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2]);
	}
}
