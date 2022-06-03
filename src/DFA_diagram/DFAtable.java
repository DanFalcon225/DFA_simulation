/**
 * Current class aim to represent a simulation of deterministic finite automaton - DFA 
 * which was created in a group part
 * 
 * DFA aim to accept the below language with specified subword 
 * 
 *  ∑ = {E,G,L,O,X}
 *	L = {w ∈ Σ* : w contains sub word with any number of Os between G in front and GLE at the back of the sub word}
 */

package DFA_diagram;

/**
 * @author Daniils Sokolovs - ID: 18019262
 * @version 15/12/2021
 */


public class DFAtable {
	
	
  /** 
   * Constants q0 through q4 represent states, and
   * a private int holds the current state code.
   */
	  private static final int q0 = 0;
	  private static final int q1 = 1;
	  private static final int q2 = 2;
	  private static final int q3 = 3;
	  private static final int q4 = 4;

	  private int state;
	  
	  /**
	   *  The transition function implemented as a 
	   *  two-dimensional array
	   */

	  static private int[][] delta =
		  //E, G, L, O, X ---->letters
		  //0, 1, 2, 3, 4 ---->indexes
		  {{q0,q1,q0,q0,q0}, //0
		   {q0,q2,q0,q1,q0}, //1
		   {q0,q2,q3,q1,q0}, //2
		   {q4,q1,q0,q0,q0}};//3
		
	  /**
	   * Reset the current state to the start state.
	   */
	  public void reset() {
	    state = q0;
	  }
	  
	  /**
	   * Make one transition on each char in the given
	   * string.
	   * Referring to the two-dimensional array table to present each transition within each state 
	   * @param in the String to use
	   */
	  
	  public void process(String in) {
		  for(int i=0; i<in.length(); i++) {
			  char c = in.charAt(i); // getting current character based on inputed word
	
			  try {
				  
				  //------------------------------------------------------------------------------------
				  //------------------------------------------------------------------------------------
				  if(c == 'E') {
					  if(state == 0) {
						  state = delta[state][0];
					  }
					  else if(state == 1) {
						  state = delta[state][0];
					  }
					  else if(state == 2) {
						  state = delta[state][0];
					  }
					  else if(state == 3) {
						  state = delta[state][0];
					  }
				  }
				  
				  //------------------------------------------------------------------------------------
				  //------------------------------------------------------------------------------------
				  else if(c == 'G') {
					  if(state == 0) {
						  state = delta[state][1];
					  }
					  else if(state == 1) {
						  state = delta[state][1];
					  }
					  else if(state == 2) {
						  state = delta[state][1];
					  }
					  else if(state == 3) {
						  state = delta[state][1];
					  }
				  }
				  
				  //------------------------------------------------------------------------------------
				  //------------------------------------------------------------------------------------
				  else if(c == 'L') {
					  if(state == 0) {
						  state = delta[state][2];
					  }
					  else if(state == 1) {
						  state = delta[state][2];
					  }
					  else if(state == 2) {
						  state = delta[state][2];
					  }
					  else if(state == 3) {
						  state = delta[state][2];
					  }
				  }
				  
				  //------------------------------------------------------------------------------------
				  //------------------------------------------------------------------------------------
				  else if(c == 'O') {
					  if(state == 0) {
						  state = delta[state][3];
					  }
					  else if(state == 1) {
						  state = delta[state][3];
					  }
					  else if(state == 2) {
						  state = delta[state][3];
					  }
					  else if(state == 3) {
						  state = delta[state][3];
					  }
				  }
				  
				  //------------------------------------------------------------------------------------
				  //------------------------------------------------------------------------------------
				  else if(c == 'X') {
					  if(state == 0) {
						  state = delta[state][4];
					  }
					  else if(state == 1) {
						  state = delta[state][4];
					  }
					  else if(state == 2) {
						  state = delta[state][4];
					  }
					  else if(state == 3) {
						  state = delta[state][4];
					  }
				  }
			  	} catch (ArrayIndexOutOfBoundsException ex) {
			  		
			  	}

			  	
		  }
	  }
	  
	  
	  /**
	   * Test whether the DFA accepted the string.
	   * @return true if the final state was accepted
	   */
	  public boolean accepted() {
		    return state == q4;
		  }
	  
	  

	  
	 
}
