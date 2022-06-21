package koreait.day11.test;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeTest {

	public static void main(String[] args) {
		//����ð� : ms, ns(1970�� 1�� 1�� ������ �������� �������� ī��Ʈ�� ��)
		
		//1��, 1���� ���� �� ms �ϱ��? 1�� = 1000ms(1ms = 0.001��)
		//1�� = 24�ð� * 60�� * 60�� * 1000 => result ������ ������ ������
		int result = 24 * 60 * 60 * 1000;
		System.out.println("1���� " + result + "ms �Դϴ�.");
		//int ���� ����� overflow �Դϴ�. long ��ȯ �ʿ�.
		System.out.println("1���� " + result * 365L + "ms�Դϴ�.");
		
		DecimalFormat df = new DecimalFormat("###,###,###,###");
		System.out.println("1����" + df.format(result) + "ms�Դϴ�.");
		System.out.println("1����" + df.format(result*365L) + "ms�Դϴ�.");
		
		LocalDate currentDate = LocalDate.now();
		System.out.println("��¥ Ȯ�� : " + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("�ð�Ȯ�� : " + currentTime);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println("��¥�� �ð� Ȯ�� : " + current);
		
		LocalDate mybirth = LocalDate.of(1999, 12, 11);
		System.out.println("�� ź���� Ȯ�� : " + mybirth);
		
		LocalTime mybirth_time = LocalTime.of(18, 10);
		System.out.println("�� ź�� �ð� : " + mybirth_time);
		
		//�� ���� Ŭ������ ��¥ ������ ���� ��� Ŭ������ �ֽ��ϴ�.(���� �¾�� ���? ���? ����?)
		
		Period between = Period.between(mybirth, currentDate);
		System.out.println("���� �¾�� " + between.getYears() + "��(years)");
		System.out.println("���� �¾�� " + between.getMonths() + "����(months)");
		System.out.println("���� �¾�� " + between.getDays() + "��(days)");
		
		System.out.println("�׽�Ʈ : " + ChronoUnit.DAYS.between(mybirth, mybirth_time));
		

	}

}
