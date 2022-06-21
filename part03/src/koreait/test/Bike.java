package koreait.test;
//작성자 강화민
public class Bike extends Product{//부모클래스 Product의 변수, 메소드를 상속받았다.
	
	private int speed;
	
	public Bike() {//디폴트 생성자
		
	}
	
	public Bike(int price, String prdName, int speed) { //price, prdName, speed를 인자로 받아서 초기화하는 생성자
		this.price = price;
		this.prdName = prdName;
		this.speed = speed;
	}
	
	public String ride() {
		return String.format("당신은 이것을 시속 %dkm로 탈 수 있습니다.", this.speed);
	}

	@Override //메소드 재정의
	public String sell(Object obj) {
		return String.format("추가 할인 행사 - %d%% 인하", obj);
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}

	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + "]";
	}

}
