package koreait.day05;

import java.util.Arrays;

public class C27_IntArray {

	public static void main(String[] args) {
		
		int[] arr1 = {67, 45, 98, 12, 45, 66, 95}; //초기값 설정하여 배열 선언
		int[] arr2 = new int[7]; //배열의 크기만 설정
		
		System.out.println("\n배열이름(참조형변수)으로 출력");
		System.out.println(arr1); //16진수. 참조값과 연관있는 해쉬코드값
		System.out.println(arr1.hashCode()); //10진수
		
		System.out.println("배열 요소값 1개 출력(인덱스3번)");
		System.out.println("arr1[3] = " + arr1[3]);
		System.out.println("arr2[3] = " + arr2[3]);
		
		System.out.println("\n배열 요소값 1개 저장(인덱스3번)");
		arr1[3] = 999;
		arr2[3] = 999;
		
		//선언된 배열의 값을 모두 출력할 수 있는 문자열로 변환시키는 메소드
		String temp = Arrays.toString(arr1); //toString은 static 메소드
		System.out.println("arr1: " + temp);
		System.out.println("arr2: " + Arrays.toString(arr2));
		
		System.out.println("\nfor문으로 배열요소 값 출력(arr1)");
		for(int i = 0; i < 7; i++) {
			System.out.println("arr1[" + i + "] = " + arr1[i]);
		}
		
		System.out.println("\nfor문으로 배열요소 값 출력(arr2)");
		for(int i = 0; i < arr2.length; i++) { //배열은 배열요소의 갯수(크기)를 갖고 있는 필드 length가 있다.
			String t = String.format("arr2[%d] = %d", i, arr2[i]); //format을 적용해서 문자열을 생성
			System.out.println(t);
			//System.out.printf("arr2[%d] = %d\n", i, arr2[i]);
		}
		
		System.out.println("\n배열의 크기(바이트)");
		System.out.println("arr1 배열: " + arr1.length*Integer.BYTES + "바이트");
		System.out.println("arr1 배열: " + arr1.length*Integer.BYTES + "바이트");
		
		System.out.println("\n내가 만든 메소드로 배열값 출력");
		
		arrayPrint(arr1, "arr1");
		arrayPrint(arr2, "arr2");
		//메소드의 매개변수는 참조형 변수(참조값 전달, 같은 메모리 위치를 가리키게 된다)
	}
	
	public static void arrayPrint(int[] array, String name) { //인자: int배열, String (2개)
		//int 배열을 인자로 전달받아서 arr1[0] = 67 형식으로 값을 출력
		for(int i = 0; i < array.length; i++) { //배열은 배열요소의 갯수(크기)를 갖고 있는 필드 length가 있다.
			String t = String.format("%s[%d] = %d", name, i, array[i]); //format을 적용해서 문자열을 생성
			System.out.println(t);
			//System.out.printf("arr2[%d] = %d\n", i, arr2[i]);
		}
		System.out.println();
	}

}
