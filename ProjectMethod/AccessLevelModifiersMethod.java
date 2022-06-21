
public class AccessLevelModifiersMethod {

	public static void main(String[] args) {
		Greeting.hello(); //private method는 다른 클래스, 패키지에서 사용할 수 없다.
		
	}
	
}

class Greeting{ 
	static void hello() { //public, protected, dafault, private 접근 제어자
		System.out.println("hello world!");
	}
}
