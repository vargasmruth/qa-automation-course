package edu.alsie.tdd.int2lcd;

import org.junit.Assert;
import org.junit.Test;

public class Int2lcdTest {

  @Test
  public  void testTest() {
    Assert.assertEquals(0, 0);
  }

  @Test
  public void testGivenAThenIsDigit() {
    Int2lcd int2lcd = new Int2lcd();
    Assert.assertTrue(int2lcd.isDigit('a'));
  }

  @Test
  public void testGiven1ThenIsDigit() {
    Int2lcd int2lcd = new Int2lcd();
    Assert.assertTrue(int2lcd.isDigit('1'));
  }

  @Test
  public void testGivenABCThenIsDigit() {
    Int2lcd int2lcd = new Int2lcd();
    Assert.assertTrue(int2lcd.isNumber("ABC"));
  }

  @Test
  public void testGiven123ThenIsDigit() {
    Int2lcd int2lcd = new Int2lcd();
    Assert.assertTrue(int2lcd.isNumber("123"));
  }

  @Test
  public void testGiven1a2ThenIsDigit() {
    Int2lcd int2lcd = new Int2lcd();
    Assert.assertTrue(int2lcd.isNumber("1a2"));
  }

}
