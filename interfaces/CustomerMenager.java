package interfaces;

public class CustomerMenager {
	private Logger[] loggers;
	
	public CustomerMenager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("M��teri eklendi : "+customer.getFirstName()+" "+customer.getLastName());
		Utils.runLoggers(loggers, customer.getFirstName());
		
	}
	
	public void delete(Customer customer) {
		System.out.println("M��teri silindi : "+customer.getFirstName()+" "+customer.getLastName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	
	
	

}
