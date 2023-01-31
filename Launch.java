public class Launch implements UserInput{

	public static void main(String[] args) {
		Umpire umpire=new Umpire();
		boolean PhirseKhelnaHai=true;
		int check=1;
		while (PhirseKhelnaHai==true) {
			umpire.getFromGuesser();
			umpire.getFromPlayer();
			umpire.compare();
			System.out.println("Phirse khelna hai ?('1' for yes/'0' for no)");
			check=scan.nextInt();
			if(check==1) {
				PhirseKhelnaHai=true;
				System.out.println("Khelo phir.... ");
			}
			else if(check==0) {
				PhirseKhelnaHai=false;
				System.out.println("Game stopped ....");
			}
			else {
				PhirseKhelnaHai=false;
				System.out.println("Wrong input ....still closing  ..");
			}			
		}
	}
}
