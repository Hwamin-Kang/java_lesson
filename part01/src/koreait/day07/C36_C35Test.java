package koreait.day07;

public class C36_C35Test {
//C35클래스를 1.객체로 만들어서 테스트, 2. static인 것들 테스트
//main 메소드를 갖는 클래스를 객체로 만들지 않는 것이 일반적.
	public static void main(String[] args) {
		
		//test1, test2는 참조형 변수
		C35_GlobalVar test1 = new C35_GlobalVar(); //C35클래스 타입의 객체를 생성
		C35_GlobalVar test2 = new C35_GlobalVar(); //C35클래스 타입의 객체를 생성
		
		//C35클래스의 static이 아닌 인스턴스 변수에는 객체마다 다른 값을 저장한다. - 객체마다 각각 다른 특성을 나타낸다.
		test1.count = 10;
		test2.count = 20;
		
		test1.message = "hi test1";
		test2.message = "hello test2";
		
		test1.methodA(); //인스턴스 메소드
		test2.methodA(); 
		
		test1.methodC(123); //this.count에서 this는 test1
		test2.methodC(999); //this.count에서 this는 test1
		
		System.out.println("test1.count = " + test1.count);
		System.out.println("test2.count = " + test2.count);
		
		//static 요소 테스트 : static 변수 또는 메소드는 클래스 이름으로 사용(객체로 사용가능하지만 동일한 요소를
		
		C35_GlobalVar.num = 101;
		System.out.println("static num = " + C35_GlobalVar.num);
		System.out.println("static num = " + test1.num); //경고 : static 방법으로 사용해라
		System.out.println("static num = " + test2.num);
		
		//static이 저장되는 메모리 영역(메소드 영역)과 객체가 저장되는 메모리 영역(힙 영역)은 다르다.
		
		//상수 TEST 확인
		System.out.println("TEST = " + C35_GlobalVar.TEST);
//		C35_GlobalVar.TEST = 100; 오류 : final 은 값을 변경하지 못한다.
		
		C35_GlobalVar test3 = new C35_GlobalVar();
		//전역변수의 기본 초기값 - 0, null, 0.0, 참조 타입은 null
		//참고 : 지역변수의 기본 초기값? - 배열일때만 0, 0.0, null, 그리고 나머지는 오류
		System.out.println("test3.count = " + test3.count);
		System.out.println("test3.message = " + test3.message);
		System.out.println("C35_GlobalVar.point = " + C35_GlobalVar.point);
		
	}

}
