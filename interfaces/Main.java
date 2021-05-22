package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers= {new DataBaseLogger(),new SmsLogger(),new FileLogger()};
		
		CustomerMenager customerMenager =new CustomerMenager(loggers);
		
		Customer sefa =new Customer(1,"Sefa","Demirci");
		
		
		customerMenager.add(sefa);

	}

}
