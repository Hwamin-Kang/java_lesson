package koreait.day13a;

import java.util.Comparator;
import koreait.day12.Member;

//Member 객체의 sort : 비교가능한 값으로 필드 중 하나를 선택해서 비교자(Comparator) 구현체 만든다.
public class MemberNameAscending implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
		//name 필드 비교
		return o1.getName().compareTo(o2.getName()); //오름차순 : age1 < age2일 때 -1을 반환.
	}
	

}
