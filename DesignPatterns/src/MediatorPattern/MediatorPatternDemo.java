package MediatorPattern;

public class MediatorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  User robert = new User("Kunal");
	      User john = new User("Lokesh");

	      robert.sendMessage("Hi! Lokesh!");
	      john.sendMessage("Hello! Kunal!");
		
	}

}
