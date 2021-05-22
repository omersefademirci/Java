import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;

import Concrete.StarbucksCustomerManager;
import Entitities.Customer;


public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Ömer Sefa","Demirci",LocalDate.of(2001, 03, 26),"29149789324"));
		
	}

}
