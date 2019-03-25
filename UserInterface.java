import java.util.Random;
import java.lang.Integer;
import java.util.Scanner;
 
public class UserInterface {
	
	public static String getUserInput()
	{
		return (new Scanner(System.in)).nextLine();
	}
	
	public static void printOutputText(String outputText)
	{
		System.out.println(outputText);
	}
	
}