package Adapter;

import Abstract.CustomerCheckService;
import Entitities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{



	@Override
	public boolean checkIfReaLPerson(Customer customer) {
		
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean result=false;
		try 
		{
			result = proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationality()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());		
		} 
		catch (Exception e) 
		{
			System.out.println("Not a valid person");
		}
		return result;
	}
	

}
