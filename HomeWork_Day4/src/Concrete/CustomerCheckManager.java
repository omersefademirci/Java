package Concrete;

import Abstract.CustomerCheckService;

import Entitities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfReaLPerson(Customer customer) {
		
		return true;
		
		
	}
	
	

}
