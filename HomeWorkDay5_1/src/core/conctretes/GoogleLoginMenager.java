package core.conctretes;

import core.abstracts.GoogleLoginService;
import dataAccess.abstracts.UserDao;
import entites.conctretes.User;

public class GoogleLoginMenager implements GoogleLoginService{

	UserDao userDao;
	
	@Override
	public User login(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void register(String email, String password) {
		
		System.out.println("registered with google");
	}

	
}
