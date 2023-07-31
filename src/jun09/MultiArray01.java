package jun09;

// 2차원 배열
/*
 * 배열 속에 배열이 있다.
 */
public class MultiArray01 {
	public static void main(String[] args) {
		int[] arr01 = new int[5];
		int[][] arr02 = new int[5][5];

		// 입력
		arr01[0] = 100;
		arr02[0][0] = 100;// [집][방번호]
		arr02[4][4] = 1000;
		arr02[2][4] = 55;
		
		for (int i = 0; i < arr02.length; i++) {
			for (int j = 0; j < arr02.length; j++) {
				System.out.print(arr02[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("----------------");
		int[][] arr03 = new int[2][3];
		for (int i = 0; i < arr03.length; i++) {
			for (int j = 0; j < arr03[i].length; j++) {
				System.out.print(arr03[i][j] + " ");
			}
			System.out.println();
		}
		
		int[] temp = arr03[0];
		System.out.println(temp.length);
		
		int[][] arr04 = new int[3][2];
		for (int i = 0; i < arr04.length; i++) {
			for (int j = 0; j < arr04[i].length; j++) {
				System.out.print(arr04[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}
