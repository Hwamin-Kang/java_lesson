package koreait.day05;

public class C22_AssignTest {

	public static void main(String[] args) {
		//증가연산자, 감소연산자, 축약연산자(+=, -=, *=, /=, ...)
		int i = 10, sum = 0;
		i = i + 1;
		i += 1;
		i++; //(후치: postfix)
		++i; //i = 14 (전치: prefix)
		
		System.out.println("i++: " + i++);
		System.out.println("++i: " + (++i)); //i = 16
		
		sum = sum + i;
		sum += i;
		
		System.out.println("sum: " + sum);
		
		i--;
		--i;
		sum = sum - 10; //26
		sum -= 10; 

	}

}
