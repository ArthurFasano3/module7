package application;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

public class JunitTest {
	
	@Test
	public void test() {
		int outLimit = 1;
		String[] words = new String[] {"foo", "baz", "bar", "foo", "foo", "baz", "baz", "baz", "bar", "bar", "bar"};
		List<Word> output = wordOccur.getOccurrences(words, outLimit);
		assertEquals(1, output);

	}

}
