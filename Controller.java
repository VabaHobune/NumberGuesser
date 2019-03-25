import java.lang.Integer;

class Controller {
	
	public static void outputData(int outputType)
	{
		String userOutput = "";
		switch(outputType) {
			case Configuration.outputRight:
				userOutput = Configuration.outputRightText;
				break;
			case Configuration.outputTooSmall:
				userOutput = Configuration.outputTooSmallText;
				break;
			case Configuration.outputTooBig:
				userOutput = Configuration.outputTooBigText;
				break;
			default:
				userOutput = Configuration.errorWrongInputText;
		}
		UserInterface.printOutputText(userOutput);
	}
	
	public static int getPreparedInput()
	{
		int number = Configuration.inputStop;
		String input = UserInterface.getUserInput();
		try{
			number = Integer.parseInt(input);
		}catch (NumberFormatException ex) {
			switch(input) {
				case Configuration.inputStopText:
					break;
				default:
					number = Configuration.errorWrongInput;
					break;
			}
		}
		return number;		
	}

}