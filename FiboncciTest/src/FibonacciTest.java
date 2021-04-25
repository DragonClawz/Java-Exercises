// Fig. 6.13: FibonacciTest.java
// Recursive fibonacci method
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FibonacciTest extends JApplet implements ActionListener {
   JLabel numLabel, resultLabel;
   JTextField num, result;
   JButton calc;

   public void init()
   {
      Container c = getContentPane();
      c.setLayout( new FlowLayout() );

      numLabel = 
         new JLabel( "Enter an integer and press Enter" );
      c.add( numLabel );

      num = new JTextField( 10 );
      num.addActionListener( 
         new ActionListener() {
		public void actionPerformed( ActionEvent e )
   		{  
      			long number, fibonacciValue;

      			number = Long.parseLong( num.getText() );
      			showStatus( "Calculating ..." ); 
      			fibonacciValue = fibonacci( number );
      			showStatus( "Done." );   
      			result.setText( Long.toString( fibonacciValue ) );
	  	}
	    }
	);
      c.add( num );

      resultLabel = new JLabel( "Fibonacci value is" );
      c.add( resultLabel );

      result = new JTextField( 15 );
      result.setEditable( false );
      c.add( result );

      calc = new JButton("Calculate");
      c.add(calc);
      calc.addActionListener( 
      	new ActionListener() {
      		public void actionPerformed(ActionEvent e) {
      			JOptionPane.showMessageDialog(null, "Hello!");
      		}
      	}
      
      );

   }

   public void actionPerformed(ActionEvent e) {}
  
   // Recursive definition of method fibonacci
   public long fibonacci( long n )
   {
      if ( n == 0 || n == 1 )  // base case
         return n;
      else
         return fibonacci( n - 1 ) + fibonacci( n - 2 );
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
