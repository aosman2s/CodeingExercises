package tarent.challenge.main.sorter;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class ArraySorter {

	public int[] sort(int[] unsorted) {
		int[] copy = Arrays.copyOf(unsorted, unsorted.length);
		Arrays.sort(copy);
		return copy;
	}

}
