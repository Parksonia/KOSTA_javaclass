package chapter11;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class Exam11_6 {

	static int getGroupCount(TreeSet<Student>tset, int from, int to) {
		//subset을 이용하기
		//subSet : 범위 검색(from과 to)의 결과 반환, 끝인 to는 포함되지 않음
		SortedSet sortedSet = tset.subSet(new Student("", 0, 0, from, from, from), new Student("", 0, 0, to, to, to));
		return sortedSet.size();
	}

	public static void main(String[] args) {
		 TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {

				@Override
				//점수를 기준으로 정렬 
				public int compare(Student o1, Student o2) {
					
					return  o1.getTotal()-o2.getTotal();
				}
				 });
	
			 set.add(new Student("홍길동",1,1,100,100,100));
			 set.add(new Student("남궁성",1,2,90,70,80));
			 set.add(new Student("김자바",1,3,80,80,90));
			 set.add(new Student("이자바",1,4,70,90,70));
			 set.add(new Student("안자바",1,5,60,100,80));
			 
			 Iterator it = set.iterator();
			 while(it.hasNext())
			 System.out.println(it.next());
			
			 System.out.println("[60~69] :"+getGroupCount(set,60,70));
			 System.out.println("[70~79] :"+getGroupCount(set,70,80));
			 System.out.println("[80~89] :"+getGroupCount(set,80,90));
			 System.out.println("[90~100] :"+getGroupCount(set,90,101));

	}

}
// 출력
//이자바,1,4,70,90,70,230,76.7
//남궁성,1,2,90,70,80,240,80.0
//김자바,1,3,80,80,90,250,83.3
//홍길동,1,1,100,100,100,300,100.0
//[60~69] :0
//[70~79] :1
//[80~89] :2
//[90~100] :1
