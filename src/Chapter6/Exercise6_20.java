package Chapter6;

public class Exercise6_20 {
	public static int[] shuffle(int[] arr) {
		if(arr == null || arr.length == 0)
			return arr;
		
		for(int j=0;j<arr.length;j++) {
			int i = (int)(Math.random()*arr.length);
			
			int tmp = arr[j];
			arr[j] = arr[i];
			arr[i] = tmp;
		}
		
		return arr;
	}

	public static void main(String args[]) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
		}
}
