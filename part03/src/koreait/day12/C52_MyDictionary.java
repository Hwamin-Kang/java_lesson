package koreait.day12;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class C52_MyDictionary {

	public static void main(String[] args) {
		
		//클래스와 리스트로 바꿔서 시험문제를 냈다.
		//파일로 데이터 저장
//		HashMap<String, String> voca = new HashMap<>();
		TreeMap<String, String> voca = new TreeMap<>();
		Scanner sc = new Scanner(System.in);
		String choice;
		String english, korean, search, res;
		boolean run = true;
		
		System.out.printf("선택 : 1.단어저장   2.단어검색   3.단어장보기   4.끝내기\n");
		
		while(run) {
			System.out.print("선택 : ");
			choice = sc.nextLine();
			switch(choice){
			case "1":
				System.out.print("English : ");
				english = sc.nextLine();
				System.out.print("Korean : ");
				korean = sc.nextLine();
				voca.put(english, korean);
				break;
			case "2":
				System.out.print("검색단어 : ");
				search = sc.nextLine();
				res = voca.get(search);
				System.out.printf("검색했습니다. 결과 : %s\n", res);
				break;
			case "3":
				System.out.println(voca);
				break;
			case "4":
				run = false;
				break;
			default:
				System.out.println("잘못된 입력값입니다. 다시 입력하세요.");
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
