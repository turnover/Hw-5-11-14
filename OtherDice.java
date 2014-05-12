public class OtherDice extends Dice
{
	public OtherDice(int Num1, int Num2)
	{
		super(Num1,Num2);
	}
	
	public int Throw()
	{
		for(int x=3; x>0; x--)
		{
			num2 = num2 + super.Throw();
		}
		num2 = num2/3;
		return num2;
	}
}
