
class NumberGuesserMain {
	
  public static void main(String[] args) {
	  
	(new NumberGuesser((new RandomNumber(Configuration.randomNumberLimit)).getValue())).play();
	
  }
}