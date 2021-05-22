package business.abstracts;

import entities.conctretes.Campaign;


public interface CampaignService {
	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);

}
