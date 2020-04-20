
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double itemPrice = 23.50;
		double moneyInWallet = 50.36;
		short numOfFriends = 5;
		short age = 25;
		String firstName = "Elroy";
		String lastName = "Kaloomber";
		char midInit = 'A';
		
		double newAmnt = moneyInWallet - itemPrice;
		int friendsOverTime = age / numOfFriends;
		String fullName = firstName + " " + midInit + " " + lastName;
		System.out.println("The money I have in my wallet after buying that item is $" + newAmnt);
		System.out.println("The Friends I have gotten every five years is " + friendsOverTime);
		System.out.println("My full name is " + fullName);
	}

}
