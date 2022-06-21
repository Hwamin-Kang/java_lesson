package koreait.test;
//�ۼ��� ��ȭ��
public class ProductTest{

	public static void main(String[] args) {
		
		Product[] cart = new Product[10];
		
		cart[0] = new Bike(123000, "MTB", 25);
		cart[1] = new Electronics(35000, "USB");
		cart[3] = new Bike(99000, "��õ��", 15);
		cart[5] = new Electronics(117000, "ipad");
		cart[7] = new Electronics(2250000, "lg �����");
		
		((Electronics) cart[7]).setKwh(0.9);
		System.out.printf("%s�� 1�� ���¼Ҹ� : ", cart[7].prdName);
		System.out.println(((Electronics) cart[7]).power() + "kwh");
		
		for(Product temp : cart) //for each ��
			if(temp != null && temp.price >= 100000) {
				if(temp instanceof Bike) {
					System.out.println(temp);
					System.out.println(((Bike) temp).ride());
				}
				else {
					System.out.println(temp);
				}
			}
	}

}

class Electronics extends Product{

	private double kwh;
	
	public Electronics() { //����Ʈ������
		
	}
	
	public Electronics(int price, String prdName) {
		this.price = price;
		this.prdName = prdName;
	}
	
	public double power() { //1�� ���¼Ҹ�, getPower
		return this.kwh * 24;
	}
	
	@Override //�޼ҵ� ������
	public String sell(Object obj) {
		return String.format("���� ��ǰ - %s(1set)", obj);
	}
	
	public double getKwh() {
		return kwh;
	}
	
	public void setKwh(double kwh) {
		this.kwh = kwh;
	}

	@Override
	public String toString() {
		return "Electronics [kwh=" + kwh + ", price=" + price + ", prdName=" + prdName + "]";
	}
	
}
