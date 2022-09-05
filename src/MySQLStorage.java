public class MySQLStorage implements UserStorage {
	@Override
	public void store(User user) {
		// save to SQL
		System.out.println("User: " + user.getName() + ", save to SQL");
	}
}
