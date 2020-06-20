package test;

import com.Palindrome;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeTest {
    Palindrome palindrome = new Palindrome();

    @Test
    public void checkPalidrome() {
        assertEquals(true, palindrome.isPalidromeUsingStringBuffer("Was it a rat I saw"));
        assertEquals(true,palindrome.isPalidromeUsingStringBuffer(""));
        assertEquals(false,palindrome.isPalidromeUsingStringBuffer("Was it a rat I saw?"));

    }
}
