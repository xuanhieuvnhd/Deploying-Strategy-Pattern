public class Main {
	public static void main(String[] args) {
		User user = new User("Hieu", 36);
		UserController userController = new UserController(new XMLStorage());
		userController.store(user);

		userController = new UserController(new MySQLStorage());
		userController.store(user);
	}
}
