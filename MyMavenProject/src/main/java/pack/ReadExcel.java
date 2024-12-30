package pack;

import java.io.IOException;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		Excel e=new Excel();
		String s=e.readData(0,0);
		System.out.println(s);
		String s1=e.readData(0,1);
		System.out.println(s1);
		System.out.println("new build");
		

	}

}
