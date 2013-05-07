
public class Dice {
    private static int RollCount1;
      private  int RollCount2;
      
        public Dice() {
            	RollCount1 = 0;
                	RollCount2 = 0;
        }
        
          public static int RollDice(int DiceNumber, int Max) {
              	int dice;
                  	dice = 1 + (int) (Math.random() * Max * DiceNumber);
                      	RollCount1 = RollCount1 + DiceNumber;
                          	return dice;
          }
          
            public static  int RollCount1() {
                	return RollCount1;
            }
              public int RollCount2() {
                  	return RollCount2;
              }
                public int Roll_1_Dice() {
                    	int computerNum;
                        	computerNum = 1 + (int) (Math.random() * 6);
                            	RollCount2 ++;
                                	return computerNum;
                }
}

