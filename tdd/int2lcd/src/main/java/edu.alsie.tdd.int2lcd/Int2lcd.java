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

  public String [] createRow(int num) {

    String[] array = new String[]{};
    if (isDigit(num) && num >=0){
      switch (num) {
        case 1:  array = new String[]{NONE, ELE1, ELE1};
          break;
        case 2:  array = new String[]{ELE2, ELE3, ELE4};
          break;
        case 3:  array = new String[]{ELE2, ELE3, ELE3};
          break;
        case 4:  array = new String[]{NONE, ELE5, ELE1};
          break;
        case 5:  array = new String[]{ELE2, ELE4, ELE3};
          break;
        case 6:  array = new String[]{ELE2, ELE4, ELE5};
          break;
        case 7:  array = new String[]{ELE2, ELE1, ELE1};
          break;
        case 8:  array = new String[]{ELE2, ELE5, ELE5};
          break;
        case 9:  array = new String[]{ELE2, ELE5, ELE3};
          break;
        case 0:  array = new String[]{ELE2, ELE6, ELE5};
          break;
        default: array = new String[]{""};
      }
      return array;
    }else{
      return array;
    }
  }

  public String [][] createMatrix(int number) {
    String[][] mm = new String[][]{};

    if (number < 0){ return mm; }

    String num = Integer.toString(number);
    String [] aux = num.split("");
    String[][] res = new String[num.length()][];
    for (int i = 0; i < num.length(); i++) {
      res[i] = createRow(Integer.parseInt(aux[i]));
    }

    return res;
  }

  public static String[][] transposeMatrix(String [][] m){
    String[][] temp = new String[m[0].length][m.length];
    for (int i = 0; i < m.length; i++)
      for (int j = 0; j < m[0].length; j++)
        temp[j][i] = m[i][j];
    return temp;
  }

  public String printIntToLCD(int number) {
    String res = "";
    String aux = "";
    String[][] mmt = transposeMatrix(createMatrix(number));

    for (int x=0; x < mmt.length; x++) {
      for (int y=0; y < mmt[x].length; y++) {
        aux = aux + mmt[x][y];
      }
      res = res + aux + "\n";
      aux = "";
    }
    return res;
  }


}
