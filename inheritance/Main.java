package inheritance;

public class Main {

	public static void main(String[] args) {
		�nvidualCustomer customer1=new �nvidualCustomer();
		customer1.customerNumber="12345";
		
		CorporateCustomer hepsiburada=new CorporateCustomer();
		hepsiburada.customerNumber="79898";
		
		CorporateCustomer hepsiburada1=new CorporateCustomer();
		hepsiburada1.customerNumber="7982398";
		
		CustomerManager customerManager=new CustomerManager();
		
		Customer[] customers= {customer1,hepsiburada,hepsiburada1};
		
		customerManager.addMultiple(customers);
		
		
		

	}

}
