import java.util.Random;

public class Dice 
{
	Random random = new Random();
	
	public int num1;
	public int num2;
	
	public Dice(int Num1, int Num2)
	{
		num1 = Num1;
		num2 = Num2;
	}
	
	public int Throw()
	{
		num2 = random.nextInt(6)+1;
		return num2;
	}
}
