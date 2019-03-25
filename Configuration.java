import java.util.Random;
 
public class Configuration {
	static final int randomNumberLimit = 300;
	
	static final int inputStop = -2;
	
	static final int outputTooSmall = -1;
	static final int outputRight = 0;
	static final int outputTooBig = 1;

	
	static final String inputStopText = "stop";
	
	static final String outputTooSmallText = "Too small!";
	static final String outputRightText = "Right guess!";
	static final String outputTooBigText = "Too big!";
	static final String outputEnterNumberText = "Enter number between 0 and " + randomNumberLimit;
	static final String outputCounterText = "Number of tries: ";
	
	static final int errorWrongInput = -3;
	static final int errorRange = -4;

	static final String errorWrongInputText = "I cannot understand the input :( .";
	

	

}