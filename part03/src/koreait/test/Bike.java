package koreait.test;
//�ۼ��� ��ȭ��
public class Bike extends Product{//�θ�Ŭ���� Product�� ����, �޼ҵ带 ��ӹ޾Ҵ�.
	
	private int speed;
	
	public Bike() {//����Ʈ ������
		
	}
	
	public Bike(int price, String prdName, int speed) { //price, prdName, speed�� ���ڷ� �޾Ƽ� �ʱ�ȭ�ϴ� ������
		this.price = price;
		this.prdName = prdName;
		this.speed = speed;
	}
	
	public String ride() {
		return String.format("����� �̰��� �ü� %dkm�� Ż �� �ֽ��ϴ�.", this.speed);
	}

	@Override //�޼ҵ� ������
	public String sell(Object obj) {
		return String.format("�߰� ���� ��� - %d%% ����", obj);
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
