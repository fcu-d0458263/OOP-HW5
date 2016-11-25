package fcu.iecs.oop.pokemon;
import java.util.Random;

public class GYM {
	
	public static void fight(Pokemon p1, Pokemon p2){
		Random ran = new Random();
		int who =  ran.nextInt(2);
		if(who == 1){
			System.out.println("Winner is : "+p1.getName());
			p1.setCp(p1.getCp()+500);
		}
		else{
			System.out.println("Winner is : "+p2.getName());
			p2.setCp(p2.getCp()+500);
		}
	}
}
