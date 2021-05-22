package core.abstracts;

import entites.conctretes.User;

public interface GoogleLoginService {
	User login(String email,String password);
	void register(String email,String password);
	
	

}
