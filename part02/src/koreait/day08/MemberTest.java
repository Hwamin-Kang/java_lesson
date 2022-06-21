package koreait.day08;

public class MemberTest {

	public static void main(String[] args) {
		
		Member momo = new Member(); //default constructor
		
		Member nana = new Member("ÃÖ³ª³ª", "nana@gmail.com");
		System.out.println("nana name = " + nana.getName());
		System.out.println("nana email = " + nana.getEmail());
		nana.setAge(26);
		System.out.println("nana age = " + nana.getAge());

	}

}
