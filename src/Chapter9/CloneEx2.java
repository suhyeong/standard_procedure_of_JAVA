package Chapter9;

import java.util.Arrays;

public class CloneEx2 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		//�迭 arr�� �����ؼ� ���� ������ ���ο� �迭�� �����.
		int[] arrClone = arr.clone();
		arrClone[0] = 6;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
		
		//int[] arrClone = new int[arr.length];
		//System.arraycopy(arr,0,arrClone,0,arr.length);
	}
}
