package codingChallengesPackage;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CodingChallengesJavaTests {

	@Test
	public void HighestOccurringCharTest1() {
		String str = "aavvvvveeeetf";
		String value = CodingChallengesJava.HighestOccurringChar(str);
		String expected = "v";
		assertEquals(value, expected);
	}
	@Test
	public void HighestOccurringCharTest2() {
		String str = "happy";
		String value = CodingChallengesJava.HighestOccurringChar(str);
		String expected = "p";
		assertEquals(value, expected);
	}

	@Test
	public void HighestOccurringCharTest3() {
		String str = "ae32321122";
		String value = CodingChallengesJava.HighestOccurringChar(str);
		String expected = "2";
		assertEquals(value, expected);
	}

}
