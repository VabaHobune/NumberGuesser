import java.util.Random;
 
public class RandomNumber {
	private int value;

	public RandomNumber(int periodEnd)
	{
		value = generate(periodEnd);
	}
	
	public int getValue()
	{
		return value;
	}
 
	private static int generate(int periodEnd) {
		Random randomGenerator = new Random();
		return randomGenerator.nextInt(periodEnd) + 1;
	}
	
}