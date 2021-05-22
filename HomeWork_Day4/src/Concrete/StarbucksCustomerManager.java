package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entitities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfReaLPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Not a valid person");
		}
		
	}
	

}
