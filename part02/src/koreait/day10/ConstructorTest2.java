package koreait.day10;

public class ConstructorTest2 {

	public static void main(String[] args) {
		
		

	}

}

class Product2 {
	int price;
	
	//����Ʈ �����ڴ� ������ ���Ѵ�.
	public Product2() {
	}
	
	public Product2(int price) {
		this.price = price;
	}
}

class Food2 extends Product2{ //Product() ����Ʈ ������ �����ϹǷ� ������ ���� -> food ����Ʈ ������ ����
}

class Electronics2 extends Product2{
	
	public Electronics2(int price) {
		super(price);
	}

}
