package com.portfolio.core.video;

public class PromoVideo {
	private PromoVideoType type;
	private String videoId;
	private String listId;
	
	public PromoVideo(String videoId, String listId, PromoVideoType type) {
		this.type = type;
		this.videoId = videoId;
		this.listId = listId;
	}
	
	public String getEmbeddedLink() {
		if(this.type.equals(PromoVideoType.PLAYLIST)) {
			return "https://www.youtube.com/embed/?list=" + this.listId +"?rel=0&autoplay=1";
		} else if(this.type.equals(PromoVideoType.VIDEO)) {
			return "https://www.youtube.com/embed/" + this.videoId +"?rel=0&autoplay=1";
		}
		else {
			return "https://www.youtube.com/embed/" + this.videoId + "?list=" + this.listId + "&rel=0&autoplay=1";
		}
	}
	
	public String getVideoId() {
        return videoId;
    }
	
}
