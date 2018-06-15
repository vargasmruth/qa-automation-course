package edu.alsie.tdd.int2lcd;

public class Int2lcd {

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
}
