package koreait.test2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MyPhoneNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Person> mypn = new ArrayList<>();
		
		String name, mobile, sel;
		int group;
		boolean run = true;
		
		System.out.println("선택 기능 : [n]새연락처 저장   [s]연락처 찾기   [g]그룹 선택 보기   [a]전체보기   [e]프로그램 끝내기");
		while(run) {
			System.out.print("선택 : ");
			sel = sc.nextLine();
			switch(sel){
			case "n":
				System.out.print("이름 입력 : ");
				name = sc.nextLine();
				System.out.print("번호 입력 : ");
				mobile = sc.nextLine();
				System.out.print("그룹 입력(1. 친구, 2. 가족, 3. 비즈니스) : ");
				group = Integer.parseInt(sc.nextLine());
				Person ps = new Person(name, mobile, group);
				mypn.add(ps);
				break;
			case "s":
				System.out.print("이름 입력 : ");
				name = sc.nextLine();
				for(Person p : mypn) {
					if(p.getName().equals(name)) {
						System.out.println(p);
					}
				}
				break;
			case "g":
				System.out.print("그룹선택(1. 친구, 2. 가족, 3. 비즈니스) : ");
				group = Integer.parseInt(sc.nextLine());
				group(mypn, group); //List와 int group을 인자로 받아 해당그룹만 출력하는 메소드
				break;
			case "a":
				System.out.println("연락처 전체 목록");
				all(mypn);
				break;
			case "e":
				System.out.println("::::::: 주소록 종료 :::::::");
				run = false;
				break;
			default:
				System.out.println("잘못된 입력입니다. 메뉴에 맞는 알파벳을 입력하십시오.");
				break;
			}
		}

	}

	private static void all(ArrayList<Person> mypn) {
		mypn.sort(new Comparator<Person>() {
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::");
		for(Person p : mypn) {
			System.out.println(String.format("%-20s %-20s" , p.getName(),p.getMobile()));
		}
		
	}

	private static void group(ArrayList<Person> mypn, int group) {
		for(Person p : mypn) {
			if(p.getGroup() == group) {
				System.out.println(p);
			}
		}
		
	}
	
}
