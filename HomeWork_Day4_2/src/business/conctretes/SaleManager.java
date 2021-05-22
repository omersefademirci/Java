package business.conctretes;

import business.abstracts.SaleService;
import entities.conctretes.Campaign;
import entities.conctretes.Sale;

public class SaleManager implements SaleService{


	@Override
	public void add(Sale sale) {
		System.out.println("Sayýn "+
							sale.getGamer().getFirstName()+
							" "+
							sale.getGamer().getLastName()+
							". "+
							sale.getGame().getGameName()+
							" adlý oyunu "+
							sale.getGame().getGamePrice()+
							" TL'ye satýn aldýnýz.");
		
	}
	public void add(Sale sale,Campaign campaign) {
		float price = sale.getGame().getGamePrice()-sale.getGame().getGamePrice()*campaign.getCampaginPriceRatio()/100;
		System.out.println("Sayýn "+
							sale.getGamer().getFirstName()+
							" "+
							sale.getGamer().getLastName()+
							". "+
							sale.getGame().getGameName()+
							" adlý oyunu "+
							campaign.getCampaignName()+
							" Kampanyasý "+
							campaign.getCampaginPriceRatio()+
							" indirim oraný ile "+
							price+
							" TL'ye satýn aldýnýz.");
		
	}
	

}
