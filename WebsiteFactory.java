
public class WebsiteFactory {
	
	public static Website getWebsite(WebsiteType site) {
		
		switch(site) {
		case BLOG : {
			return new Blog();
		}
		
		case SHOP : {
			return new Shop();
		}
		
		default : {
			return null;
		}
	  }
	}

}
