package koreait.day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MyDictionary {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 키보드 입력시 nextLine() 과 nextInt() 등을 같이 쓰면 입력이 정상 실행 안됩니다.
		List<Word> myword = new ArrayList<>(); // **mydic을 myword로 바꿔서 구현해보기**
		String sel, eng, kor;
		int level;
		System.out.println("선택 기능 👉   1. 단어저장     2. 단어검색     3. 전체보기  4. 레벨로 검색   5.프로그램 끝내기");
		boolean run = true;
		while (run) { // while 반복안에 switch 로 종료조건을 동작시킬때 break 로 못합니다.-> 변수 사용했습니다.
			System.out.print("선택 ✏->");
			sel = sc.nextLine();
			switch (sel) {
			case "1": // switch문에서 case "문자열" 형식 가능. if문에서는 sel.equals("1") 로 해야합니다.
				System.out.print("English -> ");
				eng = sc.nextLine(); // sc.nextInt();
				System.out.print("한글 뜻 -> ");
				kor = sc.nextLine();
				System.out.println("레벨 -> ");
				level = Integer.parseInt(sc.nextLine());
				Word temp = new Word(eng,kor);
				temp.setLevel(level);
				myword.add(temp); // 저장
				break;
			case "2":
				System.out.print("검색 단어 English -> ");
				eng = sc.nextLine();
				for(Word w : myword)
					if(w.getEnglish().equals(eng))
						System.out.println("단어장 검색했습니다. 결과 =>" + w);
//					for(int i= 0;i<myword.size();i++)
//						if(myword.get(i).getEngilsh().equals(eng))
//							System.out.println("검색결과 -> " + myword.get(i));
				break;
			case "3":
//					System.out.println("단어장 전체보기 :" + myword);
				all(myword);	// 정렬하고 출력하기
				break;
			
			case "4":
				System.out.println("검색할 레벨입력(1~3) -> ");
				int no = Integer.parseInt(sc.nextLine());
				level(myword,no);
				break;
			case "5":
				run = false;
				break;
			default:
				System.out.println("👁‍🗨잘못 입력된 선택입니다.1~4 입력입니다.");
				break;
			}
		} // while end
		System.out.println("::::  너의 단어장 종료합니다. ::::");
	}

	private static void level(List<Word> myword, int no) {
		
		for(Word w :myword)
			if(w.getLevel() == no)
				System.out.println(w);
//			for(int i =0; i<myword.size();i++)
//				if(myword.get(i).getLevel() == no)
//					System.out.println(myword.get(i));
	}

	private static void all(List<Word> myword) {	//myword 의 참조값 전달받아 동일한 객체를 기리킵니다.
		myword.sort(new Comparator<Word>() {
	
			
			public int compare(Word o1, Word o2) {
				return o1.getEnglish().compareTo(o2.getEnglish());
			}
		});
	System.out.println(String.format("%-20s %-20s\t %10s" , "English","Korean","Level"));
		for(Word w : myword) {
			System.out.println(String.format("%-20s %-20s %10d" , w.getEnglish(),w.getKorean(),w.getLevel()));
		}
	}
		
		
} // 참고 : 정수 데이터 입력을 받아야한다면 문자열 nextLine() 받아서 정수로 변환합니다.
// int score = Integer.parseInt(sc.nextLine());
// 이유: nextInt()는 엔터를 처리 하지 않아서 다음에 나오는 nextLine()에게 전달되어 입력 흐름에 방해가 됩니다.
// 결론 : 한 소스 파일에서 nextInt() 만 사용 또는 nextLine()만 사용하거나 합니다.
