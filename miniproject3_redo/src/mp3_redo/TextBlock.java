package mp3_redo;

/**
 * Simple blocks of text for a lab on polymorphism
 * 
 * @author Samuel A. Rebelsky
 * @version 1.2 of February 2019
 */
public interface TextBlock {
  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Get one row from the block.
   * 
   * @pre i < this.height()
   * @exception Exception if the row number is invalid.
   */
  public String row(int i) throws Exception;

  /**
   * Determine how many rows are in the block.
   */
  public int height();

  /**
   * Determine how many columns are in the block.
   */
  public int width();

  /**
   * Returns the content of the fields of the TextBlock.
   */
  public Object[] getContents();

  


} // interface TextBlock
