package koreait.ext;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data //getter, setter, toString, default constructor
@AllArgsConstructor
@Builder
public class Person {
	private String name;
	private String mobile;
	private int age;
	private boolean gender;

}
