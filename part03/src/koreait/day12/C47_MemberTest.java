package koreait.day12;

import java.util.ArrayList;

public class C47_MemberTest {

	public static void main(String[] args) {
		
		//Member[] members = new Member[10];
		ArrayList<Member> list = new ArrayList<>();
		
		list.add(new Member("모모", 27)); //새로운 객체 생성하고 참조값을 리스트에 추가
		Member member = new Member("다현", 26);
		list.add(member);
		list.add(new Member("나나", 20));
		list.add(new Member("신비", 22));
		System.out.println("현재 list의 요소 개수 : " + list.size());
		System.out.println("1. 전체 리스트 출력");
		System.out.println(list);
		System.out.println("2. list의 요소 중 age 필드값이 25이하인 것만 출력해보기");
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getAge() <= 25) {
				System.out.println("i = " + i + ", " + list.get(i));
			}
		}
		
		System.out.println("3. '나나'는 몇번 인덱스에서 참조하고 있는 객체인가?");
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals("나나")) {
				System.out.println("i = " + i + ", " + list.get(i));
			}
		}
		//리스트 요소가 여러개의 필드를 갖는 객체이면 필드값 비교하는 equals 예제입니다.
		//indexOf는 String, 기본형 래퍼클래스만 추가적인 기능 구현 없사용합니다.
		
		System.out.println("4. 참고");
		
		System.out.println("Member 객체로 indexOf 실행 : " + list.indexOf(new Member("나나", 20)));
		// -1, 못찾음 (이유 : 참조값이 같은 것을 찾는 것인데 이것을 필드값 비교해서 찾도록 바꾸어 주는 기능 구현이 필요하다.
		System.out.println("Member 객체로 indexOf 실행 : " + list.indexOf(member));
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals("나나") && list.get(i).getAge()==20) {
				System.out.println("i = " + i + ", " + list.get(i));
			}
		}

	}

}
