package studio2;
import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("What's the start amount? ");
		double startAmount=in.nextDouble();
		System.out.print("What's the win limit? ");
		double winLimit=in.nextDouble();
		double expectedRuin; 
		System.out.println("What's the winChance");
		double winChance=in.nextDouble(); 
		int totalSimulations; 
		

		while(startAmount < winLimit || startAmount <= 0) {
			
		
	
			if(Math.random()< winChance) { 
				System.out.println("success!");
				
				startAmount++;
			}
		
			else { 
				System.out.println("ruin!");
				startAmount--;
			}
		
			
		}
	
	
	}		
	
}
	


