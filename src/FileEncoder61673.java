import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedList;


public class FileEncoder61673 {

		public void encode(String sourceFile, String destinationFile, LinkedList<Character> key) throws IOException
		{
			InputStream in = new FileInputStream(sourceFile);
			OutputStream out = new FileOutputStream(destinationFile);
			int readed;
			for (int i = 0; i < 256; i++) {
				readed = in.read();
				if(isPrime(i))
				{
					out.write(key.get(readed));
				}
				else
				{
					out.write(readed);
				}
			}
			out.close();
		}
		private boolean isPrime(int number) {
			// TODO Auto-generated method stub
			return false;
		}
		public void decode(String sourceFile, String destinationFile, LinkedList<Character> key)
		{
			
		}
}
