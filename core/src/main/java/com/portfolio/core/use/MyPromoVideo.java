package com.portfolio.core.use;

import com.adobe.cq.sightly.WCMUsePojo;
import com.portfolio.core.video.*;

public class MyPromoVideo extends WCMUsePojo {
    
	@Override
	public void activate() throws Exception {
		PromoVideo promoVideo = PromoVideoEmbedded.getPromoVideoUrl(getProperties().get("myUrl", ""));
	    if (promoVideo != null) {
	        getRequest().setAttribute("embeddedUrl",promoVideo.getEmbeddedLink());
	    }	
	}
	
	public Object getEmbeddedUrl() {
		return getRequest().getAttribute("embeddedUrl");
	}

}
