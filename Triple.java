
public class TripleDice extends Dice{
  private static int RollCount = 0;
  public static int RollDice(int DiceNumber, int Max) {
  	DiceNumber = 3;
  	int dice;
  	dice = 1 + (int) (Math.random() * Max * DiceNumber);
  	RollCount = RollCount + DiceNumber;
  	return dice;
  }
}

