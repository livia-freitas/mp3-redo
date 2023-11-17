package lab.polymorphism;

import java.io.PrintWriter;

public class VisualTests {
  public static void main (String[] args) throws Exception{
     // Prepare for input and output
     PrintWriter pen = new PrintWriter(System.out, true);

     // Create blocks to use for the next tests
     TextBlock block = new TextLine("Hello World");
     BoxedBlock box = new BoxedBlock(block);
     HComposition HCompose = new HComposition(block, box);
     VComposition VCompose = new VComposition(block, box);

    /**
    * TRUNCATED TESTS 
    */

    pen.println("\n\n --TRUNCATED TESTS-- \n\n");

     // Create and print a truncated version of a basic TextBlock
     Truncated TB_trunk = new Truncated(block, 14);
     pen.println("\n-> Truncated + Basic TextBlock test:\n");
     TBUtils.print(pen, TB_trunk);

     // Create and print a truncated version of a BoxedBlock
     Truncated box_trunk = new Truncated(box, 9);
     pen.println("\n-> Truncated + BoxedBlock test:\n");
     TBUtils.print(pen, box_trunk);

    // Create and print a truncated version of a horizontal composition
    Truncated HCompose_trunk = new Truncated(HCompose, 14);
    pen.println("\n-> Truncated + HComposition test:\n");
    TBUtils.print(pen, HCompose_trunk);

    // Create and print a truncated version of a vertical composition
    Truncated VCompose_trunk = new Truncated(VCompose, 9);
    pen.println("\n-> Truncated + VComposition test:\n");
    TBUtils.print(pen, VCompose_trunk);
    
    // Truncated block with width 0.
    Truncated empty_trunk = new Truncated(block, 0);
    pen.println("\n-> Truncated + width 0 test:\n");
    TBUtils.print(pen, empty_trunk);

    // Truncated block with larger width than the original block
    Truncated wide_trunk = new Truncated(block, 30); 
    pen.println("\n-> Truncated + larger new width test:\n");
    TBUtils.print(pen, wide_trunk);

    /**
    * CENTERED TESTS 
    */

    pen.println("\n\n --CENTERED TESTS-- \n\n");

     // Create and print a Centered version of a basic TextBlock
     Centered TB_centered = new Centered(block, 30);
     pen.println("\n-> Centered + Basic TextBlock test:\n");
     TBUtils.print(pen, TB_centered);

     // Create and print a Centered version of a BoxedBlock
     Centered box_centered = new Centered(box,29);
     pen.println("\n-> Centered + BoxedBlock test:\n");
     TBUtils.print(pen, box_centered);

     // Create and print a Centered version of a horizontal composition
    Centered HCompose_centered = new Centered(HCompose, 34);
    pen.println("\n-> Centered + HComposition test:\n");
    TBUtils.print(pen, HCompose_centered);

    // Create and print a Centered version of a vertical composition
    Centered VCompose_centered = new Centered(VCompose, 29);
    pen.println("\n-> Centered + VComposition test:\n");
    TBUtils.print(pen, VCompose_centered);
    
    // Centered block with width 0.
    Centered empty_centered = new Centered(block, 0);
    pen.println("\n-> Centered + width 0 test:\n");
    TBUtils.print(pen, empty_centered);

    // Centered block with larger width than the original block
    Centered wide_centered = new Centered(block, 40); 
    pen.println("\n-> Centered + larger new width test:\n");
    TBUtils.print(pen, wide_centered);

    /**
    * RightJustified TESTS 
    */

    pen.println("\n\n --RightJustified TESTS-- \n\n");

     // Create and print a RightJustified version of a basic TextBlock
     RightJustified TB_RightJustified = new RightJustified(block, 30);
     pen.println("\n-> RightJustified + Basic TextBlock test:\n");
     TBUtils.print(pen, TB_RightJustified);

     // Create and print a RightJustified version of a BoxedBlock
     RightJustified box_RightJustified = new RightJustified(box,29);
     pen.println("\n-> RightJustified + BoxedBlock test:\n");
     TBUtils.print(pen, box_RightJustified);

     // Create and print a RightJustified version of a horizontal composition
    RightJustified HCompose_RightJustified = new RightJustified(HCompose, 34);
    pen.println("\n-> RightJustified + HComposition test:\n");
    TBUtils.print(pen, HCompose_RightJustified);

    // Create and print a RightJustified version of a vertical composition
    RightJustified VCompose_RightJustified = new RightJustified(VCompose, 29);
    pen.println("\n-> RightJustified + VComposition test:\n");
    TBUtils.print(pen, VCompose_RightJustified);
    
    // RightJustified block with width 0.
    RightJustified empty_RightJustified = new RightJustified(block, 0);
    pen.println("\n-> RightJustified + width 0 test:\n");
    TBUtils.print(pen, empty_RightJustified);

    // RightJustified block with larger width than the original block
    RightJustified wide_RightJustified = new RightJustified(block, 40); 
    pen.println("\n-> RightJustified + larger new width test:\n");
    TBUtils.print(pen, wide_RightJustified);
 
    /**
    * HorizontallyFlipped TESTS 
    */

    pen.println("\n\n --HorizontallyFlipped TESTS-- \n\n");

     // Create and print a HorizontallyFlipped version of a basic TextBlock
     HorizontallyFlipped TB_HorizontallyFlipped = new HorizontallyFlipped(block);
     pen.println("\n-> HorizontallyFlipped + Basic TextBlock test:\n");
     TBUtils.print(pen, TB_HorizontallyFlipped);

     // Create and print a HorizontallyFlipped version of a BoxedBlock
     HorizontallyFlipped box_HorizontallyFlipped = new HorizontallyFlipped(box);
     pen.println("\n-> HorizontallyFlipped + BoxedBlock test:\n");
     TBUtils.print(pen, box_HorizontallyFlipped);
    
     // Create and print a HorizontallyFlipped version of a horizontal composition
     HorizontallyFlipped HCompose_HorizontallyFlipped = new HorizontallyFlipped(HCompose);
     pen.println("\n-> HorizontallyFlipped + HComposition test:\n");
     TBUtils.print(pen, HCompose_HorizontallyFlipped);
 
     // Create and print a HorizontallyFlipped version of a vertical composition
     HorizontallyFlipped VCompose_HorizontallyFlipped = new HorizontallyFlipped(VCompose);
     pen.println("\n-> HorizontallyFlipped + VComposition test:\n");
     TBUtils.print(pen, VCompose_HorizontallyFlipped);
     
    /**
    * VerticallyFlipped TESTS 
    */

    pen.println("\n\n --VerticallyFlipped TESTS-- \n\n");

     // Create and print a VerticallyFlipped version of a basic TextBlock
     VerticallyFlipped TB_VerticallyFlipped = new VerticallyFlipped(block);
     pen.println("\n-> VerticallyFlipped + Basic TextBlock test:\n");
     TBUtils.print(pen, TB_VerticallyFlipped);

     // Create and print a VerticallyFlipped version of a BoxedBlock
     VerticallyFlipped box_VerticallyFlipped = new VerticallyFlipped(box);
     pen.println("\n-> VerticallyFlipped + BoxedBlock test:\n");
     TBUtils.print(pen, box_VerticallyFlipped);

     // Create and print a VerticallyFlipped version of a horizontal composition
     VerticallyFlipped HCompose_VerticallyFlipped = new VerticallyFlipped(HCompose);
     pen.println("\n-> VerticallyFlipped + HComposition test:\n");
     TBUtils.print(pen, HCompose_VerticallyFlipped);
 
     // Create and print a VerticallyFlipped version of a vertical composition
     VerticallyFlipped VCompose_VerticallyFlipped = new VerticallyFlipped(VCompose);
     pen.println("\n-> VerticallyFlipped + VComposition test:\n");
     TBUtils.print(pen, VCompose_VerticallyFlipped);

     /**
    * SpacedOut TESTS 
    */

    pen.println("\n\n --SpacedOut TESTS-- \n\n");

    // Create and print a SpacedOut version of a basic TextBlock
    SpacedOut TB_SpacedOut = new SpacedOut(block);
    pen.println("\n-> SpacedOut + Basic TextBlock test:\n");
    TBUtils.print(pen, TB_SpacedOut);

    // Create and print a SpacedOut version of a BoxedBlock
    SpacedOut box_SpacedOut = new SpacedOut(box);
    pen.println("\n-> SpacedOut + BoxedBlock test:\n");
    TBUtils.print(pen, box_SpacedOut);

    // Create and print a SpacedOut version of a horizontal composition
    SpacedOut HCompose_SpacedOut = new SpacedOut(HCompose);
    pen.println("\n-> SpacedOut + HComposition test:\n");
    TBUtils.print(pen, HCompose_SpacedOut);

    // Create and print a SpacedOut version of a vertical composition
    SpacedOut VCompose_SpacedOut = new SpacedOut(VCompose);
    pen.println("\n-> SpacedOut + VComposition test:\n");
    TBUtils.print(pen, VCompose_SpacedOut);

    /**
     * TBUtils tests
     */
    
    pen.println("\n\n --TBUtils TESTS-- \n\n");
    pen.println("eq test 1 (different TBs) -> should be false, is " + TBUtils.eq(block, box));
    pen.println("eq test 2 (different TBs) -> should be true, is " + TBUtils.eq(block, block));
    pen.println("eqv test 1 (different TBs) -> should be false, is " + TBUtils.eqv(block, box));
    pen.println("eqv test 2 (same TB) -> should be true, is " + TBUtils.eqv(new Centered(box, 15), new Centered(box, 15)));
    pen.println("equal test 1 (different widths) -> should be false, is " + TBUtils.equal(new Centered(box, 12), new Centered(box, 10)));
    pen.println("equal test 2 (same width) -> should be true, is " + TBUtils.equal(new Centered(box, 12), new Centered(box, 12)));
     
     // Clean up after ourselves.
     pen.close();
  }
}
