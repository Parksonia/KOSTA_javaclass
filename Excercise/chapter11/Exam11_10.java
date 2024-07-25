package chapter11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam11_10 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(); //->하나만 쓰면 동일한 값이 나가게됨
		Set<Integer> hSet = new HashSet<>(); 
		int[][] board = new int[5][5];
		while( hSet.size() < 25) {
			int random = (int) (Math.random() * 30) + 1 ;
			boolean  save = hSet.add(random);
			if(save) arr.add(random);
		}
		Iterator<Integer> it = arr.iterator();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] =  it.next();
				System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
			}
			System.out.println();
		}

	}

}
