import java.util.*;
public class Rock_Paper_Scissors {

	public static void main(String[] args) {
		String[] choice = {"Rock","Paper", "Scissors"};
		System.out.println("Welcome to your favourite game - Rock, Paper & Scissors"+"\n"+"I'm your machine");
		System.out.println("Are you ready to play ?");
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		if(s.toLowerCase().equals("yes")) {
			System.out.println("\n"+"Let's Start :)");
			String a;
			int b;
		
			do {
				System.out.println("\n"+"Ready 1..2..3..go ");
				a=input.nextLine();
				Random r = new Random();
				b=r.nextInt(choice.length);
				System.out.println("Your Choice: "+a+"\t"+"My Choice: "+choice[b]);
				if(a.equals(choice[b])){
				System.out.println("Woah! Too close...");
				}
			
			}while(a.equals(choice[b])); 
		
			if(a.equals("Rock") && choice[b].equals("Paper")) {
				System.out.println("Hey! I'm the winner... :)");
				System.out.println("Better Luck next time");
			}
			else if(a.equals("Rock") && choice[b].equals("Scissors")) {
				System.out.println("OMG! You're the winner... :("+"\n"+"Well Played");
				System.out.println("I'll try my best next time");
			}
			else if(a.equals("Scissors") && choice[b].equals("Rock")) {
				System.out.println("Hey! I'm the winner... :)");
				System.out.println("Better Luck next time");
			}
			else if(a.equals("Scissors") && choice[b].equals("Paper")) {
				System.out.println("OMG! You're the winner... :( Well Played");
				System.out.println("I'll try my best next time");
			}
			else if(a.equals("Paper") && choice[b].equals("Scissors")) {
				System.out.println("Hey! I'm the winner... :)");
				System.out.println("Better Luck next time");
			}
			else if(a.equals("Paper") && choice[b].equals("Rock")){
				System.out.println("OMG! You're the winner... :( Well Played");
				System.out.println("I'll try my best next time");
			}
			else {
				System.out.println("You entered wrong choice. Sorry we cannot continue :(");
			}
		}
		else {
			System.out.println("Sorry to see you go :(");
		}
	}
}


	
