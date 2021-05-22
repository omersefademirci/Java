package business.conctretes;

import business.abstracts.SaleService;
import entities.conctretes.Campaign;
import entities.conctretes.Sale;

public class SaleManager implements SaleService{


	@Override
	public void add(Sale sale) {
		System.out.println("Say�n "+
							sale.getGamer().getFirstName()+
							" "+
							sale.getGamer().getLastName()+
							". "+
							sale.getGame().getGameName()+
							" adl� oyunu "+
							sale.getGame().getGamePrice()+
							" TL'ye sat�n ald�n�z.");
		
	}
	public void add(Sale sale,Campaign campaign) {
		float price = sale.getGame().getGamePrice()-sale.getGame().getGamePrice()*campaign.getCampaginPriceRatio()/100;
		System.out.println("Say�n "+
							sale.getGamer().getFirstName()+
							" "+
							sale.getGamer().getLastName()+
							". "+
							sale.getGame().getGameName()+
							" adl� oyunu "+
							campaign.getCampaignName()+
							" Kampanyas� "+
							campaign.getCampaginPriceRatio()+
							" indirim oran� ile "+
							price+
							" TL'ye sat�n ald�n�z.");
		
	}
	

}
