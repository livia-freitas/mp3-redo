package mp3_redo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


/**
 * Author: Livia Stein Freitas
 * JUnit tests of each TextBlock I implemented.
 */

public class TextBlockTests {

  TextBlock block = new TextLine("Hello World");
  TextBlock differentBlock = new TextLine("Hello World");
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
  
  @Test
  public void TruncatedTest() throws Exception{
    assertEquals(Trunk.width(), 5, "Truncated: width");
    assertEquals(Trunk.height(), 3, "Truncated: height");
    assertEquals(Trunk.row(1), "|Hell", "Truncated: row(i)");
  }

  @Test
  public void CenteredTest() throws Exception{
    assertEquals(Center.width(), 13, "Centered: width");
    assertEquals(Center.height(), 1, "Centered: height");
    assertEquals(Center.row(0), " Hello World ", "Centered: row(i)");
  }

  @Test
  public void RightJustifiedTest()throws Exception{
    assertEquals(RJ.width(), 13, "RightJustified: width");
    assertEquals(RJ.height(), 1, "RightJustified: height");
    assertEquals(RJ.row(0), "  Hello World", "RightJustified: row(i)");
  }

  @Test
  public void HorizontallyFlippedTest()throws Exception{
    assertEquals(HF.width(), 13, "HorizontallyFlipped: width");
    assertEquals(HF.height(), 3, "HorizontallyFlipped: height");
    assertEquals(HF.row(1), "|dlroW olleH|", "HorizontallyFlipped: row(i)");
  }

  @Test
  public void VerticallyFlippedTest()throws Exception{
    assertEquals(VF.width(), 22, "VerticallyFlipped: width");
    assertEquals(VF.height(), 1, "VerticallyFlipped: height");
    assertEquals(VF.row(0), "|Hello World|", "VerticallyFlipped: row(i)");
  }

  @Test
  public void SpacedOutTest()throws Exception{
    assertEquals(SO.width(), 13, "SpacedOut: width");
    assertEquals(SO.height(), 3, "SpacedOut: height");
    assertEquals(SO.row(1), "H e l l o  W o r l d ", "SpacedOut: row(i)");
  }

  @Test
  public void equalTest() throws Exception{
    assertEquals(true, TBUtils.equal(box, box), "equal(): same object");
    assertEquals(true, TBUtils.equal(box, otherBox), "equal(): equivalent object");
    assertEquals(false, TBUtils.equal(box, block), "equal(): different objects, different classes");
    assertEquals(false, TBUtils.equal(box, differentBox), "equal(): different objects, same class");
  }

  @Test
  public void eqvTest() throws Exception{
    assertEquals(true, TBUtils.eqv(box, box), "eqv(): same object");
    assertEquals(true, TBUtils.eqv(box, otherBox), "eqv(): equivalent object");
    assertEquals(false, TBUtils.eqv(box, block), "eqv(): different objects, different classes");
    assertEquals(false, TBUtils.eqv(box, differentBox), "eqv(): different objects, same class");
  }

  @Test
  public void eqTest() throws Exception{
    assertEquals(true, TBUtils.eq(box, box), "eq(): same object");
    assertEquals(false, TBUtils.eq(box, otherBox), "eq(): equivalent object");
    assertEquals(false, TBUtils.eq(box, block), "eq(): different objects, different classes");
    assertEquals(false, TBUtils.eq(box, differentBox), "eq(): different objects, same class");
  }
}
