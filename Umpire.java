public class Umpire {
	int guessFromGuesser;
	int guessFromP1;
	int guessFromP2;
	int guessFromP3;
	
	void getFromGuesser() {
		Guesser g=new Guesser();
		guessFromGuesser= g.guessNumber();
	}
	void getFromPlayer() {
		Player P1=new Player();
		Player P2=new Player();
		Player P3=new Player();
		guessFromP1= P1.guessNumber();
		guessFromP2= P2.guessNumber();
		guessFromP3= P3.guessNumber();
	}
	void compare() {
		if(guessFromGuesser==guessFromP1) {
			System.out.println("Player 1 guessed correctly ");
		}
		if(guessFromGuesser==guessFromP2) {
			System.out.println("Player 2 guessed correctly ");
		}
		if(guessFromGuesser==guessFromP3) {
			System.out.println("Player 3 guessed correctly ");
		}
		if(		guessFromGuesser!=guessFromP1 &&
				guessFromGuesser!=guessFromP2 &&
				guessFromGuesser!=guessFromP3) {
			System.out.println("Phirse khelo yaar.. sab galat hai ");
		}
	}
}
