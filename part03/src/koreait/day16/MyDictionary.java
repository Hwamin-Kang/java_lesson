package koreait.day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MyDictionary {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Word> myword = new ArrayList<>(); //객체의 data type(자료형)은 Word
		String sel, eng, kor;
		int level;
		boolean run = true;
		
		System.out.println("선택기능 : 1.단어저장   2.단어검색   3.전체보기   4.Level 검색   5.프로그램 끝내기");
		while (run) {
			System.out.print("선택(번호입력) : ");
			sel = sc.nextLine();
			switch (sel) {
			case "1":
				System.out.print("English : ");
				eng = sc.nextLine();
				System.out.print("Korean : ");
				kor = sc.nextLine();
				System.out.print("Level(1 ~ 3) : ");
				level = Integer.parseInt(sc.nextLine());
				Word temp = new Word(eng, kor, level); //Word의 생성자는 세개의 인자를 받아 대입.
				myword.add(temp); //ArrayList myword에 temp 대입
				break;
			case "2":
				System.out.print("English : ");
				eng = sc.nextLine();
				for(Word w : myword) //ArrayList myword를 전부 검색
					if(w.getEnglish().equals(eng))
						System.out.println("검색완료, 결과 : " + w);
//					for(int i= 0;i<myword.size();i++){
//						if(myword.get(i).getEngilsh().equals(eng)){
//							System.out.println("검색결과 : " + myword.get(i));
//						}
//					}
				break;
			case "3":
//				System.out.println("단어장 전체보기 :" + myword);
				all(myword);	//all 메소드, 정렬하고 출력하기
				break;
			case "4":
				System.out.println("검색할 레벨입력(1~3) : ");
				int no = Integer.parseInt(sc.nextLine());
				level(myword, no); //level 메소드, myword 리스트의 입력된 레벨의 단어를 찾아서 출력
				break;
			case "5":
				run = false; //while문 빠져나가기 위해 false 대입
				break;
			default:
				System.out.println("‍잘못된 입력입니다. 1~5 중 선택하십시오.");
				break;
			}
		} // while end
		System.out.println(":::: 단어장 종료 ::::");
	}

	private static void level(ArrayList<Word> myword, int no) { //ArrayList와 level을 인자로 입력받아 입력한 레벨의 단어 출력
		for(Word w : myword)
			if(w.getLevel() == no)
				System.out.println(w);
//			for(int i =0; i<myword.size();i++)
//				if(myword.get(i).getLevel() == no)
//					System.out.println(myword.get(i));
	}

	private static void all(List<Word> myword) {	//사전식으로 정렬한 뒤 입력한 모든 단어 출력, myword 의 참조값 전달받아 동일한 객체를 가리킨다.
		myword.sort(new Comparator<Word>() {
			public int compare(Word o1, Word o2) {
				return o1.getEnglish().compareTo(o2.getEnglish());
			}
		});
	System.out.println(String.format("%-20s %-20s %10s" , "English", "Korean", "Level"));
		for(Word w : myword) {
			System.out.println(String.format("%-20s %-20s %10d" , w.getEnglish(),w.getKorean(),w.getLevel()));
		}
	}
		
		
} // 참고 : 정수 데이터 입력을 받아야한다면 문자열 nextLine() 받아서 정수로 변환합니다.
// int score = Integer.parseInt(sc.nextLine());
// 이유: nextInt()는 엔터를 처리 하지 않아서 다음에 나오는 nextLine()에게 전달되어 입력 흐름에 방해가 됩니다.
// 결론 : 한 소스 파일에서 nextInt() 만 사용 또는 nextLine()만 사용하거나 합니다.
