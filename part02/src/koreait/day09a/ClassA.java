package koreait.day09a;

/*
 * Ŭ������ ���
 * Ŭ���� ���� �θ�(����Ŭ����, super), �ڽ�(����Ŭ����)���谡 ���������.
 * �θ��� Ŭ���� ������Ҹ� �ڽ��� ����� �� �ִ�. ��ӵǴ� ��Ҵ� �ʵ�(����), �޼ҵ�
 * extends Ű���� ����Ͽ� �θ�Ŭ������ ����
 * private ���������ڴ� ��� �ȵȴ�.
 * protected�� �ٸ� ��Ű���� �ڽ�Ŭ������ ��ӹ��� �� �ְ� �Ѵ�.
 * 
 */
public class ClassA {//parent class
	int ab;
	String name;
	protected String title;
	//protected�� ����Ʈ �����������̳� �ڽ�Ŭ������ ���ܷ� ���.
	
	void print() {
		System.out.println("ab = " + ab);
		System.out.println("name = " + name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
