package tarent.challenge.main.sorterTest;

import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import tarent.challenge.main.sorter.ArraySorter;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { ArraySorter.class })
public class ArraySorterTest {

	@Autowired
	private ArraySorter arraySorter;
	private int[] unsortedArray;

	@Before
	public void setup() {
		Random random = new Random();
		unsortedArray = new int[10];
		for (int i = 0; i < unsortedArray.length; i++) {
			unsortedArray[i] = random.nextInt();
		}
	}

	@Test
	public void testSort() {
		int[] sorted = arraySorter.sort(unsortedArray);
		for (int i = 0; i < sorted.length - 1; i++) {
			assertTrue("numbers were not sorted correctly!",sorted[i] <= sorted[i + 1]);
		}
	}

}
