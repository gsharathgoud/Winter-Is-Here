use(function () {

    var aemConfig = sling.getService(Packages.com.portfolio.core.config.MyPortfolioAEMConfiguration);
	return { 
        hostName: aemConfig.getMyPortfolioHostName()
    }
    
});