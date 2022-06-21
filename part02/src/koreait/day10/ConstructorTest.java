package koreait.day10;

public class ConstructorTest {

	public static void main(String[] args) {
		
		

	}

}

class Product{
	int price;
	
	//디폴트 생성자는 동작을 안한다.
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int price) {
		this.price = price;
	}
}

class Food extends Product{ //Product() 디폴트 생성자 실행하므로 없으면 오류 -> food 디폴트 생성자 실행
	
	public Food(int price) {
		super(price);
	}
}

class Electronics extends Product{
	
	public Electronics(int price) {
		super(price);
	}
}
