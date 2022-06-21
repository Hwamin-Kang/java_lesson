package koreait.day06;

import java.util.Scanner;

public class C34_StringArray {

	public static void main(String[] args) {
		
		String message = "hi java!"; //message는 참조형 변수
		
		String[] engKey = {"continue", "break", "public", "static", "dynamic"};
		
		//int, double, char 배열에서는 요소를 나타내는 nums[2], carr1[2], point[2] (기본형 데이터 타입)
		//engKey 뿐만 아니라 engKey[2] 배열요소도 String 참조형 타입
		
		for(int i = 0; i < engKey.length; i++)
			System.out.println(engKey[i]);
		
		String[] koreans = new String[5]; //배열요소의 값이 기본형데이터를 저장하지 않고, 참조값을 저장한다.
		for(int i = 0; i < koreans.length; i++) {
			System.out.println(koreans[i]); //기본초기값은 null, 아무것도 참조하지 않은 상태
		}
		
		System.out.println("1. engKey 배열요소값이 참조하는 문자열의 길이");
		for(int i = 0; i < engKey.length; i++)
			System.out.println(engKey[i] + ":" + engKey[i].length());
		
		koreans[0] = "계속하다";
		koreans[1] = "멈추다";
		koreans[2] = "공용의";
		
		System.out.println("1. koreans 배열요소값이 참조하는 문자열의 길이");
		for(int i = 0; i < koreans.length; i++) {
			if(koreans[i] != null)
				System.out.println(koreans[i] + ":" + koreans[i].length());
		}
		//참조하고 있는 객체가 없을 떄 메소드/필드 참조하면 오류
		
		Scanner sc = new Scanner(System.in);
		System.out.println("static 뜻? >>> ");
		koreans[3] = sc.nextLine();
		System.out.println("dynamic 뜻? >>> ");
		koreans[4] = sc.nextLine();
		
		for(int i = 0; i < koreans.length; i++) {
			System.out.println(koreans[i]);
		}
		
		//사용자가 입력한 영어단어가 engKey배열 인덱스 몇번인지?
		System.out.print("찾을 단어는 >>> ");
		String find = sc.nextLine();
		int index = -1;
		for(int i = 0; i < engKey.length; i++) {
			if(find.equals(engKey[i])) { //문자열 같은지 확인하는 메소드
				index = i;
				break;
			}
		}
		System.out.println("찾은 단어 위치 : " + index);
		
		if(index == -1) System.out.println("찾는 단어가 engKey에 없습니다.");
		else System.out.println("찾은 단어 : " + engKey[index]);

	}

}
