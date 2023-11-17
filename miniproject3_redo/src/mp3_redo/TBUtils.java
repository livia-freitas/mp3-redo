package lab.polymorphism;

import java.io.PrintWriter;

/**
 * Utilities for TextBlocks.
 * 
 * @author Samuel A. Rebelsky
 * @version 1.3 of September 2014
 */
public class TBUtils {
  // +--------------+------------------------------------------------------
  // | Class Fields |
  // +--------------+

  /**
   * A really big sequence of dashes. This sequence may grow as the program operates.
   */
  static String lotsOfDashes = "--";

  /**
   * A really big sequence of spaces. This sequence may grow as the program operates.
   */
  static String lotsOfSpaces = "  ";

  // +----------------+----------------------------------------------------
  // | Static Methods |
  // +----------------+

  /**
   * Build a sequence of dashes of a specified length.
   */
  static String dashes(int len) {
    // Note: This strategy probably represents an overkill in
    // attempts at efficiency.
    // Make sure the collection of dashes is big enough
    while (lotsOfDashes.length() < len) {
      lotsOfDashes = lotsOfDashes.concat(lotsOfDashes);
    } // while
    // Extract an appropriate length substring
    return lotsOfDashes.substring(0, len);
  } // dashes(int)

  /**
   * Print a TextBlock to the specified destination.
   */
  public static void print(PrintWriter pen, TextBlock block) {
    for (int i = 0; i < block.height(); i++) {
      // Even though we only call block.row with a valid i,
      // we need to put the call in a try/catch block.
      try {
        pen.println(block.row(i));
      } catch (Exception e) {
        pen.println();
      } // catch (Exception)
    } // for
  } // print(PrintWriter, TextBlock)

  /**
   * Build a sequence of spaces of a specified length.
   */
  static String spaces(int len) {
    // As with dashes, this is probably overkill.
    // Make sure the collection of dashes is big enough
    while (lotsOfSpaces.length() < len) {
      lotsOfSpaces = lotsOfSpaces.concat(lotsOfSpaces);
    } // while
    // Extract an appropriate length substring
    return lotsOfSpaces.substring(0, len);
  } // spaces(int)


  static boolean equal(TextBlock t1, TextBlock t2) {
    if (t1.height() != t2.height() || t1.width() != t2.width()) {
      return false;
    } else {
      for (int i = 0; i < t1.height(); i++) {
        try {
          String t1_row = t1.row(i);
          String t2_row = t2.row(i);
          if (!(t1_row.equals(t2_row))) {
            return false;
          }
        } catch (Exception e) {
          continue;
        }//catch
      }//for
    }//else
    return true;
  }//equal()



  static boolean eq(TextBlock t1, TextBlock t2) {
    if (t1 == t2) {
      return true;
    }
    return false;
  }

  /**
   * Converts a TextBlock into a String and returns that.
   * 
   * @param block
   * @return
   */
  static String toString(TextBlock TB) {
    PrintWriter pen = new PrintWriter(System.out, true);
    String newString = "";
    for (int i = 0; i < TB.height(); i++) {
      // Even though we only call block.row with a valid i,
      // we need to put the call in a try/catch block.
      try {
        newString = newString.concat(TB.row(i) + "\n");
      } catch (Exception e) {
        pen.println("something went wrong...");
        newString.concat("");
      } // catch (Exception)
    } // for
    return newString;
  }

  /**
   * Checks if two TextBlocks were built in the same way.
   * 
   * @param t1
   * @param t2
   * @return
   */
  static boolean eqv(TextBlock t1, TextBlock t2) {
    Object[] t1Contents = t1.getContents();
    Object[] t2Contents = t2.getContents();

    if (!(t1.getClass() == t2.getClass())) { // checks if objects are same kind of TextBlock
      return false;
    } else {
      for (int i = 0; i < t1Contents.length; i++) {
        if (t1Contents[i].equals(t2Contents[i])) { // checks if contents are the same
          continue;
        } else { // if contents are not the same, return false
          return false;
        } // else
      } // for
    } // else
    return true;
  }// eqv
} // class TBUtils
