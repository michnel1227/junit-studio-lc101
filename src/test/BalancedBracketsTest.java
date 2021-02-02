package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void beginningBracketSetReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]michelle"));
    }

    @Test
    public void splitBracketSetReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[michelle]"));
    }

    @Test
    public void mixedLettersAndBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[mich]elle"));
    }

    @Test
    public void extraBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[mich]elle]"));
    }

    @Test
    public void doubleBracketSetReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[mich]el[le]"));
    }

    @Test
    public void nestedBracketSetReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[mich[ell]e]"));
    }

    @Test
    public void missingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void sameSideBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

    @Test
    public void oneCurlyBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{]"));
    }

    @Test
    public void reversedBracketWithWordsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]michelle["));
    }

    @Test
    public void reverseBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
}
