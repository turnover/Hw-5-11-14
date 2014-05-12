
public class MainDice 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Dice dice = new Dice(3,4);
		OtherDice OthDice = new OtherDice(4,5);
		
		System.out.println(dice.Throw());
		System.out.println(OthDice.Throw());
	}

}

// Please rework with TriDice and TrippleDice classes
