package koreait.day09;

public class C44_ForEachTest {

	public static void main(String[] args) {
		//�迭�� for������ ������ �� index ������ ����Ѵ�. �ڵ��� �� ȿ������ ���̱� ���� ���� for(for each)
		int[] itest = {1, 2, 3, 4, 5, 6};
		String[] stest = {"break", "public", "each", "package", "while"};
		
		for(int i = 0; i < itest.length; i++) {
			System.out.printf("i = %d, itest[%d] = %d\n", i, i, itest[i]);
		}//���⼭ itest[i]�� int Ÿ��
		
		System.out.println("-------------------------------");
		
		//temp ���� ���
		for(int i = 0; i < itest.length; i++) {
			int temp = itest[i];
			System.out.printf("i = %d, itest[%d] = %d\n", i, i, temp);
		}
		
		System.out.println("-------------------------------");
		
		for(int i = 0; i < stest.length; i++) {
			System.out.printf("i = %d, stest[%d] = %s\n", i, i, stest[i]);
		}//���⼭ stest[i]�� String Ÿ��
		
		System.out.println("-------------------------------");
		
		//ȿ������ ���̱� ���� for each ���
		System.out.println("itest �迭��"); //�� itest[i]�� ����� ��
		for(int temp : itest) //�迭�� ����� ���� ������� ������ temp ������ ����
			System.out.println(temp);
		
		System.out.println("-------------------------------");
		
		System.out.println("\nstest �迭��");
		for(String temp : stest)
			System.out.println(temp);

	}

}
