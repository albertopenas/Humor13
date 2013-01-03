package es.softwhisper.christmas.model;


public class JokeModel {
	private String title = null;
	private String type = null;
	private String phrase = null;
	
	public JokeModel(String title, String type, String phrase){
		this.title = title;
		this.type = type;
		this.phrase = phrase;
	}
	
	public String getType() {
		return type;
	}
	public String getPhrase() {
		return phrase;
	}
	public String getTitle() {
		return title;
	}

}
