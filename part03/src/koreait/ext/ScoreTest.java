package koreait.ext;

public class ScoreTest {
	//빌더 패턴 : 필드 초기값을 다양하게 주고 싶을 때 사용하는 패턴
	//필드가 많아지면 커스텀 생성자가 많아지는 문제점이 있기 때문이다.
	//패턴 : 개발자들이 자주 사용하는 기능을 구현한 형식
	
	Score momo = Score.builder().eng(99).build();
	Score nana = Score.builder().kor(88).build();
	Score sinbi = Score.builder().eng(77).science(100).build();
	
	Person p1 = Person.builder()
			.age(34)
			.name("모모")
			.build();
	
	Score s = new Score("모모", 99, 77, 76);
	Score momo2 = new Score(null, 99, 0, 0); //12번라인과
	Score sinbi2 = new Score(null, 99, 0, 100); //14번과 동일

}
