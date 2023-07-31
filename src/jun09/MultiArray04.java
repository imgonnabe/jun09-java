package jun09;

// 3x3 배열에 9까지 숫자 랜덤하게 넣기
public class MultiArray04 {
	public static void main(String[] args) {
		int[][] arr01 = new int[3][3];

		for (int i = 0; i < arr01.length; i++) {
			for (int j = 0; j < arr01[i].length; j++) {
				arr01[i][j] = (int) (Math.random() * 9) + 1;
				
			}

		}
		for (int[] is : arr01) {
			for (int i : is) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
