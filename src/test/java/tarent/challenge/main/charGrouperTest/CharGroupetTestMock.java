package tarent.challenge.main.charGrouperTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit4.SpringRunner;

import tarent.challenge.main.charGrouper.CharGrouper;
import tarent.challenge.main.sorter.ArraySorter;
import tarent.challenge.main.stringCompressor.StringCompressor;

@RunWith(SpringRunner.class)
public class CharGroupetTestMock {
	@SpyBean
	private ArraySorter arraySorter;
	@MockBean
	private StringCompressor stringCompressor;
	
	@MockBean
	private CharGrouper charGrouper;
	
	@Test
	public void grouperTest() {
		Mockito.when(charGrouper.group("abcdef")).thenReturn("SUCCESS");
		
		//TODO: alle andere Strings mit Matchers mocken.
		//Mockito.when(charGrouper.group(AdditionalMatchers.not(Matchers.comparesEqualTo("abcdef"))).thenReturn("");
		//assertEquals("", charGrouper.group("abzuaaissna"));
		
		assertEquals("SUCCESS", charGrouper.group("abcdef"));
		Mockito.verify(charGrouper, Mockito.times(1)).group("abcdef");
	}
	
	

}
