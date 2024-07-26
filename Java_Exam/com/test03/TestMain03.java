package com.test03;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//주어진 String 데이터를 “,”로 구분하여 5개의 실수 데이터를 추출하고 합과 평균을 구한다.
//( StringTokenizer 사용 )
//단, String 문자열의 모든 실수 데이터를 List에 저장하고 계산한다. 
public class TestMain03 {

	public static void main(String[] args) {

		String str = "1.22,4.12,5.93,8.71,9.34";
		double sum = 0.0;
		double avg = 0.0;
		//문자열을 Split해서 실수형 데이터를 리스트로 저장
		List<Double> arrList = new ArrayList<>();
		
		//StringTokenizer 이용하여 List에 저장 
		StringTokenizer st = new StringTokenizer(str,",");
		while(st.hasMoreTokens()) {
			arrList.add(Double.valueOf(st.nextToken()));
		}
		System.out.println(arrList);
		
	
		//소수점 4자리에서 반올림하여 소수점 3자리 표현
		for(Double i: arrList) {
			sum += i;
		}
		 avg = sum/arrList.size();
		System.out.println(String.format("%.3f", sum));
		System.out.println(avg);
	}

}

//합계와 평균은 모두 소수점 4자리에서 반올림하여 소수점 3자리까지 표현한다.
//합 계: 29.320
//평 균: 5.864