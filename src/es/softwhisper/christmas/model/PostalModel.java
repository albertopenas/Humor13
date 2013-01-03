package es.softwhisper.christmas.model;

public class PostalModel {
	private String title = null;
	private String category = null;
	private String image = null;
	
	public PostalModel() {
	}
	
	public PostalModel(String title, String category, String image) {
		this.title = title;
		this.category = category;
		this.image = image;
	}
	
	public String getImage() {
		return image;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
}
