package koreait.day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class C60_CharSequence {

	public static void main(String[] args) {
		
		String result = new String();
		System.out.println("result : " + result); //result = "test"; result = new String("test");
		System.out.println("1. String Ÿ�� �׽�Ʈ");
		for(int i = 2; i < 6; i++) {
			//���ڿ� ������ �ٲ�� ���ڿ� ��ü�� ���� �����ǰ� ��ġ�� �޶�����.
			result += i + "/"; //result = result + (i + "/");
			System.out.println("result : " + result);
		}
		
		StringBuffer sb = new StringBuffer(); //StringBuilder�� �Բ� ���� ���Ǵ� Ŭ����
		System.out.println("2. StringBuffer Ÿ�� �׽�Ʈ");
		for(int i = 0; i < 6; i++) {
			//StringBuffer ��ü�� ���ڿ� ������ �ٲ� ���� ��ü�� �߰��Ǵ� ������ �Ѵ�.
			//�ݺ��Ǵ� ���� ������ ���� ��� StringBuffer�� �� ȿ�����̴�.
			sb.append(i).append(":"); //���ڿ� ���� ���� + �� ���� ����
			System.out.println("sb : " + sb);
		}
		
		//CharSequence �������̽� ��� : contains �޼ҵ��� �Ű����� Ÿ��
		//boolean java.lang.String.contains(CharSequence s)
		String sample = "abc2/3/4/5/xyz";
		System.out.println("3. contains �޼ҵ� Ȯ��");
		System.out.println(sample.contains(result));
		System.out.println(sample.contains(sb));
		
		//�޼ҵ��� ���� �Ǵ� �ٸ� ���� ���ĵ��� Ȯ���� �� : 1)Ŭ���� or �������̽� 2)�������̽��� �� ����ü�� �����ΰ�?
		//���� : ArrayList ������ �� ���� ���� List �������̽� Ÿ������ �սô�.
		//		HashMap
		List<String> names = new ArrayList<>();
		names = new Vector<String>();
		
		Map<String, Integer> map = new HashMap<>(); //��ü ������ ���ʸ�Ÿ�� ���� ����.
		map = new TreeMap<String, Integer>();

	}

}
