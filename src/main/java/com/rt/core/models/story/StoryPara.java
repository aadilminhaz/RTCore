package com.rt.core.models.story;

public class StoryPara {

	private String storyParaId;
	private String paraTitle;
	private String paraImage;
	private String paraText;
	
	public StoryPara(){}
	
	public StoryPara(String storyParaId, String paraTitle, String paraImage,
			String paraText) {
		this.storyParaId = storyParaId;
		this.paraTitle = paraTitle;
		this.paraImage = paraImage;
		this.paraText = paraText;
	}
	
	public String getstoryParaId() {
		return storyParaId;
	}
	public void setStoryParaId(String storyParaId) {
		this.storyParaId = storyParaId;
	}
	public String getParaTitle() {
		return paraTitle;
	}
	public void setParaTitle(String paraTitle) {
		this.paraTitle = paraTitle;
	}
	public String getParaImage() {
		return paraImage;
	}
	public void setParaImage(String paraImage) {
		this.paraImage = paraImage;
	}
	public String getParaText() {
		return paraText;
	}
	public void setParaText(String paraText) {
		this.paraText = paraText;
	}
}
