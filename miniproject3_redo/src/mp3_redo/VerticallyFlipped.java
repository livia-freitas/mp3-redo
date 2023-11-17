package lab.polymorphism;

public class VerticallyFlipped implements TextBlock{
  TextBlock contents;

  public VerticallyFlipped(TextBlock _contents) {
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
     return this.contents.row(h - i - 1);
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
