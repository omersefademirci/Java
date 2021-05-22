package core.conctretes;
import java.util.regex.*;
import java.util.regex.Matcher;

public class EmailValidation {

	public static boolean emailValidate(String email) {
		String regex = "^(?=.{1,64}@)[\\p{L}0-9_-]+(\\.[\\p{L}0-9_-]+)*@"
	            + "[^-][\\p{L}0-9-]+(\\.[\\p{L}0-9-]+)*(\\.[\\p{L}]{2,})$";

		Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

		System.out.println(email + " : " + matcher.matches());
		return matcher.matches();
		
		

	}
}
