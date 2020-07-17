import java.util.Scanner;

public class Connect_Four {

public static void main(String[] args) {
		
		Connect_Four p = new Connect_Four();
		char[] n = new char[42];
		for(int i=0;i<42;i++) {
			n[i]='0';
		}
		System.out.println("Welcome to the game - Connect_Four\n\n");
		Scanner in = new Scanner(System.in);
		System.out.println("Shall we play? \n");
		String m = in.nextLine();
		if(m.toLowerCase().equals("yes")) {
			
		System.out.println("Players 1 and 2 - Be Ready :) "+"\n\n\n");
				
	    System.out.println("Player (1)"+" mark - X"+"\t"+" &  Player (2)"+" mark - O"+"\n\n\n");
	    System.out.println("Warning! Don't choose already occupied positions. You'll get penalized... "+"\n\n\n");
		p.board(n);
	    int q =1;
	    //Key Logic for play to proceed
		while (p.Check_Winner(n)==false && q <= 21 ) {
			System.out.println("Player 1 - Select a position: \n");
			int a =in.nextInt();
			if(n[a]=='0') 
			{
				n[a]='X';
				p.board(n);	
			}
			else
			{
				System.out.println("OMG! Apologies, you are penalized for choosing the same position as your opponenet. Choose wisely... \n" );
			}
						
			if(p.Check_Winner(n)==false) {
			System.out.println("Player 2 - Now select a position: \n");
			int b = in.nextInt();
			
			if(n[b]=='0') {
				n[b]='O';
				p.board(n);	
			}
			else
			{
				System.out.println("OMG! Apologies, you are penalized for choosing the same position as your opponenet. Choose wisely... \n" );
			}}
				q++;		
			}
		if(p.Check_Winner(n)==false) {
			System.out.println("\n\nCongratulations both of you. Very tight game. No Winner. No Loser");
			
		}
			
			}
	else {
		System.out.println("\n\n\nSo sad to see you leave :( ");
	}
	}
	//Checking for Status
	public boolean Check_Winner(char n[]) {
		int i = 41;
		while(i>=0 )
		{
		   if(n[i]=='X' && n[i-1]=='X'&& n[i-2]=='X' && n[i-3]=='X')
			{
				System.out.println("Player 1 is the winner");
				return true;		
			}
			else if(n[i]=='X' && n[i-7]=='X'&& n[i-14]=='X' && n[i-21]=='X') {
				System.out.println("Player 1 is the winner");
				return true;
			}
			else if(n[i]=='X' && n[i-6]=='X'&& n[i-12]=='X' && n[i-18]=='X') {
				System.out.println("Player 1 is the winner");
				return true;
			}
			else if(n[i]=='X' && n[i-8]=='X'&& n[i-16]=='X' && n[i-24]=='X') {
				System.out.println("Player 1 is the winner");
				return true;
			}
			
			else if(n[i]=='O' && n[i-1]=='O'&& n[i-2]=='O' && n[i-3]=='O')
			{
				System.out.println("Player 2 is the winner");
				return true;
					
			}
			else if(n[i]=='O' && n[i-7]=='O'&& n[i-14]=='O' && n[i-21]=='O') {
				System.out.println("Player 2 is the winner");
				return true;
			}
			else if(n[i]=='O' && n[i-6]=='O'&& n[i-12]=='O' && n[i-18]=='O') {
				System.out.println("Player 2 is the winner");
				return true;
			}
			else if(n[i]=='O' && n[i-8]=='O'&& n[i-16]=='O' && n[i-24]=='O') {
				System.out.println("Player 2 is the winner");
				return true;
			
			}
		   i--;
		  }
			return false;
		
		
	}
	// Displaying the Visual Board
	public void board(char[] a) {
		
		int i=-1,k=0;
		  while(k<6) {
			  System.out.println("  "+a[++i]+" "+"|"+"  "+a[++i]+" "+"|"+"  "+a[++i]+" "+"|"+"  "+a[++i]+" "+"|"+"  "+a[++i]+" "+"|"+"  "+a[++i]+" "+"|"+"  "+a[++i]+" ");
			   
			    if(k!=5) {
			    	System.out.println(" ___"+"|"+"____"+"|"+"____"+"|"+"____"+"|"+"____"+"|"+"____"+"|"+"____");
			    }
			    else if(k==5) {
			    	System.out.println("    "+"|"+"    "+"|"+"    "+"|"+"    "+"|"+"    "+"|"+"    "+"|"+"    ");
				   
			    }
			    k++;
		  }    
	}

}

