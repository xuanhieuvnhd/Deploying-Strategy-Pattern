public class XMLStorage implements UserStorage {
	@Override
	public void store(User user) {
		// save to XML
		System.out.println("User: " + user.getName() + ", save to XML");
	}
}
