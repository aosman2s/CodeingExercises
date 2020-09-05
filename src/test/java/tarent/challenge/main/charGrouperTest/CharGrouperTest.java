package tarent.challenge.main.charGrouperTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import tarent.challenge.main.charGrouper.CharGrouper;
import tarent.challenge.main.sorter.ArraySorter;
import tarent.challenge.main.stringCompressor.StringCompressor;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { ArraySorter.class,
		CharGrouper.class,
		StringCompressor.class})
public class CharGrouperTest {
	@Autowired
	private CharGrouper charGrouper;
	
	@Test
	public void grouperTest() {
		assertEquals("a4binssuz", charGrouper.group("abzuaaissna"));
	}

}
