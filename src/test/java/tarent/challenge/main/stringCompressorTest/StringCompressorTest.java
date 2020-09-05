package tarent.challenge.main.stringCompressorTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import tarent.challenge.main.stringCompressor.StringCompressor;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { StringCompressor.class })
public class StringCompressorTest {
	@Autowired
	private StringCompressor stringCompressor;

	@Test
	public void testCompressSimple() {
		String uncompressed = "aaa";
		String compressed = stringCompressor.compress(uncompressed);
		assertEquals("a3", compressed);
	}

	@Test
	public void testCompressMoreComplex() {
		String uncompressed = "aabbbbcddddddd";
		String compressed = stringCompressor.compress(uncompressed);
		assertEquals("aab4cd7", compressed);
	}

	@Test
	public void testCompressWithNonOptimizedResult() {
		String uncompressed = "hello";
		String compressed = stringCompressor.compress(uncompressed);
		assertEquals(uncompressed, compressed);
	}

}
