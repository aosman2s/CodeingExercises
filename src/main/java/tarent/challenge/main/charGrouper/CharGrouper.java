package tarent.challenge.main.charGrouper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tarent.challenge.main.sorter.ArraySorter;
import tarent.challenge.main.stringCompressor.StringCompressor;

@Service
public class CharGrouper {
	@Autowired
	private StringCompressor stringCompressor;
	@Autowired
	private ArraySorter arraySorter;

	public String group(String ungrouped) {
		char[] strElements = ungrouped.toCharArray();
		int[] numElements = new int[strElements.length];
		//Converts Char to Int (ASCII Code)
		for(int i =0 ; i<strElements.length;i++) {
			numElements[i] = (int)strElements[i];
		}
		numElements=arraySorter.sort(numElements);
		//Convert ASCII Int to Char
		for(int i=0; i<numElements.length; i++) {
			strElements[i] = (char) numElements[i];
		}
		return stringCompressor.compress(new String(strElements));
	}

}
