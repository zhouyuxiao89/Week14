import java.util.Scanner;
public class DiceTest {

  public static void main(String[] args) {
  	Scanner input = new Scanner(System.in);
  	Dice dice1 = new Dice();
  	Dice dice2 = new Dice();
  	//System.out.println("How many dices do want to roll?\n");
  	//int numberOfDice1 = input.nextInt();
  	//System.out.println("What is the max value of each dice?\n");
  	//int maxValue1 = input.nextInt();
  	Dice.RollDice(2,10);
  	System.out.printf("The times the dice rolled for static method is %d\n\n",dice1.RollCount1());
  	//Dice.RollDice(10, 6);
  	/*
  	System.out.println("How many dices do want to roll?\n");
  	int numberOfDice2 = input.nextInt();
  	System.out.println("What is the max value of each dice?\n");
  	int maxValue2 = input.nextInt();
  	Dice.RollDice(numberOfDice2, maxValue2);
  	System.out.println("How many dices do want to roll?\n");
  	int numberOfDice3 = input.nextInt();
  	System.out.println("What is the max value of each dice?\n");
  	int maxValue3 = input.nextInt();
  	Dice.RollDice(numberOfDice3, maxValue3);
  	*/
  	// =========================================
  	dice2.Roll_1_Dice(); 
  	dice2.Roll_1_Dice();
  	dice2.Roll_1_Dice(); 
  	dice2.Roll_1_Dice();
  	Dice.RollDice(2,10);
  	System.out.printf("The times the dice2 rolled for non-static method is %d\n\n",dice2.RollCount2());
  	System.out.printf("The times the dice1 rolled for static method is %d\n\n",dice1.RollCount1());
  }
}
