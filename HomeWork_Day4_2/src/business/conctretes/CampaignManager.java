package business.conctretes;

import business.abstracts.CampaignService;
import entities.conctretes.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		if(!(campaign.getCampaignName()=="") && !(campaign.getCampaginPriceRatio()==0)) {
			System.out.println("Kampanya eklendi");
		}else {
			System.out.println("Girdiginiz Bilgiler Eksik");
		}
		
	}

	@Override
	public void delete(Campaign campaign) {
		if(!(campaign.getCampaignName()=="") && !(campaign.getCampaginPriceRatio()==0)) {
			System.out.println("Kampyana Silindi");
		}else {
			System.out.println("Girdiginiz Bilgiler Eksik");
		}
		
	}

	@Override
	public void update(Campaign campaign) {
		if(!(campaign.getCampaignName()=="") && !(campaign.getCampaginPriceRatio()==0)) {
			System.out.println("Kampyana Güncellendi");
		}else {
			System.out.println("Girdiginiz Bilgiler Eksik");
		}
		
	}

}
