
public class TArrayTest2 {

	public static void main(String[] args) {

		int[][] score = { { 80, 80, 80, 80 }, { 90, 90, 90, 90 }, { 100, 100, 100, 100 } };
		int[][] total = new int[score.length + 1][score[0].length + 1];

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				total[i][j] = score[i][j];
				total[i][total[j].length - 1] = score[i][j];
				total[total.length - 1][j] += score[i][j];
				total[score.length + 1][total[0].length + 1] += total[i][j];
				total[total.length - 1][total[j].length - 1] += score[i][j];

			}

		}

			
		for (int i = 0; i < total.length; i++) {
			for (int j = 0; j < total[i].length; j++) {
				System.out.print(total[i][j]);
			}
			System.out.println();
		}

	}

}
//  80   80  80   80    320   저장할 때 누적하는식으로 접근
//  90   90  90   90    360
// 100  100  100  100   400
// 270  270  270  270  1080