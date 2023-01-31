public class Guesser implements UserInput {
	int guessedNum;
	public int guessNumber() {
		int r;
		r=(int)(Math.random()*11);
		System.out.println("Number is from 0 to 10 ");
		return r;		
	}
}
