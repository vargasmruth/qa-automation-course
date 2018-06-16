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

  @Test
  public void testCreateRowIfNumberIs12() {
    Int2lcd int2lcd = new Int2lcd();
    String [] expected = {};
    String [] actual = int2lcd.createRow(12);
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testCreateRowIfNumberIs3() {
    Int2lcd int2lcd = new Int2lcd();
    String [] expected = {" _ ", " _|", " _|"};
    String [] actual = int2lcd.createRow(3);
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testCreateRowIfNumberIs1Negative() {
    Int2lcd int2lcd = new Int2lcd();
    String [] expected = {};
    String [] actual = int2lcd.createRow(-1);
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testCreateMatrizIfNumberIs31() {
    Int2lcd int2lcd = new Int2lcd();
    String [][] expected = {{" _ ", " _|", " _|"}, {"   ", "  |", "  |"}};
    String [][] actual = int2lcd.createMatrix(31);
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testCreateMatrizIfNumberIs1Negative() {
    Int2lcd int2lcd = new Int2lcd();
    String [][] expected = {};
    String [][] actual = int2lcd.createMatrix(-1);
    Assert.assertEquals(expected, actual);
  }





}
