package es.softwhisper.christmas.model;

public class MediaModel {
	private String title = null;
	private String type = null;
	private String url = null;
	
	public MediaModel() {
	}
	
	public MediaModel(String title, String url, String type){
		this.title = title;
		this.url = url;
		this.type = type;
	}
	
	public String getTitle() {
		return title;
	}
	public String getUrl() {
		return url;
	}
	public String getType() {
		return type;
	}
}
