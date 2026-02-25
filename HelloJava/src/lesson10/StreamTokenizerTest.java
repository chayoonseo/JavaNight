package lesson10;

import java.io.*;

public class StreamTokenizerTest {

	public static void main(String[] args) throws IOException{
		InputStreamReader reader = new InputStreamReader (new FileInputStream("StreamTokenizerTest.txt"));
		StreamTokenizer tokens = new StreamTokenizer(reader);
		tokens.quoteChar('"');
		while(tokens.nextToken() != tokens.TT_EOF) {
			switch(tokens.ttype) {
			case '"':
				System.out.println(tokens.sval);
				break;
			case StreamTokenizer.TT_WORD:
				System.out.println(tokens.sval);
				break;
			case StreamTokenizer.TT_NUMBER:
				System.out.println(tokens.nval);
				break;
			}

		}

	}

}
