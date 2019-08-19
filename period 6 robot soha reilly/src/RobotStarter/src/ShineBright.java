import java.util.Scanner;
import kareltherobot.Directions;
import kareltherobot.Robot;
import kareltherobot.World;
public class ShineBright  implements Directions{
	public static void main(String[] args) {
		World.setSize(20,20 );
		World.setVisible(true);
		World.setDelay(10);
		Robot bot = new Robot(5,1,North,30);
		for (int i = 0; i < 4; i++) {
		for (int x = 0; x < 4; x++)	{			
			bot.move();
			bot.turnLeft();
			bot.turnLeft();
			bot.turnLeft();
			bot.move();
			bot.putBeeper();
			bot.turnLeft();	
			}
		bot.turnLeft();
		bot.turnLeft();
		bot.turnLeft();
		int x = 0;
		}
		bot.move();
	}

}

