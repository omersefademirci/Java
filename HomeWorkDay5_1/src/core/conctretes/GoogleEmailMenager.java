package core.conctretes;

import core.abstracts.GoogleEmailService;
import entites.conctretes.User;

public class GoogleEmailMenager implements GoogleEmailService{

	@Override
	public void send(User user) {
		System.out.println("verification email sent");
		
	}

}
