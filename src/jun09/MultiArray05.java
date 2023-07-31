package jun09;

//3x3 배열에 9까지 숫자 랜덤하게 넣기
public class MultiArray05 {
	public static void main(String[] args) {
		int[][] arr01 = new int[3][3];

		int r1, r2;
		for (int i = 1; i < 10; i++) {
			r1 = (int) (Math.random() * 3);
			r2 = (int) (Math.random() * 3);
			if (arr01[r1][r2] == 0) {
				arr01[r1][r2] = i;
			} else {
				i--;
			}
		}
		for (int[] is : arr01) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
