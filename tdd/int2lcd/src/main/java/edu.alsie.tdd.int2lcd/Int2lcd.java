package edu.alsie.tdd.int2lcd;

public class Int2lcd {

  private static final String NONE = " \n";
  private static final String ELE1 = "  |\n";
  private static final String ELE2 = " _ \n";
  private static final String ELE3 = " _|\n";
  private static final String ELE4 = "|_ \n";
  private static final String ELE5 = "|_|\n";
  private static final String ELE6 = "| |\n";

  public Int2lcd() {
  }

  public static boolean isDigit(char ch)
  {
    return (Character.isDigit(ch));
  }

  public static boolean isNumber(String num)
  {
    for(int i = 0; i < num.length(); i ++){
      if (!isDigit(num.charAt(i))) { return false; }
  }
  return true;
  }

  public String print1(char ch) {
    if (isDigit(ch) && ch == '1'){
      return NONE + ELE1 + ELE1;
    }
    return "";
  }

}
