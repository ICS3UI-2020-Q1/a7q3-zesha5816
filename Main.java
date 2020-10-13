/**
 * produce a pattern of a random number of asterisks between 1 and 5 along the page
 * @author Ahmad Zeshan
 */
public class Main {
  
	public static void chaotic (int inputvalue){
		for(int i = 1; i <= inputvalue; i++ ){
			int randNum = (int)(Math.random()*(5 - 1 + 1)) + 1; //make the random number
      //make a loop to print out the stars
      for(int j = 0; j < randNum; j++){ 
				//repeat a random number of times between 1 and 5
        //print a star
				System.out.print("*"); 
      }
			//move over one line
      System.out.println(""); 
    }
  }
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // input the numbr of lines
    chaotic(11);
}
}
