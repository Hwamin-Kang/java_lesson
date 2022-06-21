
public class StaticMethod {

	public static void main(String[] args) {
		
//		Print.a("-") //클래스의 메소드를 인자를 줘서 호출
//		Print.b("-");//클래스의 메소드를 인자를 줘서 호출
		
		//instance
		Print t1 = new Print(); //Print 클래스의 인스턴스 t1 생성
		t1.delimiter = "-"; //instance t1의 delimiter 필드 값을 "-"로 대입 
		t1.a(); 
		t1.b();
		//...
//		Print.a("*");
//		Print.b("*");
		Print t2 = new Print();
		t2.delimiter = "*";
		t2.a();
		t2.b();
		
		Print.c("-");
		
	}
	
}

class Print {
	public String delimiter; //Print method의 field(전역변수)
	
	public void a() { //non-static method, instance의 메소드로 사용
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
		
	}
	
	public void b() { //non-static method, instance의 메소드로 사용
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
	}
	
	public static void c(String delimiter) { //static method, Class의 메소드로 사용
		System.out.println(delimiter);
		System.out.println("c");
		System.out.println("c");
	}
	
	//....
}
