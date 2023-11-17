package lab.polymorphism;

/**
 * Author: Livia Stein Freitas
 * Given a TextBlock, flips it horizontally.
 */

public class HorizontallyFlipped implements TextBlock{

  TextBlock contents;

  public HorizontallyFlipped(TextBlock _contents) {
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
      char inv_char = theRow.charAt(row_length - m - 1);
      String inv_string = String.valueOf(inv_char);
      newRow = newRow.concat(inv_string);
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
