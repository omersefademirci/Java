package dataAccess.conctretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entites.conctretes.User;

public class HibarnateUserDao implements UserDao{

	private List<User> users=new ArrayList<User>();
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println(user.getFirstName()+" "+user.getLastName()+" : "+"successfully registered in the system");
		
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		System.out.println(user.getFirstName()+" "+user.getLastName()+" : "+"successfully deleted from the system\r\n"
				+ "");
		
	}

	@Override
	public void update(User user) {
		System.out.println("Successfully updated from the system");
		
	}

	@Override
	public User getByEmail(String email) {
		for (User user : users) {
			if(user.getEmail()==email) {
				System.out.println("email var");
				//user exists in the system
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}

	@Override
	public boolean getverification(String email, String password) {
		for (User user : users) {
			if(user.getEmail()==email && user.getPassword()==password) {	
				return true;
			}
		}
		return false;
		
	}

}
