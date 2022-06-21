class Cal{
	int v1, v2; // 2, 1
	Cal(int v1, int v2){ //커스텀 생성자
		this.v1 = v1; this.v2 = v2;
	}
}

class Cal3 extends Cal{

	Cal3(int v1, int v2) { //Cal3 클래스의 생성자
		super(v1, v2); //부모 클래스의 생성자를 먼저 실행시킨다
		// TODO Auto-generated constructor stub
	}
	
}

public class InheritanceApp {

	public static void main(String[] args) {
		Cal c = new Cal(2, 1);
		
		Cal3 c3 = new Cal3(3, 4);

	}

}
