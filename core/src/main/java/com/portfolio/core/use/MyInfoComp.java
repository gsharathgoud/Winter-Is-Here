package com.portfolio.core.use;

import com.adobe.cq.sightly.WCMUsePojo;
import com.day.cq.search.PredicateGroup;
import com.day.cq.search.Query;
import com.day.cq.search.QueryBuilder;
import com.day.cq.search.result.SearchResult;
import com.day.cq.tagging.Tag;
import com.day.cq.tagging.TagManager;
  
import com.portfolio.core.use.MyPortfolioBean;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
  
 
import javax.jcr.Node;
import javax.jcr.Session;
  
 
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyInfoComp extends WCMUsePojo {
	 
    /** The my info bean. */
   private MyPortfolioBean myPortfolioBean = null;
     
   @Override
   public void activate() throws Exception {
        
	   myPortfolioBean = new MyPortfolioBean();
         	
	   myPortfolioBean.setMyName(getProperties().get("myName", ""));
       
	   myPortfolioBean.setTyping(getProperties().get("typing", ""));
       	     
	   myPortfolioBean.setExperience(getProperties().get("experience", ""));
       	     
	   myPortfolioBean.setEmailAddress(getProperties().get("emailAddress", ""));	        
     
	   myPortfolioBean.setTwitter(getProperties().get("twitter", ""));
              
	   myPortfolioBean.setGoogle(getProperties().get("google", ""));
       	       
	   myPortfolioBean.setLinkedin(getProperties().get("linkedin", ""));        
         
   }
                 
   public MyPortfolioBean getMyPortfolioBean() {
       return this.myPortfolioBean;
   }
}
