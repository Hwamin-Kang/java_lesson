
public class InheritanceApp {

	public static void main(String[] args) {
		Cal c = new Cal(2, 1); //Cal 클래스의 커스텀 생성자를 실행시키기 위해 2개의 인자 대입.
		Cal3 c3 = new Cal3(2, 1); //부모 클래스인 Cal 클래스의 생성자를 먼저 실행하고나서 Cal3 클래스의 생성자 실행.
		System.out.println(c3.sum()); //sum()메소드는 부모인 Cal 클래스의 메소드
		System.out.println(c3.minus());
	}

}

class Cal{
	
	int v1, v2;
	
	Cal(int v1, int v2){ //Cal 클래스의 생성자 : 두 정수를 인자로 받아서 인스턴스의 필드값을 초기화.
		System.out.println("Cal init");
		this.v1 = v1; this.v2 = v2;
	}
	public int sum() {
		return this.v1+v2; //메소드 sum은 인스턴스의 두 필드값을 더해서 반환한다.
	}
}

class Cal3 extends Cal{ //class Cal3 는 class Cal을 상속받았다.
	
	Cal3(int v1, int v2){ //Cal3 클래스의 생성자, Cal 클래스에게 상속받았기 때문에 Cal 클래스의 생성자를 실행해야 한다.
		super(v1, v2); //부모클래스의 생성자 실행.
		System.out.println("Cal3 init!!!");
	}
	public int minus() {
		return this.v1-v2;
	}
}