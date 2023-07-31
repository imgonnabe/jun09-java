package jun09;

//배열로 N자 만들기
import java.util.Scanner;

public class MultiArray03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수를 입력하세요: ");
		int num = sc.nextInt();
		char[][] arr01 = new char[num][num];
		for (int i = 0; i < arr01.length; i++) {
			for (int j = 0; j < arr01[i].length; j++) {
				if (j == 0 || j == arr01[i].length - 1 || i == j) {
					arr01[i][j] = 'N';
				} else {
					arr01[i][j] = 0;
				}
				System.out.print(arr01[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
