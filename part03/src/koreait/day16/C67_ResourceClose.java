package koreait.day16;

import java.awt.FileDialog;//한번에 import하는 법 ctrl shift o
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFrame;

public class C67_ResourceClose{
	public static void main(String[] args) {
		
		//읽어올 수 있는 텍스트파일은 인코딩이 일치해야한다.
		//workspace UTF-8이면 텍스트파일 UTF-8형식만
		//MS949이면 텍스트파일 ANSI 형식만
		String filename = fileDialogOpen();		//복사할 파일은 지정하세요.
		String filename2 = fileDialogSave();	//지정할 파일은 폴더를 찾아가서 파일명은 직접 쓰세요.
		
		File ifile = new File(filename);		//지정된 경로의 파일명으로 파일객체 생성.
		File ofile = new File(filename2);
		//Scanner : 입력 기능을 갖는 클래스
		//Unhandled exception type FileNotFoundException : 오류의 가능성이 있으므로 try ~ catch 필요하다.
		
		
		try(Scanner sc = new Scanner(ifile);PrintWriter pw = new PrintWriter(ofile)){
			while(sc.hasNext()) {	//구분자 엔터를 기준으로 다음 데이터가 있으면 true
				String temp = sc.nextLine();		//파일에서 읽어온 1줄
				System.out.println(temp);			//표준 출력(콘솔)
				pw.println(temp);					//파일 출력
			}
			System.out.println("파일 복사 완료");
		} catch (FileNotFoundException e) {
			System.out.println("사용자 오류 발생 : " + e.getMessage());
			System.out.println("지정된 파일이 없습니다");
		}catch (Exception e) {	//FileNotFoundException 이외의 모든 Exception 처리
			System.out.println("알 수 없는 오류 : " + e.getMessage());
		}
		
		
	}
	public static String fileDialogOpen() {
// 콘솔 입출력으로 실행하는 프로그램 : CLI(Command Line Interface)  <-> GUI(Graphic User Interface) 
// 자바에서도 GUI 를 만들수 있는 클래스들이 있습니다. 그 중 하나인 파일대화상자를 사용합니다. 라이브러리는 awt,swing,javaFX 등이 있습니다.
// Windows OS는 응용프로그램들이 window라는 틀 안에서 만들어지는데 자바에서는 그것은 프레임이라고 합니다.
				
		JFrame f = new JFrame();  //파일대화상자를 시작할 프레임객체 생성
		
		FileDialog fdr = new FileDialog(f,"파일 열기",FileDialog.LOAD);	//파일대화상자 객체 생성
		fdr.setVisible(true);		//파일 대화상자 보이기
		
		String filename = fdr.getDirectory() + fdr.getFile(); 	//선택한 파일의 경로와 파일명 연결
		System.out.println("선택한 경로와 파일 : " + filename);
		//System.out.println("선택한 경로 : " + fdr.getDirectory() + ",선택한 파일:" + fdr.getFile());
		File file = new File(filename);
		System.out.println("선택한 파일 크기 : " + file.length() + "바이트");


		return filename;
	}
	public static String fileDialogSave() {
		JFrame f = new JFrame();//파일대화상자를 시작할 프레임객체 생성
		FileDialog fdw = new FileDialog(f, "파일 저장",FileDialog.SAVE);
		fdw.setVisible(true);
		String filename = fdw.getDirectory() + fdw.getFile();//선택한 파일의 경로와 파일명 연결
		System.out.println("저장한 경로와 파일 : " + fdw.getDirectory() + fdw.getFile());
		return filename;
	}
}
