// Fig. 6.10: Scoping.java
// A scoping example
import java.awt.Container;
import javax.swing.*;

public class Scoping extends JApplet {
   JTextArea outputArea;
   int x = 1;      // instance variable

   public void init()
   {
      outputArea = new JTextArea();
      Container c = getContentPane();
      c.add( outputArea );
   }

   public void start()
   {
      int x = 5;   // variable local to method start

      outputArea.append( "local x in start is " + x );

      methodA();   // methodA has automatic local x
      methodB();   // methodB uses instance variable x
      methodA();   // methodA reinitializes automatic local x
      methodB();   // instance variable x retains its value

      outputArea.append( "\n\nlocal x in start is " + x );
   }

   public void methodA() //¬
   {
      int x = 25;  // initialized each time a is called

      outputArea.append( "\n\nlocal x in methodA is " + x +
                          " after entering methodA" );
      ++x;
      outputArea.append( "\nlocal x in methodA is " + x +
                          " before exiting methodA" );
   }

   public void methodB()
   {
      outputArea.append( "\n\ninstance variable x is " + x +
                          " on entering methodB" );
      x *= 10;
      outputArea.append( "\ninstance variable x is " + x +
                          " on exiting methodB" );
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
