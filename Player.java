public class Player implements UserInput {
	int guessedNum;
	public int guessNumber() {
		System.out.println("Hay Player! guess number quickly ");
		return scan.nextInt();	
	}
}
