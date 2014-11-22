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
			int readed = 0;
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
			int i = 2;
			if(number==0)
			{
				return false;
			};
			if(number == 1 || number == 2)
			{
				return true;
			}
			while(i<=Math.sqrt(number))
			{
				if(number%i==0)
				{
					return false;
				}
				i++;	
			}
			return false;
		}
		public void decode(String sourceFile, String destinationFile, LinkedList<Character> key) throws IOException
		{
			InputStream in = new FileInputStream(sourceFile);
			OutputStream out = new FileOutputStream(destinationFile);
			
			int readed = 0;
			for (int i = 0; i < 256; i++) {
				readed = in.read();
				if(isPrime(i))
				{
					out.write((char)key.indexOf(readed));
				}
				else
				{
					out.write(readed);
				}
			}
			out.close();
		}
}
