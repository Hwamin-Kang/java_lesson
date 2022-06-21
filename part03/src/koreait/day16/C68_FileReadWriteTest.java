package koreait.day16;

import java.io.File; //io : input, output ����� ���õ� ��ɵ��� Ŭ����
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//Exception ó�� ����� ���� �޼ҵ忡�� ���ǵ� �� �ٸ� ��� : 
public class C68_FileReadWriteTest {
	
	//main �޼ҵ尡 throws Exception �Ѵٸ� JVM���� �ѱ��. ó�������� printStackTrace����� ����
	public static void main(String[] args){
		
		String filename = "C:\\Users\\Hwamin Kang\\�ڹ�C.txt";
		
		try {
			fileWrite2(filename);
//			filename = "C:\\Users\\Hwamin Kang\\�ڹ�0618.txt"; ���� ���� �׽�Ʈ��
			fileRead(filename);
		} catch (FileNotFoundException e) {
			System.out.println("����� ���� ���� : " + e.getMessage());
			System.out.println("������ �����ϴ��� Ȯ���Ͻÿ�.");
		}
		
	}
	
	//Exception�� try~catch�� ����ó��
	public static void fileWrite(String filename) {
		File file = new File(filename);
		PrintWriter pw = null;
		//������ �޼ҵ� java.io.PrintWriter.PrintWriter(File file throws FileNotFoundException)
		//PrintWriter : ��� ����� ���� Ŭ����
		//Unhandled exception type FileNotFoundException : ������ ���ɼ��� �����Ƿ� try ~ catch �ʿ��ϴ�
		try {
			pw = new PrintWriter(file); //file�� ������ ��ġ�� ����� ���� ��ü
			pw.println("��� 90 89 82 ");
			pw.println("���� 89 90 82 ");
			pw.println("���� 82 89 90 ");
			System.out.println("���� ����� �Ϸ�Ǿ����ϴ�."); //System.out : ǥ�����(�ܼ� ���)
		} catch (FileNotFoundException e) {
			//��� ��ɿ��� ������ ������ �ڵ����� ������ ���������.
			System.out.println("����� ���� �߻� : " + e.getMessage());
			e.printStackTrace();
		} finally {
			pw.close();
		}
	}
	
	//throws Ű����� �ش� Exception�� ȣ���� ������ �ѱ��.
	//throws �ڿ�, �� �����ؼ� �������� ������ �� �ִ�.
	//Exception ó���ؾ� �� �޼ҵ尡 ���� ���ǵǰ� ���� �� �Ѱ����� ��� ó���� �� �ִ�.
	public static void fileWrite2(String filename) throws FileNotFoundException {
		File file = new File(filename);
		PrintWriter pw = null;
		//PrintWriter : ��� ����� ���� Ŭ����
		//Unhandled exception type FileNotFoundException : ������ ���ɼ��� �����Ƿ� try ~ catch �ʿ��ϴ�
			pw = new PrintWriter(file); //file�� ������ ��ġ�� ����� ���� ��ü
			pw.println("��� 90 89 82 ");
			pw.println("���� 89 90 82 ");
			pw.println("���� 82 89 90 ");
			System.out.println("���� ����� �Ϸ�Ǿ����ϴ�."); //System.out : ǥ�����(�ܼ� ���)
			pw.close();
	}
	
	public static void fileRead(String filename) throws FileNotFoundException{
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
	
}
