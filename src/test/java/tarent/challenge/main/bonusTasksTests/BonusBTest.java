package tarent.challenge.main.bonusTasksTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import tarent.challenge.main.bonusTasks.TestClass;

public class BonusBTest {
	@Test
	public void testChangeFooBar() {
		TestClass testClass = Mockito.spy(TestClass.class);
		assertEquals("test", testClass.getFoobar());
		Mockito.doReturn("SUCCESS").when(testClass).getFoobar();
		assertEquals("SUCCESS", testClass.getFoobar());
	}
}
