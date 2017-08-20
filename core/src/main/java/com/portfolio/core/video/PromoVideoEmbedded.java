package com.portfolio.core.video;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PromoVideoEmbedded {

	public PromoVideoEmbedded(){
		
	}
	
	private static Logger LOGGER = LoggerFactory.getLogger(PromoVideoEmbedded.class);
	
	public static PromoVideo getPromoVideoUrl(String youtubeUrl){
		 if (youtubeUrl.isEmpty() || youtubeUrl == null) return null;
		 Pattern pattern = Pattern.compile(
				 ".*\\?(.*)",
	                Pattern.CASE_INSENSITIVE);
		 Matcher matcher = pattern.matcher(youtubeUrl);
		 String all = "";
		 if (matcher.matches()) {
			 all = matcher.group(1);
		 }
		 String[] parameters = all.split("&");
		 HashMap<String, String> parametersMap = new HashMap<String, String>();
		 for (String parameter : parameters) {
			 String[] split = parameter.split("=");
			 parametersMap.put(split[0], split[1]);
		 }
		 if (parametersMap.size() > 0) {
			 if (parametersMap.keySet().contains("v") && parametersMap.keySet().contains("list")) {
				 return new PromoVideo(parametersMap.get("v"), parametersMap.get("list"), PromoVideoType.HYBRID);
			 }
			 else if (parametersMap.keySet().contains("list")) {
				 return new PromoVideo(null, parametersMap.get("list"), PromoVideoType.PLAYLIST);
			 }
			 else if (parametersMap.keySet().contains("v")) {
				 return new PromoVideo(parametersMap.get("v"), null, PromoVideoType.VIDEO);
			 }
			 else {
				 return null;
			 }
		 } else {
			 return null;
		 }		 
	}
}
