package koreait.day03;

import java.util.Scanner;

public class C08_KeyInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int width; //사각형의 가로
		int height; //사각형의 세로
		
		System.out.println("[사각형 도형의 넓이 구하기]");
		System.out.println("사각형의 가로 길이 입력");
		width = sc.nextInt();
		System.out.println("사각형의 세로 길이 입력");
		height = sc.nextInt();
		int boxArea = width * height; //사각형의 넓이
		
		System.out.println("가로: " + width + "cm");
		System.out.println("세로: " + height + "cm");
		System.out.println("사각형 넓이: " + boxArea + "㎠\n");
		
		double radius; //원의 반지름
		double pi = 3.14; //원주율
		
		System.out.println("[원 도형의 넓이와 둘레 구하기]");
		System.out.println("원의 반지름 입력");
		radius = sc.nextDouble();
		
		double c = 2 * pi * radius; //원의 둘레
		double circleArea = pi * radius * radius; //원의 넓이
		
		System.out.println("[원 도형의 넓이와 둘레 구하기]");
		System.out.printf("반지름: %.2fcm\n", radius);
		System.out.printf("둘레를 구했습니다. -> %.3fcm\n", c);
		System.out.printf("넓이를 구했습니다. -> %.3f㎠\n", circleArea);
		
		sc.close();
	}

}
