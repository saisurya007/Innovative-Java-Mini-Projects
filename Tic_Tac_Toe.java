import java.util.*;
public class Tic_Tac_Toe {

	
	public static void main(String[] args) {
		
		Tic_Tac_Toe p = new Tic_Tac_Toe();
		String[] a = {" "," "," "," "," "," "," "," "," "};
		System.out.println("Welcome to the game - Tic Tac Toe\n\n");
		Scanner n = new Scanner(System.in);
		System.out.println("Shall we play? \n");
		String m = n.nextLine();
		if(m.toLowerCase().equals("yes")) {
			
		System.out.println("Players 1 and 2 - Be Ready :) "+"\n\n\n");
				
	    System.out.println("Player (1)"+" mark - X"+"\t"+" &  Player (2)"+" mark - O"+"\n\n\n");
	    System.out.println("Warning! Don't choose already occupied positions. You'll get penalized... "+"\n\n\n");
		p.board(a);
	    int q =1;
	    //Key Logic for the Game to Proceed
		while (p.Check_Winner(a)==false && q <= 5 ) {
			System.out.println("Player 1 - Select a position: \n");
			int a1 =n.nextInt();
			if(a[a1].equals(" ")) 
			{
				a[a1]="X";
				p.board(a);	
			}
			else
			{
				System.out.println("OMG! Apologies, you are penalized for choosing the same position as your opponenet. Choose wisely... \n" );
			}
						
			if(q<5) {
			System.out.println("Player 2 - Now select a position: \n");
			int b3 = n.nextInt();
			
			if(a[b3].equals(" ")) {
				a[b3]="O";
				p.board(a);	
			}
			else
			{
				System.out.println("OMG! Apologies, you are penalized for choosing the same position as your opponenet. Choose wisely... \n" );
			}}
				q++;		
			}
		if(p.Check_Winner(a)==false) {
			System.out.println("\n\nCongratulations both of you. Very tight game. No Winner. No Loser");
			
		}
			
			}
	else {
		System.out.println("\n\n\nSo sad to see you leave :( ");
	}
	}
	//Checking the Game Status
	public boolean Check_Winner(String a[]) {
		if((a[0].equals("X")) && a[1].equals("X")&&(a[2].equals("X"))){
			System.out.println("Player 1 is the winner");
			return true;
		}
		else if((a[3].equals("X")) && a[4].equals("X")&&(a[5].equals("X"))) {
			System.out.println("Player 1 is the winner");
			return true;
		}
		else if((a[6].equals("X")) && a[7].equals("X")&&(a[8].equals("X"))) {
			System.out.println("Player 1 is the winner");
			return true;
		}
		
		else if((a[0].equals("X")) && a[3].equals("X")&&(a[6].equals("X"))) {
			System.out.println("Player 1 is the winner");
			return true;
		}
		else if((a[1].equals("X")) && a[4].equals("X")&&(a[7].equals("X"))) {
			System.out.println("Player 1 is the winner");
			return true;
		}
		else if((a[2].equals("X")) && a[5].equals("X")&&(a[8].equals("X"))) {
			System.out.println("Player 1 is the winner");
			return true;
		}
		
		else if((a[0].equals("X")) && a[4].equals("X")&&(a[8].equals("X"))) {
			System.out.println("Player 1 is the winner");
			return true;
		}
		else if((a[2].equals("X")) && a[4].equals("X")&&(a[6].equals("X"))) {
			System.out.println("Player 1 is the winner");
			return true;
		}
		else if((a[0].equals("O")) && a[1].equals("O")&&(a[2].equals("O"))){
			System.out.println("Player 2 is the winner");
			return true;
		}
		else if((a[3].equals("O")) && a[4].equals("O")&&(a[5].equals("O"))) {
			System.out.println("Player 2 is the winner");
			return true;
		}
		else if((a[6].equals("O")) && a[7].equals("O")&&(a[8].equals("O"))) {
			System.out.println("Player 2 is the winner");
			return true;
		}
		
		else if((a[0].equals("O")) && a[3].equals("O")&&(a[6].equals("O"))) {
			System.out.println("Player 2 is the winner");
			return true;
		}
		else if((a[1].equals("O")) && a[4].equals("O")&&(a[7].equals("O"))) {
			System.out.println("Player 2 is the winner");
			return true;
		}
		else if((a[2].equals("O")) && a[5].equals("O")&&(a[8].equals("O"))) {
			System.out.println("Player 2 is the winner");
			return true;
		}
		
		else if((a[0].equals("O")) && a[4].equals("O")&&(a[8].equals("O"))) {
			System.out.println("Player 2 is the winner");
			return true;
		}
		else if((a[2].equals("O")) && a[4].equals("O")&&(a[6].equals("O"))) {
			System.out.println("Player 2 is the winner");
			return true;
		}
		else {
			return false;
			
		}
		
				
	}
	//Displaying the Visual Board
	public void board(String[] a) {
		
	    System.out.println("  "+a[0]+" "+"|"+"  "+a[1]+" "+"|"+"   "+a[2]);
	    System.out.println(" ___"+"|"+"____"+"|"+"____");
	    System.out.println("  "+a[3]+" "+"|"+"  "+a[4]+" "+"|"+"   "+a[5]);
	    System.out.println(" ___"+"|"+"____"+"|"+"____");
	    System.out.println("  "+a[6]+" "+"|"+"  "+a[7]+" "+"|"+"   "+a[8]);
	    System.out.println("    "+"|"+"    "+"|"+"    ");
	  	}

}
