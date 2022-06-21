package koreait.day02;

public class C08_Test {

	public static void main(String[] args) {
		int width = 23; //사각형의 가로
		int height = 19; //사각형의 세로
		int boxArea = width * height; //사각형의 넓이
		
		System.out.println("[사각형 도형의 넓이 구하기]");
		System.out.println("가로: " + width + "cm");
		System.out.println("세로: " + height + "cm");
		System.out.println("넓이를 구했습니다. -> " + boxArea + "㎠\n");
		
		double radius = 23.230; //원의 반지름
		double pi = 3.14; //원주율
		double c = 2 * pi * radius; //원의 둘레
		double circleArea = pi * radius * radius; //원의 넓이
		
		System.out.println("[원 도형의 넓이와 둘레 구하기]");
		System.out.printf("반지름: %.2fcm\n", radius);
		System.out.printf("둘레를 구했습니다. -> %.3fcm\n", c);
		System.out.printf("넓이를 구했습니다. -> %.3f㎠\n", circleArea);
		
		//finalTest
		final int test = 123;
		System.out.println("test = " + test);
	}

}
