package koreait.day13a;

import java.util.Comparator;
import koreait.day12.Member;

//Member ��ü�� sort : �񱳰����� ������ �ʵ� �� �ϳ��� �����ؼ� ����(Comparator) ����ü �����.
public class MemberNameAscending implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
		//name �ʵ� ��
		return o1.getName().compareTo(o2.getName()); //�������� : age1 < age2�� �� -1�� ��ȯ.
	}
	

}