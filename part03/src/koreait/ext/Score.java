package koreait.ext;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder //builder 메소드로 필드값 초기화하면서 객체 생성
//Score 클래스의 내부클래스로 ScoreBuilder가 생성

public class Score {
	
	private String name;
	private int kor;
	private int eng;
	private int science;

}
