package jun09;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		int[] arr01 = new int[5];
		arr01[arr01.length - 1] = 100;
		System.out.println(arr01);
		System.out.println(arr01[0]);

		// 사용자가 점수입력하면 arr01에 저장하고 출력하기
		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력하세요: ");
		for (int i = 0; i < arr01.length; i++) {
			arr01[i] = sc.nextInt();
		}
		// 출력
		System.out.println(Arrays.toString(arr01));
		for (int i = 0; i < arr01.length; i++) {
			System.out.println(arr01[i]);
		}
		
		// forEach 향상for문
		for (int i : arr01) {
		//    요소 : 집합  집합을 구성하는 요소를 하나씩 반환
			System.out.println(i);
		}
		sc.close();
	}

}
