package lab.polymorphism;

/**
 * Author: Livia Stein Freitas
 * Interweaves spaces in the inputted TextBlock.
 */
public class SpacedOut implements TextBlock{
 
  TextBlock contents;

  public SpacedOut(TextBlock _contents) {
    this.contents = _contents;
  }
   /**
   * Get one row from the block.
   * 
   * @pre i < this.height()
   * @exception Exception if the row number is invalid.
   */
  public String row(int i) throws Exception { 
    int h = this.contents.height();
    if ((i >= 0) && (i <= h)) {

     String newRow = "";
     String theRow = this.contents.row(i);
     int row_length = theRow.length();
     int m;

     for (m = 0; m < row_length; m++) {
      char thisChar = theRow.charAt(m);
      String charString = String.valueOf(thisChar);
      newRow = newRow.concat(charString);
      newRow = newRow.concat(" ");
     }
     return newRow;
    } else {
      throw new Exception("Invalid row " + i);
    }
  }

  /**
   * Determine how many rows are in the block.
   */
  public int height() {
    return this.contents.height();
  }

  /**
   * Determine how many columns are in the block.
   */
  public int width() {
    return this.contents.width();
  }

  /**
   * Returns the content of the fields of the TextBlock.
   */
  public Object[] getContents(){
    Object[] contentsArray = {TBUtils.toString(this.contents)};
    return contentsArray;
  }
}
