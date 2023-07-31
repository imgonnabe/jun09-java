package jun09;

import java.util.Arrays;

// 자바의 랜덤(난수) = 로또 45/6
public class Test02 {
	public static void main(String[] args) {
		// 1. 랜덤 Math.random();
		 for (int i = 0; i < 6; i++) {
			 System.out.print((int) (Math.random() * 45) + 1);
			 System.out.print(" ");}

		int[] arr01 = new int[6];
		for (int i = 0; i < arr01.length; i++) {
			arr01[i] = (int) (Math.random() * 45) + 1;
			System.out.println(i + " : " + arr01[i]);
			for (int j = 0; j < i; j++) {
				if (arr01[j] == arr01[i]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr01));

	}
}
