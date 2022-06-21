package koreait.day10;

public class ConstructorTest2 {

	public static void main(String[] args) {
		
		

	}

}

class Product2 {
	int price;
	
	//디폴트 생성자는 동작을 안한다.
	public Product2() {
	}
	
	public Product2(int price) {
		this.price = price;
	}
}

class Food2 extends Product2{ //Product() 디폴트 생성자 실행하므로 없으면 오류 -> food 디폴트 생성자 실행
}

class Electronics2 extends Product2{
	
	public Electronics2(int price) {
		super(price);
	}

}
