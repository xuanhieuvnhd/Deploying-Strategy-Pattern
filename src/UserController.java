public class UserController {
	UserStorage userStorage;
	public UserController(UserStorage userStorage){
		this.userStorage = userStorage;
	}
	public void store(User user){
		userStorage.store(user);
	}
}
