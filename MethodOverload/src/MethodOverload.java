// Fig. 6.16: MethodOverload.java
// Using overloaded methods
import java.awt.Container;
import javax.swing.*;

public class MethodOverload extends JApplet {
   JTextArea outputArea;

   public void init()
   {
      outputArea = new JTextArea( 2, 20 );
      Container c = getContentPane();
      c.add( outputArea );

      outputArea.setText(
         "The square of integer 7 is " + square( 7 ) +
         "\nThe square of double 7.5 is " + square( 7.5 ) );
   }
   
   public int square( int x )
   {
      return x * x;
   }
   
   public double square( double y )
   {
      return y * y;
   }
}

/**************************************************************************
 * (C) Copyright 1999 by Deitel & Associates, Inc. and Prentice Hall.     *
 * All Rights Reserved.                                                   *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
