package koreait.day01;

public class C02_TwicePrint {
	public static void main(String[] args) {
		System.out.println("트와이스");
		System.out.println("이름\t생년월일\t\t나이");
		System.out.println("-------------------------------");
		System.out.println("사나\t1996.12.29\t27");
		System.out.println("지효\t1997.02.01\t26");
		System.out.println("미나\t1998.03.24\t25");
		System.out.printf("%-8s%4d.%02d.%02d\t%d\n", "dahyeon", 1998, 05, 28, 25);
		System.out.printf("%-8s%4d.%02d.%02d\t%d\n", "momo", 1999, 04, 23, 24);
		System.out.printf("%-8s%4d.%02d.%02d\t%d\n", "nana", 1997, 06, 14, 27);
	}
}
