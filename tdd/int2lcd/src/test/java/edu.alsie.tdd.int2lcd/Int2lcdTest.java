package edu.alsie.tdd.int2lcd;

import org.junit.Assert;
import org.junit.Test;

public class Int2lcdTest {

  @Test
  public  void testTest() {
    Assert.assertEquals(0, 0);
  }

  @Test
  public void testGiven5ThenIsNotFizzBuzz() {
    Int2lcd int2lcd = new Int2lcd();
    Assert.assertTrue(int2lcd.isDigit(5));
  }

  @Test
  public void testGiven21ThenIsNotFizzBuzz() {
    Int2lcd int2lcd = new Int2lcd();
    Assert.assertFalse(int2lcd.isDigit(21));
  }




}
