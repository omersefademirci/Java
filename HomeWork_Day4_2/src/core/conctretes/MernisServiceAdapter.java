package core.conctretes;

import core.abstracts.GamerCheckService;
import entities.conctretes.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService{

	@Override
	public boolean checkIfRealGamer(Gamer gamer) {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean result=false;
		try 
		{
			result = proxy.TCKimlikNoDogrula(Long.parseLong(gamer.getNationaltyId()),gamer.getFirstName().toUpperCase(),gamer.getLastName().toUpperCase(), gamer.getDateOfBirth().getYear());		
		} 
		catch (Exception e) 
		{
			System.out.println("Not a valid gamer");
		}
		return result;
	}
	}


