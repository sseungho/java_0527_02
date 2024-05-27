package com.jollypet.exer;

import java.util.ArrayList;
import java.util.List;

public class ListCollection_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list01 = new ArrayList<String>();	// array list 선언
		// -----> list01 = []
		
		list01.add("FunkyTrunk");	// list 에 원소(객체) 추가 
		list01.add("Nabaiji");
		list01.add("Mizuno");

		int listSize = list01.size(); // list의 크기 -> 원소의 개수
		
		String brandName = list01.get(1); // index 1 "Nabaiji" 가져오기
//		System.out.println(brandName);
		
		for(int i= 0 ;i<listSize;i++) {
			System.out.println(list01.get(i));
		}
		list01.remove(2); // 인데스2 "Mizuno" 삭제
		System.out.println(list01);
		
		list01.remove("Nabaiji"); // 인데스1 "Nabaiji" 삭제
		System.out.println(list01);
	}

}
