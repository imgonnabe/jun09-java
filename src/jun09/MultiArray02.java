package jun09;

import java.util.Arrays;

public class MultiArray02 {
	public static void main(String[] args) {
		int[][] arr01 = new int[5][5];
		int num = 1;
		for (int i = 0; i < arr01.length; i++) {
			for (int j = 0; j < arr01[i].length; j++) {
				arr01[i][j] = num++;
			}
		}
		
		// 출력
		for (int[] is : arr01) {
			for (int i : is) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println(Arrays.toString(arr01));
		// [[I@515f550a, [I@626b2d4a, [I@5e91993f, [I@1c4af82c, [I@379619aa]
		for (int[] is : arr01) {
			System.out.println(Arrays.toString(is));	
		}
		for (int i = 0; i < arr01.length; i++) {
			System.out.println(Arrays.toString(arr01[i]));
		}

	}

}
