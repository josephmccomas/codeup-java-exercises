package test.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodeupCryptTest {
//    focus on testing hashPassword
//    takes a string that is a pw
//    returns a string that is the hashed pw
//    replace vowels w/numbers
    @Test
    public void testEmptyPw(){
        assertEquals("", CodeupCrypt.hashPassword(""));
    }
    @Test
    public void testEmptyPwLetterA(){
        assertEquals("4bc", CodeupCrypt.hashPassword("abc"));
    }
    @Test
    public void testEmptyPwLetterE(){
        assertEquals("3bc", CodeupCrypt.hashPassword("ebc"));
    }
    @Test
    public void testEmptyPwLetterI(){
        assertEquals("1bc", CodeupCrypt.hashPassword("ibc"));
    }
    @Test
    public void testEmptyPwLetterO(){
        assertEquals("0bc", CodeupCrypt.hashPassword("obc"));
    }
    @Test
    public void testEmptyPwLetterU(){
        assertEquals("9bc", CodeupCrypt.hashPassword("ubc"));
    }
    @Test
    public void testEmptyPwNoVowels(){
        assertEquals("bczx", CodeupCrypt.hashPassword("bczx"));
    }
}
