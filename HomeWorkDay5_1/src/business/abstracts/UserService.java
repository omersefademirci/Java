package business.abstracts;

import entites.conctretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update(User user);
	void register(User user);
	void login(String email,String password);
	User getByMail(String email);

}
