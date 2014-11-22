import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedList;



public class Testing {

	public static void main(String[] args) throws IOException {
		
		FileEncoder61673 a = new FileEncoder61673();

		OutputStream inOut = new FileOutputStream("C:/Users/USER/Desktop/Git/SDA-Task1-Encoding/in.txt");
		for (int i = 0; i < 256; i++) {
			inOut.write(i);
		}
		LinkedList<Character> key = new LinkedList<Character>();
		LinkedList<Character> keyOne = new LinkedList<Character>();
		for (int i = 0; i < 256 ; i++) {
			key.add((char)i);
		}
		for (int i = 0; i < 256 ; i++) {
			keyOne.add((char)97);
		}
		inOut.close();
		a.encode("C:/Users/USER/Desktop/Git/SDA-Task1-Encoding/in.txt", "C:/Users/USER/Desktop/Git/SDA-Task1-Encoding/out.txt", key);
		a.encode("C:/Users/USER/Desktop/Git/SDA-Task1-Encoding/in.txt", "C:/Users/USER/Desktop/Git/SDA-Task1-Encoding/out1.txt", keyOne);
		System.out.println("Done");
		
	}

}
