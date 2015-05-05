package exceptionAndIO;

import static org.junit.Assert.*;

import org.junit.Test;

public class MonoAlphabeticCipherTest {

	MonoAlphabeticCipher test = new MonoAlphabeticCipher();
	
	@Test
	public void testGetKeyWord() {
		String result = test.getKeyWord("AAA");
		assertEquals("a", result);
		result = test.getKeyWord("FEATHER");
		assertEquals("feathr", result);
		result = test.getKeyWord("AAABBB");
		assertEquals("ab", result);
	}
	
	@Test
	public void testGetEncryptString() {
		String result = test.getEncryptString("A");
		assertEquals("azyxwvutsrqponmlkjihgfedcb", result);
		result = test.getEncryptString("FEATHR");
		assertEquals("feathrzyxwvusqponmlkjigdcb", result);
	}

	@Test
	public void testEncode() {
		String result = test.encode("a", "FEATHER");
		assertEquals("f", result);
		result = test.encode("bcd", "FEATHER");
		assertEquals("eat", result);
		result = test.encode("mno stu", "FEATHER");
		assertEquals("sqp lkj", result);
		result = test.encode("xyz", "FEATHER");
		assertEquals("dcb", result);
	}
}
