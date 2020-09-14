package tarent.challenge.main.bonusTasksTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BonusATest {
	@Test
	public void test() {
		String s = "1";
		Integer i = 1;
		s = add(s, 1);
		assertEquals("2", s);
		s = add(s, 5);
		assertEquals("7", s);
		i = add(i, 2);
		assertEquals((Integer) 3, i);
		i = add(i, 1);
		assertEquals((Integer) 4, i);
	}

	private <T> T  add(T s, int i) {
		Integer value;
		if(s.getClass().equals(String.class)) {
			value = Integer.parseInt((String) s) + i;
			return (T) value.toString();
		} else {
			value = (Integer)s + i;
			return (T) value;
		}
	}

}
