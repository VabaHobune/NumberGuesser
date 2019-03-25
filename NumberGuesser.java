import java.lang.Integer;

class NumberGuesser {
	private int generatedNumber;
	private int counter = 0;
 
	public NumberGuesser(int generated)
	{
		generatedNumber = generated;
	}
	
	public void play()
	{
		int comparisonResult = 0;
		int input = 0;
		while(true)
		{
			counter++;
			UserInterface.printOutputText(Configuration.outputEnterNumberText);
			input = Controller.getPreparedInput();
			if(input == Configuration.inputStop){
				break;
			}
			comparisonResult = playRound(input);
			Controller.outputData(comparisonResult);
			if(comparisonResult == Configuration.outputRight){
				break;
			}
		}
		UserInterface.printOutputText(Configuration.outputCounterText + counter);
	}
	
	public int playRound(int guess)
	{
		int error = isCorrectNumber(guess);
		if(error != 0){
			return error;
		}
		return Integer.compare(guess, generatedNumber);

	}
	
		
	static int isCorrectNumber(int number)
	{
		if (number >= 0 && number <= Configuration.randomNumberLimit) {		
			return 0;
		}
		return Configuration.errorWrongInput;
	}
	
}