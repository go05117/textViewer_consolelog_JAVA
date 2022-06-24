package text_reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("텍스트 주소.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while (scanner.hasNextLine()) {
			String str = scanner.nextLine();
			System.out.println(str);
		}
	}
}