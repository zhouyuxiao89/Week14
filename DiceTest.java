import java.util.Scanner;
public class DiceTest {
  
    public static void main(String[] args) {
        	Scanner input = new Scanner(System.in);
          Dice dice1 = new Dice();
        	Dice dice2 = new Dice();
                    
          Dice.RollDice(2,10);
          System.out.printf("The times the dice1 rolled for static method is %d\n\n",dice1.RollCount1());
                                            
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
