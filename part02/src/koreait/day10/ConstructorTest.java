package koreait.day10;

public class ConstructorTest {

	public static void main(String[] args) {
		
		

	}

}

class Product{
	int price;
	
	//����Ʈ �����ڴ� ������ ���Ѵ�.
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int price) {
		this.price = price;
	}
}

class Food extends Product{ //Product() ����Ʈ ������ �����ϹǷ� ������ ���� -> food ����Ʈ ������ ����
	
	public Food(int price) {
		super(price);
	}
}

class Electronics extends Product{
	
	public Electronics(int price) {
		super(price);
	}
}
