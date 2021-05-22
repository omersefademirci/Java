package entities.conctretes;

public class Campaign {
	private int id;
	private String campaignName;
	private int campaginPriceRatio;
	
	public Campaign() {
		this.campaginPriceRatio=0;
		this.campaignName=" ";
		this.id=0;
	}
	public Campaign(int id, String campaignName, int campaginPriceRatio) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.campaginPriceRatio = campaginPriceRatio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public int getCampaginPriceRatio() {
		return campaginPriceRatio;
	}
	public void setCampaginPriceRatio(int campaginPriceRatio) {
		this.campaginPriceRatio = campaginPriceRatio;
	}

}
