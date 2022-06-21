package koreait.day06;

import java.util.Random;

public class C31_RandomEx {

	public static void main(String[] args) {
		
		Random r = new Random();
		int[] counts = new int[5];
		int[] koreans = new int[100];
		
		for(int i = 0; i < koreans.length; i++) {
			koreans[i] = r.nextInt(101);
		}//국어 점수 저장
		
		//점수 분포 count하기
		for(int i = 0; i < koreans.length; i++) {
			if(koreans[i] >= 90) {
				counts[0]++;
			}
			else if(koreans[i] >= 80) {
				counts[1]++;
			}
			else if(koreans[i] >= 70) {
				counts[2]++;
			}
			else if(koreans[i] >= 60) {
				counts[3]++;
			}
			else {
				counts[4]++;
			}
		}
		
		//점수 분포 결과 출력하기
		System.out.println("90~100\t80~89\t70~79\t60~69\t60미만");
		System.out.println("----------------------------------------------");
		for(int i = 0; i < counts.length; i++) {
			System.out.printf("%2d\t", counts[i]);
		}
		System.out.println();
		for(int i = 0; i < counts.length; i++) {
			System.out.printf("%.1f%%\t", (double)counts[i] / koreans.length * 100);
		}

	}
/*
 * 학생 성적 분포 보고서(국어)
 * 학생 인원은 100명 - 점수는 랜덤값으로 테스트(0 <= 난수 <=100) 카운트 변수가 5개 필요(cntA, cntB, cntC, cntD, cndE)
 * 90 ~ 100: 0명(0.0%) 소수점 한자리 counts[0]                      ㄴcounts[5] : counts[0], count[1], count[2] ....
 * 80 ~ 89: 0명(0.0%) 소수점 한자리 counts[1]
 * 70 ~ 79: 0명(0.0%) 소수점 한자리 counts[2]
 * 60 ~ 69: 0명(0.0%) 소수점 한자리 counts[3]
 * 60점 미만: 0명(0.0%) 소수점 한자리counts[4] 
 * 
 */
}
//배열에서 기능이 향상(데이터삭제, 추가, 크기도 동적으로 변경)된 것이 자바 ArrayList
//배열에서는 직접 데이터 삽입/삭제를 구현합니다. -> 메소드 정의
