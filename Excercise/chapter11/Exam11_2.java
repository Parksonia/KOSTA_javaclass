package chapter11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Exam11_2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // 저장 순서대로 들어감
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		HashSet set = new HashSet(list); // 중복이 제거됨
		TreeSet tset = new TreeSet(set); // 정렬됨(오름차순)
		Stack stack = new Stack(); 
		stack.addAll(tset);
		while (!stack.empty())
			System.out.println(stack.pop()); // stack 구조기때문에 마지막부터 나옴(LIFO)
	}

}
