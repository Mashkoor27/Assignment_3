import java.util.*;

class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser kindly guess the number");
		guessNum=scan.nextInt();
				
		if(guessNum>9 || guessNum<0)
		{
			System.out.println("Please Guess the number between 1-9");
			guessNum();
			
		}
		return guessNum;
	}	
}
//-----------------------------------------------------------------------------
class Player1
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		int Password=1234;
		System.out.println("Player 1 Please Enter valid the Password ");
		int Pword=scan.nextInt();
		if(Pword==Password)
		{
			System.out.println("Password Matched ! You can play the game");
			System.out.println("Player1 kindly guess the number");
			guessNum=scan.nextInt();
		}
		else
		{
			System.out.println("incorrect password");
			guessNum();
			
		}
		if(guessNum>9 || guessNum<0)
		{
			System.out.println("Please Guess the number between 1-9");
			guessNum();
			
		}
	   return guessNum;
	}
}

//-----------------------------------------------------

class Player2
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		int Password=2345;
		System.out.println("Player 2 Please Enter valid the Password ");
		int Pword=scan.nextInt();
		if(Pword==Password)
		{
			System.out.println("Password Matched ! You can play the game");
			System.out.println("Player2 kindly guess the number");
			guessNum=scan.nextInt();
		}
		else
		{
			System.out.println("incorrect password");
			guessNum();
			
		}
		if(guessNum>9 || guessNum<0)
		{
			System.out.println("Please Guess the number between 1-9");
			guessNum();
			
		}
		return guessNum;
	}
}
//----------------------------------------------------------------------------
class Player3
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		int Password=3456;
		System.out.println("Player 3 Please Enter valid the Password ");
		int Pword=scan.nextInt();
		if(Pword==Password)
		{
			System.out.println("Password Matched ! You can play the game");
			System.out.println("Player3 kindly guess the number");
			guessNum=scan.nextInt();
		}
		else
		{
			System.out.println("incorrect password");
			guessNum();
			
		}
		if(guessNum>9 || guessNum<0)
		{
			System.out.println("Please Guess the number between 1-9");
			guessNum();
			
		}
		return guessNum;
	}
}
//------------------------------------------------------------------------

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayer1()
	{
		Player1 p1=new Player1();
		numFromPlayer1=p1.guessNum();
	}
	void collectNumFromPlayer2()
	{
		Player2 p2=new Player2();
		numFromPlayer2=p2.guessNum();
	}
	void collectNumFromPlayer3()
	{
		Player3 p3=new Player3();
		numFromPlayer3=p3.guessNum();
	}
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All players won the game, Play Again!");

				
				collectNumFromGuesser();
				collectNumFromPlayer1();
				collectNumFromPlayer2();
				collectNumFromPlayer3();
				compare();
	
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				System.out.println("Player 1 & Player2 won,Please play the game again");
				collectNumFromGuesser();
				collectNumFromPlayer1();
				collectNumFromPlayer2();
				compare();
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 & Player3 won, Please play the game Again");
				collectNumFromGuesser();
				collectNumFromPlayer1();
				collectNumFromPlayer3();
				compare();
			}
			else
			{
			System.out.println("Player 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player3 won, Please play the game Again!");
				
				collectNumFromGuesser();
				collectNumFromPlayer2();
				collectNumFromPlayer3();
				compare();
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			
			System.out.println("All 3 Players lost the game and the Guesser's number is "+ this.numFromGuesser);
		}
		
	}
	
}

public class Guesser_Game {

	public static void main(String[] args) {
		
			Umpire u=new Umpire();
			u.collectNumFromGuesser();
			u.collectNumFromPlayer1();
			u.collectNumFromPlayer2();
			u.collectNumFromPlayer3();
			u.compare();

	}

}
