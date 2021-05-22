import business.abstracts.UserService;
import business.concretes.UserMenager;
import core.abstracts.GoogleLoginService;
import core.conctretes.GoogleEmailMenager;
import core.conctretes.GoogleLoginMenager;
import dataAccess.conctretes.HibarnateUserDao;
import entites.conctretes.User;

public class Main {

	public static void main(String[] args) {
		GoogleLoginService googleLogin=new GoogleLoginMenager();
		UserService userService=new UserMenager(new HibarnateUserDao(),new GoogleEmailMenager());
		User user1=new User();
		User user2=new User(2,"Metehan","Gokay","metehan_gokay@gmail.com","1597844");
		User user3=new User(3,"Onur","Gokay","metehan_gokay@gmail.com","1597893");
		user1.setId(1);
		user1.setFirstName("Ömer Sefa");
		user1.setLastName("Demirci");
		user1.setEmail("sefa-demirci@outlook.com");
		user1.setPassword("123456");
		userService.add(user1);
		System.out.println("\n*******************\n");
		userService.add(user2);
		System.out.println("\n*******************\n");
		userService.add(user3);
		System.out.println("\n*******************\n");
		googleLogin.register("sefa-demirci@outlook.com", "123456");
		System.out.println("\n*******************\n");
		
		userService.login("sefa-demirci@outlook.com", "12345644");
		
	}

}
