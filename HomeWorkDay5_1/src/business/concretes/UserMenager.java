package business.concretes;


import business.abstracts.UserService;
import entites.conctretes.User;
import java.util.regex.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import core.abstracts.GoogleEmailService;
import core.conctretes.*;
import dataAccess.abstracts.*;

public class UserMenager implements UserService{

	private UserDao userDao;
	private GoogleEmailService googleEmailService;
	
	//userdao= database address
	public UserMenager(UserDao userDao,GoogleEmailService googleEmailService) {
		this.googleEmailService=googleEmailService;
		this.userDao=userDao;
	}
	
	@Override
	public void add(User user) {
		//name character check
		var name=nameControl(user);
		//password character check
		var password=passwordControl(user);
		
		var mail=EmailValidation.emailValidate(user.getEmail());
		
		var mailcheck=getByMail(user.getEmail());
		
		if(name && password && mail && mailcheck==null) {
			userDao.add(user);
			System.out.println("Added");
			googleEmailService.send(user);
		
		}else {
			System.out.println("could not be added");
		}
		
		
		
			
	}
		
	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void register(User user) {
		
	}
	@Override
	public User getByMail(String email) {
		return userDao.getByEmail(email);
	}
	
	
	private boolean nameControl(User user) {
		if(user.getFirstName().length()>=2 && user.getLastName().length()>=2) {
			System.out.println("FirstName and LastName accepted");
			return true;
		}
		System.out.println("Name and surname must contain at least two characters.");

		return false;
	}
	private boolean passwordControl(User user) {
		//strRegEx= password character check(least character)
		
		if(user.getPassword().length()>=6) {
			System.out.println("Password accepted");
			//if the password is correct
			return true;
		}else{
			//if the password is wrong
			System.out.println("Password must be at least 6 characters.");
			return false;
		}
		
	}

	@Override
	public void login(String email, String password) {	
			if(userDao.getverification(email, password)) {
				System.out.println("Logged in"+" : "+email);
			}else {
				System.out.println("Could not login");
			}
	}

	
	
	

}
