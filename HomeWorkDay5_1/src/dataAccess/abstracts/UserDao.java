package dataAccess.abstracts;

import java.util.List;


import entites.conctretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	boolean getverification(String email,String password);
	User getByEmail(String email);
	List<User> getAll();
	
	
	

}
