package koreait.ext;

public class BinaryOp {

	public static void main(String[] args) {
		
		//2진수의 비트 연산 : &, |, ^, ~, >>, << 등등 간단히 테스트
		int data = 0b0101110100100110;
		
		System.out.println("1. ~(비트 반전) 연산 결과");
		System.out.println(String.format("%32s", Integer.toBinaryString(data)));
		System.out.println(String.format("%32s", Integer.toBinaryString(~data)));
		
		System.out.println("\n2. >>은 오른쪽 쉬프트 연산, 오른쪽 정수값은 쉬프트 동작 횟수");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>1), data>>1));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>2), data>>2));
		
		System.out.println("\n3. <<은 왼쪽 쉬프트 연산, 오른쪽 정수값은 쉬프트 동작 횟수");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data<<1), data<<1));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data<<2), data<<2));
		
		data = -2345;
		System.out.println("\n4. 음수값 >> 은 오른쪽 쉬프트 연산, 왼쪽에 추가되는 비트는 무엇일까?");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>1), data>>1));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>2), data>>2));
		//정수 32비트의 맨왼쪽 비트는 부호를 표시한다. 오른쪽 쉬프트연산에서 왼쪽에 추가되는 비트는 부호비트와 같다.
		//참고 : 오른쪽 쉬프트 할 때 부호와 상관없이 왼쪽에 추가되는 비트를 0으로 해야될때는 >>> 연산으로 한다.
		
		System.out.println("\n5. >>>은 오른쪽 쉬프트 연산");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>>2), data>>>2));
		
		int n = 0xffffffff; //32비트가 모두 1이다.
		data = 100;
		System.out.println("\n6. &는 bit and 연산");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data & n), data & n));
		
		System.out.println("\n7. |는 bit or 연산");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data | n), data | n));
		n = 0;
		
		System.out.println("\n8. &는 bit and 연산");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data & n), data & n));
		
		System.out.println("\n9. |는 bit or 연산");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data | n), data | n));
		

	}

}
