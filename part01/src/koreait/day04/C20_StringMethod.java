package koreait.day04;

public class C20_StringMethod {
	
	public static void main(String[] args) {
		
		String message = "hello~";
		
		
		int len = message.length();
		char temp = message.charAt(3);
		boolean isState = message.equals("hello~");
		
		System.out.println("length() = " + len);
		System.out.println("charAt(3) = " + temp);
		System.out.println("equals(\"Hello~\") = " + isState);
		
		System.out.println("indexOf('e') = " + message.indexOf('e'));
		System.out.println("indexOf(\"lo\") = " + message.indexOf("lo"));
		System.out.println("indexOf(\"ol\") = " + message.indexOf("ol"));
		
		String test = "hello~hello~";
		System.out.println("indexOf(\"lo\") = " + test.indexOf("lo"));
		System.out.println("lastIndexOf(\"lo\") = " + test.lastIndexOf("lo"));
		
		System.out.println("substring(2) = " + message.substring(2));
		System.out.println("substring(2,4) = " + message.substring(2,4));
		System.out.println("replace(\"ll\", \"*@\") = " + message.replace("ll", "*@"));
		System.out.println("startsWith(\"H\") = " + message.startsWith("H"));
		System.out.println("endsWith(\"~\") = " + message.endsWith("~"));
		
	}

}
//message.length();
//message.charAt(0);

//message.equals("hello");
/*		
message.indexOf('e'); //int
message.indexOf("lo"); //int
message.substring(2); //string
message.substring(2,4); //string
message.replace("ll", "*@");
*/		