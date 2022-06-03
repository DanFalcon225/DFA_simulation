/**
 * A Java application to demonstrate the DFAtable class 
 * by using it to filter the input stream. Those lines
 * that are accepted by DFAtable are echoed to the
 * standard output.
 */

package DFA_diagram;

/**
 * @author Daniils Sokolovs
 * @version 15/12/2021
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DFAtableFilter {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Please enter your word: " + "\n");
		DFAtable table = new DFAtable(); // Creating a second version of DFA
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); // Standard input
		
		String input = bufferedReader.readLine();
		
		// Read and echo lines until EOF
		while (input!=null) {
			table.reset();
			table.process(input);
		      if (table.accepted()) {
		    	  System.out.println("accepted: " + input);
		    	  input = bufferedReader.readLine();
		      }
		      else {
		    	  System.out.println("rejected: " + input);
		    	  input = bufferedReader.readLine();
		    	  
		      }
		    }

	}
}
