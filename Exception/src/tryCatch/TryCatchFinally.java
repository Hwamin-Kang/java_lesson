package tryCatch;

import java.io.FileWriter;
import java.io.IOException;

public class TryCatchFinally {
	
	public static void main(String[] args) {
		System.out.println(1);
		//try catch finally
		FileWriter f = null;
		try {
			f = new FileWriter("data.txt");
			f.write("haha");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if(f != null) {
				try {
					f.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
				
			}
		}
		System.out.println(2);
		
	}
}