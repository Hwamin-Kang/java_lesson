
public class StaticMethod {

	public static void main(String[] args) {
		
//		Print.a("-") //Ŭ������ �޼ҵ带 ���ڸ� �༭ ȣ��
//		Print.b("-");//Ŭ������ �޼ҵ带 ���ڸ� �༭ ȣ��
		
		//instance
		Print t1 = new Print(); //Print Ŭ������ �ν��Ͻ� t1 ����
		t1.delimiter = "-"; //instance t1�� delimiter �ʵ� ���� "-"�� ���� 
		t1.a(); 
		t1.b();
		//...
//		Print.a("*");
//		Print.b("*");
		Print t2 = new Print();
		t2.delimiter = "*";
		t2.a();
		t2.b();
		
		Print.c("-");
		
	}
	
}

class Print {
	public String delimiter; //Print method�� field(��������)
	
	public void a() { //non-static method, instance�� �޼ҵ�� ���
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
		
	}
	
	public void b() { //non-static method, instance�� �޼ҵ�� ���
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
	}
	
	public static void c(String delimiter) { //static method, Class�� �޼ҵ�� ���
		System.out.println(delimiter);
		System.out.println("c");
		System.out.println("c");
	}
	
	//....
}
