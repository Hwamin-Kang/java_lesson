package koreait.day13a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import koreait.day12.Member;

public class C55_ListSortTest {
//sort�� ���õ� �������̽� ���
	public static void main(String[] args) {
		
		//List�� �������̽�, ArrayList�� ����ü
		//������ : List�� ����Ÿ������ �Ͽ� �����մϴ�. ������ ��� ���̺귯������ ListŸ������ ���մϴ�.
		List<Integer> ilist = new ArrayList<>();
		List<String> slist = new ArrayList<>();
		
		ilist.add(34);
		ilist.add(77);
		ilist.add(19);
		ilist.add(56);
		ilist.add(45);
		ilist.add(9);
		System.out.println("sort ���� : " + ilist);
		ilist.sort(null); //���ڷ� �ʿ��� ���� ���� Comparator ����ü �ʿ��մϴ�.
							//�⺻��, String�� null�� �� �� �ֽ��ϴ�.(�������� �⺻)
		System.out.println("sort ���� : " + ilist);
		ilist.sort(Comparator.reverseOrder()); //reverse:����(��������), Comparator �������̽��� static �޼ҵ�
		System.out.println("�������� sort : " + ilist);
		System.out.println();
		
		slist.add("Ʈ���̽�");
		slist.add("�����̰�");
		slist.add("�������");
		slist.add("�ҳ�ô�");
		slist.add("�����̾�");
		slist.add("������ũ");
		System.out.println("sort ���� : " + slist);
		slist.sort(null);
		System.out.println("sort ���� : " + slist);
		slist.sort(Comparator.reverseOrder());
		System.out.println("�������� sort : " + slist);
		
		System.out.println();
		
		System.out.println("1.Comparator �������̽� ����ϴ� sort");
		List<Member> mlist = new ArrayList<>();
		
		mlist.add(new Member("momo", 23));
		mlist.add(new Member("nana", 27));
		mlist.add(new Member("nayeon", 25));
		mlist.add(new Member("dahyeon", 29));
		mlist.add(new Member("sooni", 26));
		mlist.add(new Member("jenny", 27));
		
		System.out.println("member ����Ʈ ���� : " + mlist);
//		mlist.sort(null); //���� : Member ��ü�� ���� �� ���� ��ü, ���� �������̽��� ���ڷ� �ؾ��Ѵ�.
		//Member ��ü�� sort : �񱳰����� ������ �ʵ� �� �ϳ��� �����ؼ� ����(Comparator) ����ü �����.
		
		mlist.sort(new MemberNameAscending());
		System.out.println("member sort Ȯ��(ASC) : " + mlist);
		mlist.sort(new MemberNameDescending());
		System.out.println("member sort Ȯ��(DESC) : " + mlist);
		
		System.out.println("\n2.Comparable �������̽� ����ϴ� sort");
		/* ���Ͻ��� �������� ������ ��츦 ���ϴ�. ��ȯ���� �ʴ� ��츦 -1(����)�� ���ϵǰ� �մϴ�.
		 * ���� ��ȯ���� �ʴ� ���� 
		 *�������� : o1 < o2    	//�������� : o1 > o2 
		*/
		List<User> ulist = new ArrayList<User>();
		ulist.add(new User("���", 23));
		ulist.add(new User("����", 27));
		ulist.add(new User("����", 25));
		ulist.add(new User("����", 29));
		ulist.add(new User("����", 26));
		ulist.add(new User("����", 27));
		
		System.out.println("user ����Ʈ ���� : " + ulist);
		ulist.sort(null);
		System.out.println("user sort(ASC) : " + ulist);
		ulist.sort(Comparator.reverseOrder());
		System.out.println("user sort(DESC) : " + ulist);
		
		ulist.sort(new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});//�޼ҵ� ���ڷ� �͸�Ŭ������ �����ؼ� ��ü�� ����

	}

}