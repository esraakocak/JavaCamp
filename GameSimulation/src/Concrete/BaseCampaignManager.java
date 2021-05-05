package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;


public abstract class BaseCampaignManager implements CampaignService{
	
	public void save(Campaign campaign) {
		System.out.println("campaign added :" +campaign.CampaignName);
	}
	
	public void delete(Campaign campaign) {
		System.out.println("campaign deleted :" +campaign.CampaignName);
	}
	
	public void update(Campaign campaign) {
		System.out.println("campaign update:" +campaign.CampaignName);
	}

}
