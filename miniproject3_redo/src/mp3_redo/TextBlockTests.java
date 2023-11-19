package mp3_redo;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


/**
 * Author: Livia Stein Freitas 
 * JUnit tests of each TextBlock I implemented.
 */

public class TextBlockTests {

  TextBlock block = new TextLine("Hello World");
  TextBlock differentBlock = new TextLine("Hello World!");
  BoxedBlock box = new BoxedBlock(block);
  BoxedBlock otherBox = new BoxedBlock(block);
  BoxedBlock differentBox = new BoxedBlock(differentBlock);
  HComposition HCompose = new HComposition(block, box);
  VComposition VCompose = new VComposition(block, box);
  Truncated Trunk = new Truncated(box, 5);
  Centered Center = new Centered(block, 13);
  RightJustified RJ = new RightJustified(block, 13);
  HorizontallyFlipped HF = new HorizontallyFlipped(box);
  VerticallyFlipped VF = new VerticallyFlipped(box);
  SpacedOut SO = new SpacedOut(block);

  /* Checks that Truncated works properly. */
  @Test
  public void TruncatedTest() throws Exception {
    assertEquals(Trunk.width(), 5, "Truncated: width");
    assertEquals(Trunk.height(), 3, "Truncated: height");
    assertEquals(Trunk.row(1), "|Hell", "Truncated: row(i)");
  }

  /* Checks that Centered works properly. */
  @Test
  public void CenteredTest() throws Exception {
    assertEquals(Center.width(), 13, "Centered: width");
    assertEquals(Center.height(), 1, "Centered: height");
    assertEquals(Center.row(0), " Hello World ", "Centered: row(i)");
  }

  /* Checks that RightJustified works properly. */
  @Test
  public void RightJustifiedTest() throws Exception {
    assertEquals(RJ.width(), 13, "RightJustified: width");
    assertEquals(RJ.height(), 1, "RightJustified: height");
    assertEquals(RJ.row(0), "  Hello World", "RightJustified: row(i)");
  }

  /* Checks that HorizontallyFlipped works properly. */
  @Test
  public void HorizontallyFlippedTest() throws Exception {
    assertEquals(HF.width(), 13, "HorizontallyFlipped: width");
    assertEquals(HF.height(), 3, "HorizontallyFlipped: height");
    assertEquals(HF.row(1), "|dlroW olleH|", "HorizontallyFlipped: row(i)");
  }

  /* Checks that VerticallyFlipped works properly. */
  @Test
  public void VerticallyFlippedTest() throws Exception {
    assertEquals(VF.width(), 13, "VerticallyFlipped: width");
    assertEquals(VF.height(), 3, "VerticallyFlipped: height");
    assertEquals(VF.row(1), "|Hello World|", "VerticallyFlipped: row(i)");
  }

  /* Checks that SpacedOut works properly. */
  @Test
  public void SpacedOutTest() throws Exception {
    assertEquals(SO.width(), 11, "SpacedOut: width");
    assertEquals(SO.height(), 1, "SpacedOut: height");
    assertEquals(SO.row(0), "H e l l o   W o r l d ", "SpacedOut: row(i)");
  }

  /* Checks that equal() works properly. */
  @Test
  public void equalTest() throws Exception {
    assertTrue("equal(): same object", TBUtils.equal(box, box));
    assertTrue("equal(): equivalent object", TBUtils.equal(box, otherBox));
    assertFalse("equal(): different objects, different classes", TBUtils.equal(box, block));
    assertFalse("equal(): different objects, same class", TBUtils.equal(box, differentBox));
  }

  /* Checks that eqv() works properly. */
  @Test
  public void eqvTest() throws Exception {
    assertTrue("eqv(): same object", TBUtils.eqv(box, box));
    assertTrue("eqv(): equivalent object", TBUtils.eqv(box, otherBox));
    assertFalse("eqv(): different objects, different classes", TBUtils.eqv(box, block));
    assertFalse("eqv(): different objects, same class", TBUtils.eqv(box, differentBox));
  }

  /* Checks that eq() works properly. */
  @Test
  public void eqTest() throws Exception {
    assertTrue("eq(): same object", TBUtils.eq(box, box));
    assertFalse("eq(): equivalent object", TBUtils.eq(box, otherBox));
    assertFalse("eq(): different objects, different classes", TBUtils.eq(box, block));
    assertFalse("eq(): different objects, same class", TBUtils.eq(box, differentBox));
  }
}
