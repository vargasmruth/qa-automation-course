package edu.alsie.tdd.int2lcd;

public class Int2lcd {

  private static final String NONE = "   ";
  private static final String ELE1 = "  |";
  private static final String ELE2 = " _ ";
  private static final String ELE3 = " _|";
  private static final String ELE4 = "|_ ";
  private static final String ELE5 = "|_|";
  private static final String ELE6 = "| |";

  public Int2lcd() {
  }

  public Boolean isDigit(int num) {
    return (num<10);
  }



}
