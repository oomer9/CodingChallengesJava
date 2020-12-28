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
	@Test
	public void HighestOccurringCharTest4() {
		String str = "";
		String value = CodingChallengesJava.HighestOccurringChar(str);
		String expected = null;
		assertEquals(value, expected);
	}
	@Test
	public void HighestOccurringCharTest5() {
		String str = null;
		String value = CodingChallengesJava.HighestOccurringChar(str);
		String expected = null;
		assertEquals(value, expected);
	}
	@Test
	public void RemoveSameLetterInDifferentCapsTest1() {
		String str = "aaCcdaE";
		String value = CodingChallengesJava.RemoveSameLetterInDifferentCaps(str);
		String expected = "aadaE";
		assertEquals(value, expected);
	}
	@Test
	public void RemoveSameLetterInDifferentCapsTest2() {
		String str = "BBNnMmCc";
		String value = CodingChallengesJava.RemoveSameLetterInDifferentCaps(str);
		String expected = "BB";
		assertEquals(value, expected);
	}
	@Test
	public void RemoveSameLetterInDifferentCapsTest3() {
		String str = "CdDAaE";
		String value = CodingChallengesJava.RemoveSameLetterInDifferentCaps(str);
		String expected = "CE";
		assertEquals(value, expected);
	}
	@Test
	public void RemoveSameLetterInDifferentCapsTest4() {
		String str = "asdcasd";
		String value = CodingChallengesJava.RemoveSameLetterInDifferentCaps(str);
		String expected = "asdcasd";
		assertEquals(value, expected);
	}
	@Test
	public void GreatestCommonDivisorTest1() {
		int num1 = 24;
		int num2 = 54;
		int expected = 6;
		int value = CodingChallengesJava.GreatestCommonDivisor(num1, num2);
		assertEquals(value, expected);
	}
	@Test
	public void GreatestCommonDivisorTest2() {
		int num1 = 84;
		int num2 = 132;
		int expected = 12;
		int value = CodingChallengesJava.GreatestCommonDivisor(num1, num2);
		assertEquals(value, expected);
	}
	@Test
	public void GreatestCommonDivisorTest3() {
		int num1 = 30;
		int num2 = 105;
		int expected = 15;
		int value = CodingChallengesJava.GreatestCommonDivisor(num1, num2);
		assertEquals(value, expected);
	}

}
