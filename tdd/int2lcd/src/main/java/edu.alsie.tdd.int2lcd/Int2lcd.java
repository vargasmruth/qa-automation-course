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

  public String printDigit(int number) {
    switch (number) {
      case 1:  return NONE + ELE1 + ELE1;
      case 2:  return ELE2 + ELE3 + ELE4;
      case 3:  return ELE2 + ELE3 + ELE3;
      case 4:  return NONE + ELE5 + ELE1;
      case 5:  return ELE2 + ELE4 + ELE3;
      case 6:  return ELE2 + ELE4 + ELE5;
      case 7:  return ELE2 + ELE1 + ELE1;
      case 8:  return ELE2 + ELE5 + ELE5;
      case 9:  return ELE2 + ELE5 + ELE3;
      case 0:  return ELE2 + ELE6 + ELE5;
      default: return "";
    }
  }


}
