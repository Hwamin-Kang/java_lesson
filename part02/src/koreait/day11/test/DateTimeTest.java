package koreait.day11.test;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeTest {

	public static void main(String[] args) {
		//현재시간 : ms, ns(1970년 1월 1일 자정을 기준으로 단위마다 카운트한 값)
		
		//1일, 1년은 각각 몇 ms 일까요? 1초 = 1000ms(1ms = 0.001초)
		//1일 = 24시간 * 60분 * 60초 * 1000 => result 변수에 저장해 보세요
		int result = 24 * 60 * 60 * 1000;
		System.out.println("1일은 " + result + "ms 입니다.");
		//int 범위 벗어나면 overflow 입니다. long 변환 필요.
		System.out.println("1년은 " + result * 365L + "ms입니다.");
		
		DecimalFormat df = new DecimalFormat("###,###,###,###");
		System.out.println("1년은" + df.format(result) + "ms입니다.");
		System.out.println("1년은" + df.format(result*365L) + "ms입니다.");
		
		LocalDate currentDate = LocalDate.now();
		System.out.println("날짜 확인 : " + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("시간확인 : " + currentTime);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println("날짜와 시간 확인 : " + current);
		
		LocalDate mybirth = LocalDate.of(1999, 12, 11);
		System.out.println("내 탄신일 확인 : " + mybirth);
		
		LocalTime mybirth_time = LocalTime.of(18, 10);
		System.out.println("내 탄생 시간 : " + mybirth_time);
		
		//새 버전 클래스는 날짜 사이의 간격 계산 클래스가 있습니다.(내가 태어난지 몇년? 몇달? 몇일?)
		
		Period between = Period.between(mybirth, currentDate);
		System.out.println("내가 태어난지 " + between.getYears() + "년(years)");
		System.out.println("내가 태어난지 " + between.getMonths() + "개월(months)");
		System.out.println("내가 태어난지 " + between.getDays() + "일(days)");
		
		System.out.println("테스트 : " + ChronoUnit.DAYS.between(mybirth, mybirth_time));
		

	}

}
