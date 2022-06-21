package koreait.testAns;

public class ProductTest {

	public static void main(String[] args) {
		//h
		Product[] cart = new Product[5];
		cart[0] = new Bike(123000, "MTB", 25);
		cart[3] = new Bike(99000, "삼천리", 15);
		
		//i
		for(Product temp : cart) //for each 문
			if(temp!=null && temp.price >= 100000)
				System.out.println(temp);
		
		//자식 객체 타입 검사 : instanceOf, 다운캐스팅
		//메소드 정의 : 리턴값 형식
		
	}

}


