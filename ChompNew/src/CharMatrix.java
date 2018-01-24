/**
 * Implements a 2-D array of characters
 */

import java.util.Arrays;

public class CharMatrix
{
  // Fields:
    char[][] chompGrid;

  /**
   * Constructor: creates a grid with dimensions rows, cols,
   * and fills it with spaces
   */
  public CharMatrix(int rows, int cols)
  {
    chompGrid = new char[rows][cols];
    Arrays.fill(chompGrid,' ');
  }

  /**
   * Constructor: creates a grid with dimensions rows , cols ,
   * and fills it with the fill character
   */
  public CharMatrix(int rows, int cols, char fill)
  {
      chompGrid = new char[rows][cols];
      Arrays.fill(chompGrid,fill);

  }

  /**
   * Returns the number of rows in grid
   */
  public int numRows()
  {
    return chompGrid.length;
  }

  /**
   * Returns the number of columns in grid
   */
  public int numCols()
  {
    return chompGrid[0].length;
  }

  /**
   * Returns the character at row, col location
   */
  public char charAt(int row, int col)
  {
    return chompGrid[row][col];
  }

  /**
   * Sets the character at row, col location to ch
   */
  public void setCharAt(int row, int col, char ch)
  {
    chompGrid[row][col] = ch;
  }

  /**
   * Returns true if the character at row, col is a SPACE,
   * false otherwise
   */
  public boolean isEmpty(int row, int col) {
      if(chompGrid[row][col] == ' ')
      {
          return true;
      }
    else{
          return false;
      }
  }

  /**
   * Fills the given rectangle with the fill characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
    for(int i = col0; i < col1; i++) {
        chompGrid[row0][i] = fill;
        for (int j = row0; j < row1; j++) {
            chompGrid[j][i] = fill;
        }
    }

  }

  /**
   * Fills the given rectangle with the SPACE characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
  public void clearRect(int row0, int col0, int row1, int col1)
  {
      for(int i = col0; i < col1; i++) {
          chompGrid[col0][i] = ' ';
          for (int j = row0; j < row1; j++) {
              chompGrid[j][i] = ' ';
          }
      }
  }

  /**
   * Returns the count of all non-SPACE characters in row.
   */
  public int countInRow(int row)
  {
    int len = chompGrid[row].length;
    int pos = 0;
    int total = 0;
    int temp = 0;
    while (temp < (len - 1)){
        if(chompGrid[row][pos] != ' '){
            pos++;
            total++;
      }
        else{
            pos++;
      }
  }
    return temp;

  }

  /**
   * Returns the count of all non-SPACE characters in col.
   */
  public int countInCol(int col)
  {
    int len = chompGrid.length;
    int pos = 0;
    int total = 0;
    int temp = 0;
    while(temp < (len - 1)){
        if(chompGrid[pos][col] != ' '){
            pos++;
            total++;
      }
        else{
            pos++;
      }
    }
  return temp;
  }
}
