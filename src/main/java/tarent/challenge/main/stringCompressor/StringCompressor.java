package tarent.challenge.main.stringCompressor;

import org.springframework.stereotype.Service;

@Service
public class StringCompressor {

	public String compress(String uncompressed) {
		String compressed = "";
		String tempStr = "";
		int repeatedChar = 1;
		char letter = 0;
		// iterates one time more than the length of the uncompressed String
		for (int i = 0; i <= uncompressed.length(); i++) {
			//read the next letter only if the last letter was not yet read.
			if (i < uncompressed.length()) letter = uncompressed.charAt(i);
		
			if (tempStr.isEmpty()) {
				tempStr = Character.toString(letter);
			} else if (letter == tempStr.charAt(0) && i < uncompressed.length()) {
				//a new letter was read and it is same as the previous one.
				repeatedChar++;
				tempStr = (repeatedChar <= 2) ? tempStr + letter : Character.toString(tempStr.charAt(0)) + repeatedChar;
			} else {
				//a new letter was read and it is different from the previous one.
				compressed = compressed + tempStr;
				tempStr = Character.toString(letter);
				repeatedChar = 1;
			}
		}
		return compressed;
	}
}
