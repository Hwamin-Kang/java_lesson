class Print{
	
	public String delimiter = "";
	
	public Print(String delimiter) { //생성자는 클래스와 이름이 똑같아야한다, 커스텀 생성자
		this.delimiter = delimiter;
	}

	public void A() {
		System.out.println(this.delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	
	public void B() {
		System.out.println(this.delimiter);
		System.out.println("B");
		System.out.println("B");
	}
	
}