package com.portfolio.core.utils;

import java.util.HashMap;
import java.util.Map;

import com.adobe.cq.sightly.WCMUsePojo;

public class RequestUtils extends WCMUsePojo {
	
	    private Map<String, Object> attributes;
	    
	    @Override
	    public void activate() throws Exception {
	        attributes = new HashMap<String, Object>();
	        String attributeName = get("attributeName", String.class);
	        attributes.put(attributeName, getRequest().getAttribute(attributeName));
	    }
	    
	    public Object getAttributes() {
	        return attributes;
	    }
}
