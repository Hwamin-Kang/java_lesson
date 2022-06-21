package koreait.day12;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class C51_TodayMenu {

	public static void main(String[] args) {
		
		System.out.println("오늘의 저녁메뉴 투표합니다.");
		String foods = "치맥, 떡볶이, 곱창, 불고기, 햄버거, 오징어물회";
		System.out.println("치맥, 떡볶이, 곱창, 불고기, 햄버거, 오징어물회");
		
		Scanner sc = new Scanner(System.in); //메뉴 선택(반복)
		
		//key : 메뉴이름, value : 투표수
		//초기화
		HashMap<String, Integer> map = new HashMap<>();
		map.put("치맥", 0);
		map.put("떡볶이", 0);
		map.put("곱창", 0);
		map.put("불고기", 0);
		map.put("햄버거", 0);
		map.put("오징어물회", 0);
		
		while(true) {
			System.out.print("선택 메뉴 입력하시오.(종료는 end 입력) : ");
			String menu = sc.nextLine();
			if(menu.equals("end")) break;
			//입력받은 menu의 value값을 가져오기, +1 하기, 결과를 저장하기
			if(!map.containsKey(menu)) {
				System.out.println("없는 메뉴입니다. 메뉴에 추가합니다.");
				map.put(menu, 1); foods += "," + menu;
				continue;
			}
			int temp = map.get(menu);
			map.put(menu, ++temp);
		}
		
		System.out.println("투표 종료");
		System.out.println(map);
		System.out.println("최대 득표수 : " + Collections.max(map.values()));
	}

}
