package lab.polymorphism;

/**
 * Author: Livia Stein Freitas
 * Right-justifies a TextBlock to a specified width.
 */

public class RightJustified implements TextBlock{

  TextBlock contents;
  int new_width;

  public RightJustified(TextBlock _contents, int _new_width) {
    this.contents = _contents;
    this.new_width = _new_width;
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
        int num_spaces = this.new_width - this.contents.width();
        String right_spaces = TBUtils.spaces(num_spaces);
        String new_row = right_spaces.concat(this.contents.row(i));
        return new_row;
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
    return this.new_width;
  }

  /**
   * Returns the content of the fields of the TextBlock.
   */
  public Object[] getContents(){
    Object[] contentsArray = {TBUtils.toString(this.contents), this.new_width};
    return contentsArray;
  }
}
