/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  PiSolver.java
 *  Purpose       :  Monte Carlo Simulation of throwing darts and calculating estimate of PI
 *  Author        :  B.J. Johnson
 *  Date          :  2020-01-26
 *  Description   :  See purpose
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision Histor
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2020-01-26  Dr. Johnson   Initial writing and release
 *  @version 1.0.1  2022-09-16  Dr. Johnson   Added more comments to facilitate use as class example
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class PiSolver {

   private int maxCount = 0;

   public PiSolver() {
      super();
   }

  // this is a method to 'throw' a single dart and return its
  //  distance from the origin
   public double dartThrow() {
      double xValue      = Math.random();          // Initialize
      double yValue      = Math.random();          // Initialize
      double distance    = 0.0;                    // Initialize

     // center of shape is at (0,0) so we need to make sure to
     //  RANDOMLY create some negative values of X and Y
      if( 1 == Math.round( Math.random() ) ) {
         xValue *= -1;
      }
      if( 1 == Math.round( Math.random() ) ) {
         yValue *= -1;
      }
      return Math.sqrt( (xValue * xValue) + (yValue * yValue) );
   }

  // here is the 'main', the entry point to the program.
  //  first, check to ensure there is an argument on the command line
   public static void main( String args[] ) {
      if( 0 == args.length ) {
         System.out.println( "\n\n   Sorry, you must enter the number of darts to throw." );
         System.out.println( "   Please try again with an integer number.\n\n" );
         System.exit( 0 );
      }

     // we must instantiate the class into an object WITHIN the 'main()'
     //  we then use a 'try-catch' to convert the command line argument to
     //  an int; note the 'ps.maxCount' which is the way to access the field
     //  called 'maxCount' in the instantiated object called 'ps'
      PiSolver ps = new PiSolver();
      try {
         ps.maxCount = Integer.parseInt( args[0] );
      }
      catch( NumberFormatException nfe ) {
         System.out.println( "\n\n   Sorry, you must enter the number of darts to throw." );
         System.out.println( "   Please try again with an integer number.\n\n" );
         System.exit( 0 );
      }

     // here is the programming loop
     //  for the total number of darts thrown:
     //     call the dartThrow() method to calculate a dart's distance from center
     //     if distance is less than or equal to 1.0 it's inside the circle of radius 1.0
      int i = -1;
      System.out.print( "\n   Throwing " + ps.maxCount + " darts to estimate PI ~ expected 3.1415927: " );
      int insideCount = 0;
      while( ++i < ps.maxCount ) {
         if( 1.0 >= ps.dartThrow() ) {
            insideCount++;
         }
      }

     // the calculation estimate is just the inside count divided by the number thrown
     //  note the '(double)' casting to insure precision is not lost
      System.out.println( " Calculated PI to be: " + (((double)insideCount / (double)ps.maxCount) * 4) );
   }
}
