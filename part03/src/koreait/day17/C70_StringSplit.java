package koreait.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C70_StringSplit {

	public static void main(String[] args) {
		
		//String 클래스의 split(분열시키다) 메소드 : 리턴 타입이 String 배열
		
		String temp = "모모 90 88 79";
		String[] result = temp.split(" "); //공백을 기준으로 문자열을 여러개로 쪼개서 문자열 배열인 result에 대입.
		System.out.println("result length : " + result.length); //result 배열 요소의 갯수 : 4
		System.out.println("index 0 : " + result[0]);
		System.out.println("index 1 : " + result[1]);
		System.out.println("index 2 : " + result[2]);
		System.out.println("index 3 : " + result[3]);
		
		//for문으로
		System.out.println("\n2. 일반적인 for 출력");
		for(int i = 0; i < result.length; i++) {
			System.out.println(String.format("result[%d] : %s", i, result[i]));
		}
		System.out.println("result length : " + result.length);
		
		//향상된 for문
		System.out.println("\n3. 향상된 for 출력");
		for(String t : result) {//result 배열 출력
			System.out.println("result 요소 : " + t);
		}
		
		String temp2 = "모모,,90,,88,,79";
		result = temp2.split(","); //구분기호 ','를 기준으로 문자열을 쪼갠다.(예상되는 배열요소의 갯수 : 7)
		System.out.println("\n4. split 구분기호 : ,");
		System.out.println("result length : " + result.length);
		for(String t : result)
			System.out.println("result 요소 : " + t);
		
		result = temp2.split(",,");
		System.out.println("\n6. split 구분기호 : ,,");//구분기호 ',,'를 기준으로 문자열을 쪼갠다.(예상되는 배열요소의 갯수 : 4)
		System.out.println("result length : " + result.length);
		for(String t : result)
			System.out.println("result 요소 : " + t);
		
		//split의 인자인 문자열은 정규식 regex 문자열이다.(정규식 패턴은 복잡하고 어렵다.)
		//정규식 예시 : []안에 표시하는 것은 문자 여러개가 또는(or)에 해당한다.
		
		temp2 = "모모,90 88()79";
		result = temp2.split("[ ,()]"); //정규식 문자열 : 구분기호는 공백 또는 , 또는( 또는 ).
		System.out.println("\n7. split 인자가 정규식");
		System.out.println("result length : " + result.length);
		for(String t : result)
			System.out.println("result 요소 : " + t);
		
		temp2 = "모모,90,88,79";
		result = temp2.split(",", 2);//메소드 오버로딩
		System.out.println("\n8. split 두번째 인자 limit 확인");
		//limit은 리턴되는 배열요소의 갯수. 단, 쪼개지는 갯수보다 커질수는 없다.
		System.out.println("result length : " + result.length);
		for(String t : result)
			System.out.println("result 요소 : " + t);
		
		//배열과 유사한 자료구조 : List
		//배열을 List로 변환하는 방법
		result = temp2.split(",");
		System.out.println("\n9. result 배열을 List 객체로 변경");
		List<String> rlist = Arrays.asList(result);
		System.out.println(rlist);
		System.out.println("result length : " + result.length);
		for(String t : rlist)
			System.out.println("rlist 요소 : " + t);
		//위의 rlist는 배열의 크기만큼 List를 정적으로 생성한다.(add, remove, ... 못한다.)
		//rlist.add("test"); //error : 고정된 크기의 리스트
		//rlist.remove(2); //error : 고정된 크기의 리스트
		//rlist.add(2,"100"); //error
		
		//동적인 List로 만들기
		System.out.println("\n10. ArrayList의 인자가 있는 생성자 테스트");
		List<String> rlist2 = new ArrayList<String>(rlist); //정적인 리스트를 인자로 받아서 동적인 리스트로 전환
		System.out.println(rlist2);
		rlist2.add("test");
		rlist2.remove(2);
		rlist2.add(2, "100");
		System.out.println(rlist2); //List 출력
		
		//Arrays.asList는 테스트용으로 또는 간단한 고정 리스트 만들 때 유용하다.
		List<Integer> ilist = Arrays.asList(1,2,6,9,100);
		System.out.println("\n11. Arrays.asList 활용");
		System.out.println(ilist);
		
		

	}

}
