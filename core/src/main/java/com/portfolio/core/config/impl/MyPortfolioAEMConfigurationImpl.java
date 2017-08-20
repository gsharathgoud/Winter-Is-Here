package com.portfolio.core.config.impl;

import java.util.Map;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Modified;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.PropertyUnbounded;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.commons.osgi.PropertiesUtil;

import com.portfolio.core.config.MyPortfolioAEMConfiguration;

@Component(
        metatype = true,
        immediate = true,
        label = "My Portfolio AEM Configuration",
        description = "Configuration point for My Portfolio AEM Integration"
)
@Service
@Properties(value = {
    @Property(name = "com.portfolio.core.config.aemconfig.host",
            label = "My Portfolio AEM Host Name",
            description = "The hostname of Portfolio website (i.e sharathgoud.com)",
            value = "new.sharathgoud.com"),
})
public class MyPortfolioAEMConfigurationImpl implements MyPortfolioAEMConfiguration {

    private String MY_PORTFOLIO_HOST_NAME;
    @Activate
    @Modified
    protected void update(final Map<String, Object> properties) {
        MY_PORTFOLIO_HOST_NAME = PropertiesUtil.toString(properties.get("com.portfolio.core.config.aemconfig.host"), "new.sharathgoud.com");
    }
    
	@Override
	public String getMyPortfolioHostName() {
		// TODO Auto-generated method stub
		return MY_PORTFOLIO_HOST_NAME;
	}
    
}
