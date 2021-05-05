package Entities;

public class Campaign {
	public  int id;
	public  String CampaignName;
	public  String CampaignType;
	
	  
	  
	public Campaign( ) {
		
	}
	
	public Campaign(int id, String campaignName, String campaignType) {
		super();
		this.id = id;
		CampaignName = campaignName;
		CampaignType = campaignType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return CampaignName;
	}
	public void setCampaignName(String campaignName) {
		CampaignName = campaignName;
	}
	public String getCampaignType() {
		return CampaignType;
	}
	public void setCampaignType(String campaignType) {
		CampaignType = campaignType;
	}

}
