package tarent.challenge.main.sorterTest;

import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import tarent.challenge.main.sorter.ArraySorter;

public class ArraySorterTest {

	private ArraySorter sorter;
	private int[] unsortedArray;

	@Before
	public void setup() {
		sorter = new ArraySorter();
		Random random = new Random();
		unsortedArray = new int[10];
		for (int i = 0; i < unsortedArray.length; i++) {
			unsortedArray[i] = random.nextInt();
		}
	}

	@Test
	public void testSort() {
		int[] sorted = sorter.sort(unsortedArray);
		for (int i = 0; i < sorted.length - 1; i++) {
			assertTrue(sorted[i] <= sorted[i + 1]);
		}
	}

}
