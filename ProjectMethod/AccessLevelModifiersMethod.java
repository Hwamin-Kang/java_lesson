
public class AccessLevelModifiersMethod {

	public static void main(String[] args) {
		Greeting.hello(); //private method�� �ٸ� Ŭ����, ��Ű������ ����� �� ����.
		
	}
	
}

class Greeting{ 
	static void hello() { //public, protected, dafault, private ���� ������
		System.out.println("hello world!");
	}
}
