package interfaces;

public class CustomerMenager {
	private Logger[] loggers;
	
	public CustomerMenager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Müþteri eklendi : "+customer.getFirstName()+" "+customer.getLastName());
		Utils.runLoggers(loggers, customer.getFirstName());
		
	}
	
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi : "+customer.getFirstName()+" "+customer.getLastName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	
	
	

}
